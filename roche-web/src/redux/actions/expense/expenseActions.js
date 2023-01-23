import {CHANGE_LOCATION_TYPE, SEARCH_EXPENSE_FAIL_ACTION, SEARCH_EXPENSE_START_ACTION, SEARCH_EXPENSE_SUCCESS_ACTION} from "./expenseActionConstants";

export const searchExpenseStartAction = (payload) => (dispatch) => {
  dispatch({
    type: SEARCH_EXPENSE_START_ACTION,
    payload: payload,
  })
}

export const searchExpenseSuccessAction = (payload) => (dispatch) => {
  dispatch({
    type: SEARCH_EXPENSE_SUCCESS_ACTION,
    payload: payload,
  })
}

export const searchExpenseFailAction = (payload) => (dispatch) => {
  dispatch({
    type: SEARCH_EXPENSE_FAIL_ACTION,
    payload: payload,
  })
}

export const changeLocationTypeAction = payload => dispatch => {
    dispatch({
        type: CHANGE_LOCATION_TYPE,
        payload: payload
    })
}
