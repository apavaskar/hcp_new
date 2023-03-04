export const AUTH_CERTIFICATE = 'Authorization'
//export const BASE_URL = 'https://ascensia.squer.co.in'
export const BASE_URL = 'http://localhost:8090'

//export const BASE_URL = 'http://165.22.214.28:8090'

export const FORM_META_API = {url: 'v2/form-meta/by-code/<%= code %>', method: 'GET', auth: true}
export const SEARCH_API = {url: '<%= searchAPI %>', method: 'POST', auth: true}
export const SEARCH_META_API = {url: 'v2/search-meta/by-name/<%= entity_name %>', method: 'GET', auth: true}
export const SAVE_META_API = {url: 'v2/<%= entity_name%>/save', method: 'PUT', auth: true}
export const NEW_META_API = {url: 'v2/<%= entity_name%>/create', method: 'POST', auth: true}
export const LOGIN_API = {url: 'v1/user/login', method: 'POST', auth: false}
export const MENU_API = {url: 'v2/menu/for-user/<%= userId %>', method: 'GET', auth: true}
export const USER_PROFILE_API = {url: 'v1/user/user-profile/<%= userId %>', method: 'GET', auth: true}
export const USER_PRIVILEGE_API = {url: 'v1/user/privileges/<%= userId %>', method: 'GET', auth: true}
export const SELECT_API = {url: '<%= api %>', method: 'GET', auth: true}
export const UPDATE_INIT_API = {url: '<%= api %>', method: 'GET', auth: true}

export const GET_EFFORT_REPORT_API = {url: 'v2/effort-report/effort/<%= locationId %>/<%= yearMonth %>', method: 'GET', auth: true}

export const SEARCH_EXPENSE_API= {url: 'v2/expense/<%= employeeId %>/<%= yearMonth %>', method: 'GET', auth: true}

export const SEARCH_LOCATION_TYPE_API = {url: 'v2/locationType/all-children/<%= typeId %>', method: 'GET', auth: true}

export const COVERAGE_PORTLET_API = {url: 'v2/portlet/coverage/<%= locationId %>/<%= fromYearMonth %>/<%= toYearMonth %>', method: 'GET', auth: true}

export const CALL_AVG_PORTLET_API = {url: 'v2/portlet/call-average/<%= locationId %>/<%= fromYearMonth %>/<%= toYearMonth %>', method: 'GET', auth: true}

export const ORDER_INVOICE_PORTLET_API = {url: 'v2/portlet/orderInvoices/<%= locationId %>/<%= fromYearMonth %>/<%= toYearMonth %>', method: 'GET', auth: true}

export const JOINT_VISIT_PORTLET_API = {url: 'v2/portlet/joint-calls/<%= locationId %>/<%= fromYearMonth %>/<%= toYearMonth %>', method: 'GET', auth: true}
