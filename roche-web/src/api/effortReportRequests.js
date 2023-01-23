import { createRequest } from './httpUtils'
import { GET_EFFORT_REPORT_API} from "./apiConstants";


export const effortReportRequest = (payload) => {
  return createRequest(GET_EFFORT_REPORT_API, null, payload.certificate, {locationId: payload.locationId, yearMonth: payload.yearMonth})
}
