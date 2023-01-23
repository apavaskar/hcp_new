import React, {useEffect, useState} from 'react'
import {Card} from "antd";
import { DualAxes } from '@ant-design/plots';
import PropTypes from "prop-types";
import {selectAuthInfo} from "../../redux/selectors/authSelectors";
import {callAveragePortletStartAction, coveragePortletStartAction} from "../../redux/actions/portlet/portletActions";
import {connect} from "react-redux";
import {selectCallAverages, selectCoverages} from "../../redux/selectors/portletSelectors";
import {toMonthYear} from "../../utils/DateUtils";

const CallAveragePortlet = ({locationId, fromYearMonth, toYearMonth, refreshTime, handleInitPortlet, callAverages, authInfo}) => {

    const [selectedData,setSelectedData]=useState([])
    const [selectedTransData, setSelectedTransData] = useState([])
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
        const uvData = callAverages.overall.map(d => {return {time: toMonthYear(d.yearMonth), overall: Number((d.visitedCount / 20).toFixed(1))}});
        console.log(uvData)
        const data = callAverages.byTypes.map(d => {return {time: toMonthYear(d.yearMonth), count: Number((d.visitedCount / 20).toFixed(1)), name: d.type.name}});
        setSelectedData(uvData)
        setSelectedTransData(data)
    },[callAverages])

    const config = {
        data: [selectedData, selectedTransData],
        xField: 'time',
        yField: ['overall', 'count'],
        height:300,
        geometryOptions: [
            {
                geometry: 'column',
                columnWidthRatio: 0.4,
            },
            {
                geometry: 'line',
                seriesField: 'name',
            },
        ],
    };

    return <Card className={'card-form'} title={'Call Average'}>
        <DualAxes {...config}  autoFit={true} loading={selectedData === undefined}/></Card>;
}

CallAveragePortlet.propTypes = {
    authInfo: PropTypes.any,
}

const mapState = (state) => {
    const authInfo = selectAuthInfo(state)
    const callAverages = selectCallAverages(state)
    return { authInfo, callAverages}
}

const actions = {
    handleInitPortlet: callAveragePortletStartAction
}


export default connect(mapState, actions)(CallAveragePortlet)

