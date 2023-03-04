import {createReducer} from './reducerUtils'
import {GET_SELECT_DROPDOWN_FAIL, GET_SELECT_DROPDOWN_SUCCESS} from "../actions/employee/employeeActionConstants";

const initialState = {
    getSelectDropdown : {},
    success: false
}

const getSelectDropDownSuccessReducer = (state = initialState, payload) => {
    return{
        ...state,
        getSelectDropdown: {
            ...state.getSelectDropdown, [payload.name] : payload.getSelectDropdown.map(row => {
                return{
                    label: row.name,
                    value: row.id
                }
            })
        },
        success: true
    }
}

const getSelectDropDownFailReducer = (state = initialState, payload) => {
    return {
        success: false
    }
}


export default createReducer(initialState, {
    [GET_SELECT_DROPDOWN_SUCCESS]: getSelectDropDownSuccessReducer,
    [GET_SELECT_DROPDOWN_FAIL]: getSelectDropDownFailReducer
})