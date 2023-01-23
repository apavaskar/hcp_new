import React, {useEffect, useState} from 'react'
import {Card} from "antd";
import { DualAxes } from '@ant-design/plots';
import PropTypes from "prop-types";
import {selectAuthInfo} from "../../redux/selectors/authSelectors";
import {callAveragePortletStartAction, coveragePortletStartAction} from "../../redux/actions/portlet/portletActions";
import {connect} from "react-redux";
import {selectCallAverages, selectCoverages} from "../../redux/selectors/portletSelectors";
import {toMonthYear} from "../../utils/DateUtils";

const SalesTargetPortlet = ({locationId, fromYearMonth, toYearMonth, refreshTime, handleInitPortlet, callAverages, authInfo}) => {

    const [selectedData,setSelectedData]=useState([])
    const [selectedTransData, setSelectedTransData] = useState([])


    const config = {
        data: [selectedData, selectedTransData],
        xField: 'time',
        yField: ['value', 'value'],
        height:300,
        geometryOptions: [
            {
                geometry: 'line',
                seriesField: 'type',
            },
            {
                geometry: 'column',
                seriesField: 'type',
                columnWidthRatio: 0.4,
                isGroup: true
            },
        ],
    };

    return <Card className={'card-form'} title={'Sales and Target'}>
        <DualAxes {...config} />
    </Card>;
}

SalesTargetPortlet.propTypes = {
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


export default connect(mapState, actions)(SalesTargetPortlet)

