import React, {useEffect, useState} from 'react'
import {Card} from "antd";
import { DualAxes } from '@ant-design/plots';
import PropTypes from "prop-types";
import {selectAuthInfo} from "../../redux/selectors/authSelectors";
import {orderInvoicePortletStartAction} from "../../redux/actions/portlet/portletActions";
import {connect} from "react-redux";
import {selectOrderInvoices} from "../../redux/selectors/portletSelectors";
import {toMonthYear} from "../../utils/DateUtils";

const OrderInvoicesPortlet = ({locationId, fromYearMonth, toYearMonth, refreshTime, handleInitPortlet, orderInvoices, authInfo}) => {

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
        if (orderInvoices.length !== 0) {
            let uvData = orderInvoices.map(d => {
                return {time: toMonthYear(d.yearMonth), type: '# Invoice', value: d.numInvoices}
            });
            uvData = uvData.concat(orderInvoices.map(d => {
                return {time: toMonthYear(d.yearMonth), type: '# Orders', value: d.numOrders}
            }))
            let data =  orderInvoices.map(d => {
                return {time: toMonthYear(d.yearMonth), type: 'Invoice Amount', value: d.invoiceValue.toFixed(2)}
            });
            data = data.concat( orderInvoices.map(d => {
                return {time: toMonthYear(d.yearMonth), type: 'Order Amount', value: d.orderValue.toFixed(2)}
            }));
            console.log(data)
            setSelectedData(uvData)
            setSelectedTransData(data)
        }
    },[orderInvoices])

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

    return <Card className={'card-form'} title={'Order And Invocies'}>
        <DualAxes {...config} />
        </Card>;
}

OrderInvoicesPortlet.propTypes = {
    authInfo: PropTypes.any,
}

const mapState = (state) => {
    const authInfo = selectAuthInfo(state)
    const orderInvoices = selectOrderInvoices(state)
    return { authInfo, orderInvoices}
}

const actions = {
    handleInitPortlet: orderInvoicePortletStartAction
}


export default connect(mapState, actions)(OrderInvoicesPortlet)

