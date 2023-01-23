import React, {useEffect} from 'react';
import {useSearchParams} from "react-router-dom";
import PropTypes from "prop-types";
import {selectAuthInfo} from "../../redux/selectors/authSelectors";
import {connect} from "react-redux";
import {initPortletStartAction} from "../../redux/actions/portlet/portletActions";
import CoveragePortlet from "./CoveragePortlet";
import CallAveragePortlet from "./CallAveragePortlet";
import JointVisitsPortlet from "./JointVisitsPortlet";
import OrderInvoicesPortlet from "./OrderInvoicesPortlet";
import SalesTargetPortlet from "./SalesTargetPortlet";
import NoOfFieldDaysPortlet from "./NoOfFieldDaysPortlet";

const PortletWrapperComponent = ({authInfo, handleInitPortlet}) => {
    const [searchParams, setSearchParams] = useSearchParams()
    useEffect(()=> {
        let token = searchParams.get("token")
        let userId = searchParams.get("userId")
        handleInitPortlet({
            auth: {token, userId}
        })
    },[])

    if (searchParams.get("portlet")==="coverage") {
        return <CoveragePortlet locationId={searchParams.get("locationId")}
                                fromYearMonth={searchParams.get("fromYearMonth")}
                                toYearMonth={searchParams.get("toYearMonth")}
                                refreshTime={searchParams.get("refreshTime")}/>
    }

    if (searchParams.get("portlet")==="callAverage") {
        return <CallAveragePortlet locationId={searchParams.get("locationId")}
                                fromYearMonth={searchParams.get("fromYearMonth")}
                                toYearMonth={searchParams.get("toYearMonth")}
                                refreshTime={searchParams.get("refreshTime")}/>
    }

    if (searchParams.get("portlet")==="jointVisits") {
        return <JointVisitsPortlet locationId={searchParams.get("locationId")}
                                   fromYearMonth={searchParams.get("fromYearMonth")}
                                   toYearMonth={searchParams.get("toYearMonth")}
                                   refreshTime={searchParams.get("refreshTime")}/>
    }

    if (searchParams.get("portlet")==="noOfFieldDays") {
        return <NoOfFieldDaysPortlet locationId={searchParams.get("locationId")}
                                   fromYearMonth={searchParams.get("fromYearMonth")}
                                   toYearMonth={searchParams.get("toYearMonth")}
                                   refreshTime={searchParams.get("refreshTime")}/>
    }

    if (searchParams.get("portlet")==="orderInvoices") {
        return <OrderInvoicesPortlet locationId={searchParams.get("locationId")}
                                   fromYearMonth={searchParams.get("fromYearMonth")}
                                   toYearMonth={searchParams.get("toYearMonth")}
                                   refreshTime={searchParams.get("refreshTime")}/>
    }

    if (searchParams.get("portlet")==="salesTarget") {
        return <SalesTargetPortlet locationId={searchParams.get("locationId")}
                                   fromYearMonth={searchParams.get("fromYearMonth")}
                                   toYearMonth={searchParams.get("toYearMonth")}
                                   refreshTime={searchParams.get("refreshTime")}/>
    }

}

PortletWrapperComponent.propTypes = {
    authInfo: PropTypes.any,
}

const mapState = (state) => {
    const authInfo = selectAuthInfo(state)
    return { authInfo}
}

const actions = {
    handleInitPortlet: initPortletStartAction
}

export default connect(mapState, actions)(PortletWrapperComponent)

