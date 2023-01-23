import { createSelector } from 'reselect'

const filter = (state) => state.effortReport
const attendanceReport = (state) => state.effortReport.attendanceReport
const effortReport = state => state.effortReport.effortReport

export const selectAttendanceReport = createSelector(attendanceReport,
    (attendanceReportSelect) => attendanceReportSelect)

export const selectEffortReport = createSelector(effortReport,
    (effortReportSelect) => effortReportSelect)
