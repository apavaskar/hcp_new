import { ofType } from 'redux-observable'
import { catchError, debounceTime, map, of, switchMap } from 'rxjs'
import {CALL_AVERAGE_PORTLET_START_ACTION, COVERAGE_PORTLET_START_ACTION, JOINT_VISIT_PORTLET_START_ACTION, ORDER_INVOICE_PORTLET_START_ACTION} from "../actions/portlet/portletActionConstants";
import {callAveragePortletRequest, coveragePortletRequest, jointVisitPortletRequest, orderInvoicePortletRequest} from "../../api/portletRequests";
import {callAveragePortletFailAction, callAveragePortletSuccessAction, coveragePortletFailAction, coveragePortletSuccessAction, jointVisitPortletFailAction, jointVisitPortletSuccessAction, orderInvoicePortletFailAction, orderInvoicePortletSuccessAction} from "../actions/portlet/portletActions";

export const loadCoveragePortletEpic = (action$) =>
  action$.pipe(
    ofType(COVERAGE_PORTLET_START_ACTION),
    debounceTime(4000),
    switchMap((action) =>
      coveragePortletRequest(action.payload).pipe(
        map((coverageResponse) => coveragePortletSuccessAction({ coverages: coverageResponse.response })),
        catchError((error) => of(coveragePortletFailAction({ error: error }))),
      ),
    ),
  )

export const loadCallAveragePortletEpic = (action$) =>
    action$.pipe(
        ofType(CALL_AVERAGE_PORTLET_START_ACTION),
        debounceTime(4000),
        switchMap((action) =>
            callAveragePortletRequest(action.payload).pipe(
                map((callAverageResponse) => callAveragePortletSuccessAction({ callAverages: callAverageResponse.response })),
                catchError((error) => of(callAveragePortletFailAction({ error: error }))),
            ),
        ),
    )

export const orderInvoicePortletEpic = (action$) =>
    action$.pipe(
        ofType(ORDER_INVOICE_PORTLET_START_ACTION),
        debounceTime(4000),
        switchMap((action) =>
            orderInvoicePortletRequest(action.payload).pipe(
                map((orderInvoiceResponse) => orderInvoicePortletSuccessAction({ orderInvoices: orderInvoiceResponse.response })),
                catchError((error) => of(orderInvoicePortletFailAction({ error: error }))),
            ),
        ),
    )

export const jointVisitPortletEpic = (action$) =>
    action$.pipe(
        ofType(JOINT_VISIT_PORTLET_START_ACTION),
        debounceTime(4000),
        switchMap((action) =>
            jointVisitPortletRequest(action.payload).pipe(
                map((jointVisitResponse) => jointVisitPortletSuccessAction({ jointVisits: jointVisitResponse.response })),
                catchError((error) => of(jointVisitPortletFailAction({ error: error }))),
            ),
        ),
    )
