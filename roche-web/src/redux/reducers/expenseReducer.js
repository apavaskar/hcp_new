import { createReducer } from './reducerUtils'
import {CHANGE_LOCATION_TYPE, SEARCH_EXPENSE_FAIL_ACTION, SEARCH_EXPENSE_SUCCESS_ACTION} from "../actions/expense/expenseActionConstants";

const initialState = {
  headers:[],
  summary: {totalDA: 0, totalFare: 0},
  error: null,
}

const searchExpenseSuccessReducer = (state = initialState, payload) => {
  return {
    ...state,
    headers: payload.expenseHeaders,
    error: null,
  }
}

const searchExpenseFailReducer = (state = initialState, payload) => {
  return {
    ...state,
    error: payload.error,
  }
}

const changeLocationTypeReducer = (state = initialState, payload) => {
    const headers = JSON.parse(JSON.stringify(state.headers))
    let totalDA = 0
    headers.details.forEach(item => {
        if (item.id === payload.id) {
            switch (payload.type) {
                case 'HQ':
                case 'EX-HQ':
                    item.dailyAllowance = 200
                    break
                case 'OS':
                    item.dailyAllowance = 300
                    break
            }
        }
        console.log(item.dailyAllowance)
        totalDA = totalDA + item.dailyAllowance ? item.dailyAllowance : 0
    })
    console.log(totalDA)
    return {
        ...state,
        headers: headers,
        summary: {
            ...state.summary, totalDA: totalDA
        },
        error: null,
    }
}


export default createReducer(initialState, {
  [SEARCH_EXPENSE_SUCCESS_ACTION]: searchExpenseSuccessReducer,
  [SEARCH_EXPENSE_FAIL_ACTION]: searchExpenseFailReducer,
   [CHANGE_LOCATION_TYPE]: changeLocationTypeReducer
})
