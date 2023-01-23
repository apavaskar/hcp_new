import { createRequest } from './httpUtils'
import {SEARCH_EXPENSE_API} from "./apiConstants";

export const searchExpenseRequest = (payload) => {
  return createRequest(SEARCH_EXPENSE_API, null, payload.certificate, {employeeId: payload.employeeId, yearMonth: payload.yearMonth})
}
