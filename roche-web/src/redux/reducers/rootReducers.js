import { combineReducers } from 'redux'
import authReducer from './authReducer'
import uiReducer from './uiReducer'
import globalReducer from './globalReducer'
import widgetReducer from "./widgetReducer";
import filterReducer from "./filterReducer";
import effortReportReducer from "./effortReportReducer";
import expenseReducer from "./expenseReducer";
import portletReducer from "./portletReducer";
import CommonReducer from "./commonReducer";
import EmployeeReducer from "./employeeReducer";

const rootReducer = combineReducers({
  auth: authReducer,
  ui: uiReducer,
  global: globalReducer,
  widget: widgetReducer,
  filter: filterReducer,
  effortReport: effortReportReducer,
  expense: expenseReducer,
  portlet: portletReducer,
  common: CommonReducer,
  employee: EmployeeReducer
})

export default rootReducer
