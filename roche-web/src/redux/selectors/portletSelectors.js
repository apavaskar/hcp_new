import { createSelector } from 'reselect'

const coverages = (state) => state.portlet.coverages
const callAverages = (state) => state.portlet.callAverages
const orderInvoices = (state) => state.portlet.orderInvoices
const jointVisits = state => state.portlet.jointVisits

export const selectCoverages = createSelector(coverages, (coveragesSelect) => coveragesSelect)
export const selectCallAverages = createSelector(callAverages, (callAveragesSelect) => callAveragesSelect)
export const selectOrderInvoices = createSelector(orderInvoices, (orderInvoicesSelect) => orderInvoicesSelect)
export const selectJointVisits = createSelector(jointVisits, (jointVisitsSelect) => jointVisitsSelect)
