import { createReducer } from './reducerUtils'

import {ATTENDANCE_REPORT_FAIL, ATTENDANCE_REPORT_SUCCESS, EFFORT_REPORT_FAIL, EFFORT_REPORT_SUCCESS} from "../actions/effort-report/effortReportActionConstants";
const initialState = {
  attendanceReport: {},
  effortReport: [],
  error: null,
}

const attendanceReportSuccessReducer = (state = initialState, payload) => {
  return {
    ...state,
    attendanceReport: payload.data,
    error: null,
  }
}

const attendanceReportFailReducer = (state = initialState, payload) => {
  return {
    ...state,
    error: payload.error,
    loggedIn: false,
  }
}

const effortReportSuccessReducer = (state = initialState, payload) => {
    return {
        ...state,
        effortReport: payload.data,
        error: null,
    }
}

const effortReportFailReducer = (state = initialState, payload) => {
    return {
        ...state,
        error: payload.error,
        loggedIn: false,
    }
}


export default createReducer(initialState, {
  [ATTENDANCE_REPORT_SUCCESS]: attendanceReportSuccessReducer,
  [ATTENDANCE_REPORT_FAIL]: attendanceReportFailReducer,
  [EFFORT_REPORT_SUCCESS]: effortReportSuccessReducer,
  [EFFORT_REPORT_FAIL]: effortReportFailReducer,
})
