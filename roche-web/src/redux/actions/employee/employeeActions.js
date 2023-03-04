import {
    GET_SELECT_DROPDOWN_FAIL,
    GET_SELECT_DROPDOWN_START, GET_SELECT_DROPDOWN_SUCCESS,
} from "./employeeActionConstants";

export const getSelectDropdownStartAction = (payload) => (dispatch) => {
    dispatch({
        type: GET_SELECT_DROPDOWN_START,
        payload: payload,
    })
}

export const getSelectDropdownSuccessAction = (payload) => (dispatch) => {
    dispatch({
        type: GET_SELECT_DROPDOWN_SUCCESS,
        payload: payload,
    })
}

export const getSelectDropdownFailAction = (payload) => (dispatch) => {
    dispatch({
        type: GET_SELECT_DROPDOWN_FAIL,
        payload: payload,
    })
}