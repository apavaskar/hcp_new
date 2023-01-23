import { ofType } from 'redux-observable'
import { catchError, debounceTime, from, map, of, switchMap } from 'rxjs'
import {SEARCH_EXPENSE_START_ACTION} from "../actions/expense/expenseActionConstants";
import {searchExpenseRequest} from "../../api/expenseRequests";
import {searchExpenseFailAction, searchExpenseSuccessAction} from "../actions/expense/expenseActions";

export const searchExpenseStartEpic = (action$) =>
  action$.pipe(
    ofType(SEARCH_EXPENSE_START_ACTION),
    debounceTime(4000),
    switchMap((action) =>
      searchExpenseRequest(action.payload).pipe(
        map((searchResponse) =>
            searchExpenseSuccessAction({ expenseHeaders: searchResponse.response })),
        catchError((error) =>
            of(searchExpenseFailAction({ error: error }))),
      ),
    ),
  )

