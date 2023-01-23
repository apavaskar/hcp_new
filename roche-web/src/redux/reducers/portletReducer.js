import { createReducer } from './reducerUtils'
import {
  UI_MENU_FAIL_ACTION,
  UI_MENU_SUCCESS_ACTION,
  UI_SET_PAGE_TITLE,
} from '../actions/ui/uiActionConstants'
import {CALL_AVERAGE_PORTLET_SUCCESS_ACTION, COVERAGE_PORTLET_SUCCESS_ACTION, JOINT_VISIT_PORTLET_SUCCESS_ACTION, ORDER_INVOICE_PORTLET_SUCCESS_ACTION} from "../actions/portlet/portletActionConstants";
import {jointVisitPortletSuccessAction} from "../actions/portlet/portletActions";
const initialState = {
  coverages: {overall: [], byTypes: []},
  callAverages: {overall: [], byTypes: []},
  orderInvoices: [],
  jointVisits: [],
  error: null,
}

const coveragePortletSuccessReducer = (state = initialState, payload) => {
  const coverages = payload.coverages
  return {
    ...state,
    coverages: {overall: coverages.filter(c => c.type.id===0).sort((a,b) => a - b),
                byTypes: coverages.filter(c => c.type.id!==0).sort((a,b) => a - b)},
    error: null,
  }
}

const callAveragePortletSuccessReducer = (state = initialState, payload) => {
    const callAverages = payload.callAverages
    return {
        ...state,
        callAverages: {overall: callAverages.filter(c => c.type.id===0).sort((a,b) => a - b),
            byTypes: callAverages.filter(c => c.type.id!==0).sort((a,b) => a - b)},
        error: null,
    }
}

const orderInvoicesPortletSuccessReducer = (state = initialState, payload) => {
    const orderInvoices = payload.orderInvoices
    console.log(orderInvoices)
    return {
        ...state,
        orderInvoices: orderInvoices.sort((a, b) => a.yearMonth-b.yearMonth),
        error: null,
    }
}

const jointVisitPortletSuccessReducer = (state = initialState, payload) => {
    return {
        ...state,
        jointVisits: payload.jointVisits.sort((a, b) => a.yearMonth-b.yearMonth),
        error: null,
    }
}

export default createReducer(initialState, {
  [COVERAGE_PORTLET_SUCCESS_ACTION]: coveragePortletSuccessReducer,
  [CALL_AVERAGE_PORTLET_SUCCESS_ACTION]: callAveragePortletSuccessReducer,
  [ORDER_INVOICE_PORTLET_SUCCESS_ACTION]: orderInvoicesPortletSuccessReducer,
  [JOINT_VISIT_PORTLET_SUCCESS_ACTION]: jointVisitPortletSuccessReducer
})
