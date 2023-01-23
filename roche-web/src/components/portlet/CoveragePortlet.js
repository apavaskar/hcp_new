import React, {useEffect, useState} from 'react'
import {Card} from "antd";
import { DualAxes } from '@ant-design/plots';
import PropTypes from "prop-types";
import {selectAuthInfo} from "../../redux/selectors/authSelectors";
import {coveragePortletStartAction} from "../../redux/actions/portlet/portletActions";
import {connect} from "react-redux";
import {selectCoverages} from "../../redux/selectors/portletSelectors";
import {toMonthYear} from "../../utils/DateUtils";

const CoveragePortlet = ({locationId, fromYearMonth, toYearMonth, refreshTime, handleInitPortlet, coverages, authInfo}) => {

    const [selectedData,setSelectedData]=useState([])
    const [selectedTransData, setSelectedTransData] = useState([])
    useEffect(()=> {
        if (authInfo===null) return
        handleInitPortlet({
            toYearMonth: toYearMonth,
            fromYearMonth: fromYearMonth,
            locationId: locationId,
            certificate: authInfo.certificate
        })
    },[authInfo,refreshTime])

    useEffect(()=> {
        const uvData = coverages.overall.map(d => {return {time: toMonthYear(d.yearMonth), OVERALL: Number((d.visitedCount / d.totalCount * 100).toFixed(1))}});
        const data = coverages.byTypes.map(d => {return {time: toMonthYear(d.yearMonth), count:Number ((d.visitedCount / d.totalCount * 100).toFixed(1)), name: d.type.name}});
        console.log(uvData)
        setSelectedData(uvData)
        setSelectedTransData(data)
    },[coverages])

    const config = {
        data: [selectedData, selectedTransData],
        xField: 'time',
        yField: ['OVERALL', 'count'],
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

    return <Card className={'card-form'} title={'% Coverage'}>
        <DualAxes {...config}  autoFit={true} loading={selectedData === undefined}/></Card>;
}

CoveragePortlet.propTypes = {
    authInfo: PropTypes.any,
}

const mapState = (state) => {
    const authInfo = selectAuthInfo(state)
    const coverages = selectCoverages(state)
    return { authInfo, coverages}
}

const actions = {
    handleInitPortlet: coveragePortletStartAction
}


export default connect(mapState, actions)(CoveragePortlet)

