import {SEARCH_LOCATION_TYPE_API} from "./apiConstants";
import {createRequest} from "./httpUtils";

export const locationTypeRequest = (payload) => {
    return createRequest(SEARCH_LOCATION_TYPE_API,
        null, payload.certificate, {typeId: 1})
}
