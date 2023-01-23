import { createReducer } from './reducerUtils'
import {EMPLOYEE_HIERARCHY_FAIL, EMPLOYEE_HIERARCHY_SUCCESS} from "../actions/filter/filterActionConstants";
const initialState = {
    hierarchy: [],
  error: null,
}

const employeeHierarchySuccessReducer = (state = initialState, payload) => {
  return {
    ...state,
    hierarchy: payload.team,
    error: null,
  }
}

const employeeHierarchyFailReducer = (state = initialState, payload) => {
  return {
    ...state,
    error: payload.error,
    loggedIn: false,
  }
}


export default createReducer(initialState, {
  [EMPLOYEE_HIERARCHY_SUCCESS]: employeeHierarchySuccessReducer,
  [EMPLOYEE_HIERARCHY_FAIL]: employeeHierarchyFailReducer,
})
