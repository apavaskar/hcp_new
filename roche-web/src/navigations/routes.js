import React from 'react'
import Login from "../components/auth/Login";
import CommonUpdateComponent from "../components/common/CommonUpdateComponent";
import CommonNewComponent from "../components/common/CommonNewComponent";
import EditEmployeeComponent from "../components/employee/EditEmployeeComponent";

const Dashboard = React.lazy(() => import('../components/dashboard/DashboardComponent'))
const EffortReport = React.lazy(()=> import('../components/report/EffortReportComponent'))
const AttendanceReport = React.lazy(()=> import('../components/report/AttendanceReportComponent'))
const SearchClaimExpenseComponent = React.lazy(()=> import('../components/expense/claim/SearchClaimExpenseComponent'))
const PortletWrapper = React.lazy(()=> import('../components/portlet/PortletWrapperComponent'))
const CommonSearchComponent = React.lazy(() => import('../components/common/CommonSearchComponent'))

const routes = [
    { path: '/home/dashboard', name: 'Dashboard', element: Dashboard },
    { path: '/home/reports/effort', name: 'Effort Report', element: EffortReport},
    { path: '/home/reports/attendance', name: 'Attendance Report', element: AttendanceReport},
    { path: '/home/expense/claim', name: 'Expense Claim', element: SearchClaimExpenseComponent},
    {path: '/portlet', name: 'Portlet', element: PortletWrapper},
    {path: '/home/:code/search', name: 'Search Stores', element: CommonSearchComponent},
    {path: '/admin/:code/edit/:id', name: 'Search Stores', element: CommonUpdateComponent},
    {path: '/adminAdhoc/employee/edit/:id', name: 'Search Stores', element: EditEmployeeComponent},
    {path: '/admin/:code/new', name: 'New', element: CommonNewComponent},
    { path: '/login', name: 'Login', element: Login },
]

export default routes
