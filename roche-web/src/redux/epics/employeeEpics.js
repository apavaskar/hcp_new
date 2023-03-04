import {ofType} from 'redux-observable'
import {catchError, from, map, mergeMap, of, switchMap} from 'rxjs'
import {formMetaRequests, selectRequests} from "../../api/commonRequests";
import {GET_SELECT_DROPDOWN_START} from "../actions/employee/employeeActionConstants";
import {getSelectDropdownFailAction, getSelectDropdownSuccessAction} from "../actions/employee/employeeActions";

export const getEmployeeDropdownEpic = (action$) =>
    action$.pipe(
        ofType(GET_SELECT_DROPDOWN_START),
        mergeMap((action) =>
            selectRequests(action.payload).pipe(
                map((getSelectDropdown) => getSelectDropdownSuccessAction({name: action.payload.name, getSelectDropdown: getSelectDropdown.response})),
                catchError((error) => of(getSelectDropdownFailAction({error: error}))),
            ),
        ),
    )