import { ofType } from 'redux-observable'
import { catchError, debounceTime, from, map, of, switchMap } from 'rxjs'
import { EFFORT_REPORT_START} from "../actions/effort-report/effortReportActionConstants";
import { effortReportRequest} from "../../api/effortReportRequests";
import { effortReportFailAction, effortReportSuccessAction} from "../actions/effort-report/effortReportActions";

export const effortReportStartEpic = (action$) =>
    action$.pipe(
        ofType(EFFORT_REPORT_START),
        debounceTime(4000),
        switchMap((action) =>
            effortReportRequest(action.payload).pipe(
                map((effortResponse) =>
                    effortReportSuccessAction({ data: effortResponse.response })),
                catchError((error) => of(effortReportFailAction({ error: error }))),
            ),
        ),
    )
