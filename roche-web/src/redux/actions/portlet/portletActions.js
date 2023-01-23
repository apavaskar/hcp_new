import {
    CALL_AVERAGE_PORTLET_FAIL_ACTION,
    CALL_AVERAGE_PORTLET_START_ACTION,
    CALL_AVERAGE_PORTLET_SUCCESS_ACTION,
    COVERAGE_PORTLET_FAIL_ACTION,
    COVERAGE_PORTLET_START_ACTION,
    COVERAGE_PORTLET_SUCCESS_ACTION,
    INIT_PORTLET_START_ACTION, JOINT_VISIT_PORTLET_FAIL_ACTION, JOINT_VISIT_PORTLET_START_ACTION, JOINT_VISIT_PORTLET_SUCCESS_ACTION, ORDER_INVOICE_PORTLET_FAIL_ACTION,
    ORDER_INVOICE_PORTLET_START_ACTION, ORDER_INVOICE_PORTLET_SUCCESS_ACTION
} from "./portletActionConstants";

export const initPortletStartAction = (payload) => (dispatch) => {
  dispatch({
    type: INIT_PORTLET_START_ACTION,
    payload: payload,
  })
}

export const coveragePortletStartAction = (payload) => (dispatch) => {
    dispatch({
        type: COVERAGE_PORTLET_START_ACTION,
        payload: payload,
    })
}

export const coveragePortletSuccessAction = (payload) => (dispatch) => {
    dispatch({
        type: COVERAGE_PORTLET_SUCCESS_ACTION,
        payload: payload,
    })
}

export const coveragePortletFailAction = (payload) => (dispatch) => {
    dispatch({
        type: COVERAGE_PORTLET_FAIL_ACTION,
        payload: payload,
    })
}

export const callAveragePortletStartAction = (payload) => (dispatch) => {
    dispatch({
        type: CALL_AVERAGE_PORTLET_START_ACTION,
        payload: payload,
    })
}

export const callAveragePortletSuccessAction = (payload) => (dispatch) => {
    dispatch({
        type: CALL_AVERAGE_PORTLET_SUCCESS_ACTION,
        payload: payload,
    })
}

export const callAveragePortletFailAction = (payload) => (dispatch) => {
    dispatch({
        type: CALL_AVERAGE_PORTLET_FAIL_ACTION,
        payload: payload,
    })
}

export const orderInvoicePortletStartAction = (payload) => (dispatch) => {
    dispatch({
        type: ORDER_INVOICE_PORTLET_START_ACTION,
        payload: payload,
    })
}

export const orderInvoicePortletSuccessAction = (payload) => (dispatch) => {
    dispatch({
        type: ORDER_INVOICE_PORTLET_SUCCESS_ACTION,
        payload: payload,
    })
}

export const orderInvoicePortletFailAction = (payload) => (dispatch) => {
    dispatch({
        type: ORDER_INVOICE_PORTLET_FAIL_ACTION,
        payload: payload,
    })
}

export const jointVisitPortletStartAction = (payload) => (dispatch) => {
    dispatch({
        type: JOINT_VISIT_PORTLET_START_ACTION,
        payload: payload,
    })
}

export const jointVisitPortletSuccessAction = (payload) => (dispatch) => {
    dispatch({
        type: JOINT_VISIT_PORTLET_SUCCESS_ACTION,
        payload: payload,
    })
}

export const jointVisitPortletFailAction = (payload) => (dispatch) => {
    dispatch({
        type: JOINT_VISIT_PORTLET_FAIL_ACTION,
        payload: payload,
    })
}
