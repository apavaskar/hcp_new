import {createSelector} from "reselect";

const employee = (state) => state.employee
const getSelectDropdown = (state) => state.employee.getSelectDropdown

export const selectGetSelectDropdown = createSelector(getSelectDropdown, (selectGetSelectDropdown) => selectGetSelectDropdown)