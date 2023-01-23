import React, {useEffect, useState} from 'react'
import {Card} from "antd";
import { DualAxes } from '@ant-design/plots';
import PropTypes from "prop-types";
import {selectAuthInfo} from "../../redux/selectors/authSelectors";
import {callAveragePortletStartAction, coveragePortletStartAction} from "../../redux/actions/portlet/portletActions";
import {connect} from "react-redux";
import {selectCallAverages, selectCoverages} from "../../redux/selectors/portletSelectors";
import {toMonthYear} from "../../utils/DateUtils";
import {Pie} from "@ant-design/charts";

const NoOfFieldDaysPortlet = ({locationId, fromYearMonth, toYearMonth, refreshTime, handleInitPortlet, callAverages, authInfo}) => {

    const data = [
        {
            type: 'Non Calls',
            value: 27,
        },
        {
            type: 'Holidays',
            value: 1,
        },
        {
            type: 'Calls',
            value: 18,
        }
    ];
    const config = {
          width: 10,
        appendPadding: 10,
        data,
        angleField: 'value',
        colorField: 'type',
        radius: 0.6,
        label: {
            type: 'inner',
            offset: '-30%',
            content: ({ percent }) => `${(percent * 100).toFixed(0)}%`,
            style: {
                fontSize: 14,
                textAlign: 'center',
            },
        },
        interactions: [
            {
                type: 'element-active',
            },
        ],
    };

    return <Card className={'card-form'} title={'# Of Field Days'}>
        <Pie {...config} />
    </Card>;
}

NoOfFieldDaysPortlet.propTypes = {
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


export default connect(mapState, actions)(NoOfFieldDaysPortlet)

