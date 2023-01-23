import { ofType } from 'redux-observable'
import { catchError, debounceTime, map, of, switchMap } from 'rxjs'
import {searchMetaRequests} from "../../api/commonRequests";
import {commonSearchMetaSuccessAction} from "../actions/common/commonActions";
import {globalFailAction} from "../actions/global/GlobalActions";
import {COMMON_SELECT_START} from "../actions/widget/widgetActionConstants";

export const selectSearchStartEpic = (action$) =>
    action$.pipe(
        ofType(COMMON_SELECT_START),
        switchMap((action) =>
            searchMetaRequests(action.payload).pipe(
                map((searchMetaResults) => commonSearchMetaSuccessAction({searchMetaResult: searchMetaResults.response})),
                catchError((error) => of(globalFailAction({error: error}))),
            ),
        ),
    )

