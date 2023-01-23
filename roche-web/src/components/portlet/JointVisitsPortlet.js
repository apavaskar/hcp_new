import React, {useEffect, useState} from 'react'
import {Card} from "antd";
import PropTypes from "prop-types";
import {selectAuthInfo} from "../../redux/selectors/authSelectors";
import {connect} from "react-redux";
import {selectJointVisits} from "../../redux/selectors/portletSelectors";
import {toMonthYear} from "../../utils/DateUtils";
import {jointVisitPortletStartAction} from "../../redux/actions/portlet/portletActions";
import {Column} from "@ant-design/charts";
import { each, groupBy } from '@antv/util';

const JointVisitsPortlet = ({locationId, fromYearMonth, toYearMonth, refreshTime, handleInitPortlet, jointVisits, authInfo}) => {

    const [selectedData,setSelectedData]=useState([])
    const [selectedTransData, setSelectedTransData] = useState([])
    const [annotations, setAnnotations] = useState([])
    useEffect(()=> {
        if (authInfo===null) return
        handleInitPortlet({
            toYearMonth: toYearMonth,
            fromYearMonth: fromYearMonth,
            locationId: locationId,
            certificate: authInfo.token
        })
    },[authInfo,refreshTime])

    useEffect(()=> {
        let uvData = jointVisits.map(d => {return {time: toMonthYear(d.yearMonth), type: 'Joint', counts: d.jointCalls }});
        uvData = uvData.concat(
            jointVisits.map(d => {return {time: toMonthYear(d.yearMonth), type: 'Individual', counts: d.totalCalls - d.jointCalls}})
        )
        console.log(uvData)
        setSelectedData(uvData)

        const ann = [];
        each(groupBy(uvData, 'time'), (values, k) => {
            const value = values.reduce((a, b) => a + b.counts, 0);
            ann.push({
                type: 'text',
                position: [k, value],
                content: `${value}`,
                style: {
                    textAlign: 'center',
                    fontSize: 14,
                    fill: 'rgba(0,0,0,0.85)',
                },
                offsetY: -10,
            });
        });
        setAnnotations(ann)
    },[jointVisits])

    const config = {
        data: selectedData,
        isStack: true,
        xField: 'time',
        yField: 'counts',
        seriesField: 'type',
        height:300,
        label: {
            position: 'middle',
            layout: [
                {
                    type: 'interval-adjust-position',
                },
                {
                    type: 'interval-hide-overlap',
                },
                {
                    type: 'adjust-color',
                },
            ],
        },
        annotations
    };

    return <Card className={'card-form'} title={'Joint Visits'}>
            <Column {...config} />
        </Card>;
}

JointVisitsPortlet.propTypes = {
    authInfo: PropTypes.any,
}

const mapState = (state) => {
    const authInfo = selectAuthInfo(state)
    const jointVisits = selectJointVisits(state)
    return { authInfo, jointVisits}
}

const actions = {
    handleInitPortlet: jointVisitPortletStartAction
}


export default connect(mapState, actions)(JointVisitsPortlet)

