import {ofType} from 'redux-observable'
import {catchError, from, map, mergeMap, of, switchMap} from 'rxjs'
import {
    COMMON_NEW_META_START,
    COMMON_SAVE_META_START,
    COMMON_SEARCH_META_START,
    COMMON_SEARCH_START,
    COMMON_UPDATE_INIT_START,
    GET_FORM_META_START
} from "../actions/common/commonActionConstants";
import {
    formMetaRequests, newMetaRequests,
    saveMetaRequests,
    searchMetaRequests,
    searchRequests,
    selectRequests,
    updateInitRequests
} from "../../api/commonRequests";
import {
    commonNewMetaSuccessAction,
    commonSaveMetaSuccessAction,
    commonSearchMetaSuccessAction,
    commonSearchSuccessAction,
    commonSelectSuccessAction,
    commonUpdateInitSuccessAction,
    getFormMetaSuccessAction
} from "../actions/common/commonActions";
import {globalFailAction} from "../actions/global/GlobalActions";
import {COMMON_SELECT_START} from "../actions/widget/widgetActionConstants";
import {template} from "lodash";

export const getFormMetaStartEpic = (action$) =>
    action$.pipe(
        ofType(GET_FORM_META_START),
        switchMap((action) =>
            formMetaRequests(action.payload).pipe(
                map((formMeta) => getFormMetaSuccessAction({meta: formMeta.response})),
                catchError((error) => of(globalFailAction({error: error}))),
            ),
        ),
    )

export const commonSearchMetaStartEpic = (action$) =>
    action$.pipe(
        ofType(COMMON_SEARCH_META_START),
        switchMap((action) =>
            searchMetaRequests(action.payload).pipe(
                map((searchMetaResults) => commonSearchMetaSuccessAction({searchMetaResult: searchMetaResults.response})),
                catchError((error) => of(globalFailAction({error: error}))),
            ),
        ),
    )

export const commonSearchStartEpic = (action$) =>
    action$.pipe(
        ofType(COMMON_SEARCH_START),
        switchMap((action) =>
            searchRequests(action.payload).pipe(
                map((searchResults) =>
                    commonSearchSuccessAction({searchResult: searchResults.response})),
                catchError((error) => of(globalFailAction({error: error}))),
            ),
        ),
    )

export const commonSelectStartEpic = (action$) =>
    action$.pipe(
        ofType(COMMON_SELECT_START),
        mergeMap((action) =>
            selectRequests(action.payload).pipe(
                map((searchResults) =>
                    commonSelectSuccessAction({name: action.payload.name, searchResult: searchResults.response})),
                catchError((error) => of(globalFailAction({error: error}))),
            ),
        ),
    )

export const commonUpdateInitStartEpic = (action$) =>
    action$.pipe(
        ofType(COMMON_UPDATE_INIT_START),
        switchMap(action =>
            from(formMetaRequests(action.payload)).pipe(
                switchMap(({response}) =>
                    from(
                        updateInitRequests({...action.payload, api: `${template(response.initAction)({id: action.payload.id})}`}),
                    ).pipe(
                        map(initResponse => commonUpdateInitSuccessAction({meta: response, initialValues: initResponse.response})
                        ),
                        catchError(error => of(globalFailAction({error: error}))),
                    ),
                ),
                catchError(error => of(globalFailAction({error: error}))),
            ),
        ),
    )

export const commonSaveMetaStartEpic = (action$) =>
    action$.pipe(
        ofType(COMMON_SAVE_META_START),
        switchMap((action) =>
            saveMetaRequests(action.payload).pipe(
                map((saveMetaResults) => commonSaveMetaSuccessAction({saveMetaResult: saveMetaResults.response})),
                catchError((error) => of(globalFailAction({error: error}))),
            ),
        )
    )

export const commonNewMetaStartEpic = (action$) =>
    action$.pipe(
        ofType(COMMON_NEW_META_START),
        switchMap((action) =>
            newMetaRequests(action.payload).pipe(
                map((newMetaResults) => commonNewMetaSuccessAction({newMetaResult: newMetaResults.response})),
                catchError((error) => of(globalFailAction({error: error}))),
            ),
        )
    )
