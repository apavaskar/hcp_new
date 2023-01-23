import {createRequest} from "./httpUtils";
import {CALL_AVG_PORTLET_API, COVERAGE_PORTLET_API, JOINT_VISIT_PORTLET_API, MENU_API, ORDER_INVOICE_PORTLET_API} from "./apiConstants";

export const coveragePortletRequest = (payload) => {
    return createRequest(COVERAGE_PORTLET_API, null, payload.certificate, {locationId: payload.locationId, fromYearMonth: payload.fromYearMonth, toYearMonth: payload.toYearMonth})
}

export const callAveragePortletRequest = (payload) => {
    return createRequest(CALL_AVG_PORTLET_API, null, payload.certificate, {locationId: payload.locationId, fromYearMonth: payload.fromYearMonth, toYearMonth: payload.toYearMonth})
}

export const orderInvoicePortletRequest = (payload) => {
    return createRequest(ORDER_INVOICE_PORTLET_API, null, payload.certificate, {locationId: payload.locationId, fromYearMonth: payload.fromYearMonth, toYearMonth: payload.toYearMonth})
}

export const jointVisitPortletRequest = (payload) => {
    return createRequest(JOINT_VISIT_PORTLET_API, null, payload.certificate, {locationId: payload.locationId, fromYearMonth: payload.fromYearMonth, toYearMonth: payload.toYearMonth})
}
