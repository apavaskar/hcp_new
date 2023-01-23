import { createSelector } from 'reselect'

const expense = (state) => state.expense
const headers = (state) => state.expense.headers
const summary = state => state.expense.summary

export const selectExpenseHeaders = createSelector(headers,
    (headersSelect) => headersSelect)

export const selectSummary = createSelector(summary,
    summarySelect => summarySelect
    )
