import {
  DOCTOR_REGISTRATION_RESTORE_FAIL,
  DOCTOR_REGISTRATION_RESTORE_START, DOCTOR_REGISTRATION_RESTORE_SUCCESS,
  DOCTOR_REGISTRATION_SEARCH_FAIL,
  DOCTOR_REGISTRATION_SEARCH_START,
  DOCTOR_REGISTRATION_SEARCH_SUCCESS
} from "./doctorRegistrationConstants";

export const doctorRegistrationSearchStartAction = (payload) => (dispatch) => {
  dispatch({
    type: DOCTOR_REGISTRATION_SEARCH_START,
    payload: payload,
  })
}

export const doctorRegistrationSearchSuccessAction = (payload) => (dispatch) => {
  dispatch({
    type: DOCTOR_REGISTRATION_SEARCH_SUCCESS,
    payload: payload,
  })
}

export const doctorRegistrationSearchFailAction = (payload) => (dispatch) => {
  dispatch({
    type: DOCTOR_REGISTRATION_SEARCH_FAIL,
    payload: payload,
  })
}

export const doctorRegistrationRestoreStartAction = (payload) => (dispatch) => {
  dispatch({
    type: DOCTOR_REGISTRATION_RESTORE_START,
    payload: payload,
  })
}

export const doctorRegistrationRestoreSuccessAction = (payload) => (dispatch) => {
  dispatch({
    type: DOCTOR_REGISTRATION_RESTORE_SUCCESS,
    payload: payload,
  })
}

export const doctorRegistrationRestoreFailAction = (payload) => (dispatch) => {
  dispatch({
    type: DOCTOR_REGISTRATION_RESTORE_FAIL,
    payload: payload,
  })
}
