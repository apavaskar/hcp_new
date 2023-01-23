import {EMPLOYEE_HIERARCHY_FAIL, EMPLOYEE_HIERARCHY_START, EMPLOYEE_HIERARCHY_SUCCESS} from "./filterActionConstants";

export const employeeHierarchyStartAction = (payload) => (dispatch) => {
  dispatch({
    type: EMPLOYEE_HIERARCHY_START,
    payload: payload,
  })
}

export const employeeHierarchySuccessAction = (payload) => (dispatch) => {
  dispatch({
    type: EMPLOYEE_HIERARCHY_SUCCESS,
    payload: payload,
  })
}

export const employeeHierarchyFailAction = (payload) => (dispatch) => {
  dispatch({
    type: EMPLOYEE_HIERARCHY_FAIL,
    payload: payload,
  })
}

