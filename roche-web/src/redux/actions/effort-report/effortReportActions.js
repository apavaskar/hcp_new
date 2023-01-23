import {ATTENDANCE_REPORT_FAIL, ATTENDANCE_REPORT_START, ATTENDANCE_REPORT_SUCCESS, EFFORT_REPORT_FAIL, EFFORT_REPORT_START, EFFORT_REPORT_SUCCESS} from "./effortReportActionConstants";

export const attendanceReportStartAction = (payload) => (dispatch) => {
  dispatch({
    type: ATTENDANCE_REPORT_START,
    payload: payload,
  })
}

export const attendanceReportSuccessAction = (payload) => (dispatch) => {
  dispatch({
    type: ATTENDANCE_REPORT_SUCCESS,
    payload: payload,
  })
}

export const attendanceReportFailAction = (payload) => (dispatch) => {
  dispatch({
    type: ATTENDANCE_REPORT_FAIL,
    payload: payload,
  })
}

export const effortReportStartAction = (payload) => (dispatch) => {
    dispatch({
        type: EFFORT_REPORT_START,
        payload: payload,
    })
}

export const effortReportSuccessAction = (payload) => (dispatch) => {
    dispatch({
        type: EFFORT_REPORT_SUCCESS,
        payload: payload,
    })
}

export const effortReportFailAction = (payload) => (dispatch) => {
    dispatch({
        type: EFFORT_REPORT_FAIL,
        payload: payload,
    })
}

