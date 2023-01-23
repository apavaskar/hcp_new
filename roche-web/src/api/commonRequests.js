import {createRequest} from "./httpUtils";
import {
    FORM_META_API,
    NEW_META_API,
    SAVE_META_API,
    SEARCH_API,
    SEARCH_META_API,
    SELECT_API,
    UPDATE_INIT_API
} from "./apiConstants";

export const formMetaRequests = payload => {
    return createRequest(FORM_META_API, null, payload.certificate, {code: payload.code})
}

export const searchRequests = payload => {
    return createRequest(SEARCH_API, payload.data, payload.certificate, {searchAPI: payload.searchAPI})
}

export const searchMetaRequests = payload => {
    return createRequest(SEARCH_META_API, null, payload.certificate, {entity_name: payload.entity_name})
}

export const selectRequests = payload => {
    return createRequest(SELECT_API, null, payload.certificate, {api: payload.api})
}

export const updateInitRequests = payload => {
    return createRequest(UPDATE_INIT_API, null, payload.certificate, {api: payload.api})
}

export const saveMetaRequests = payload => {
    return createRequest(SAVE_META_API, payload.data, payload.certificate, {entity_name: payload.entity_name})
}

export const newMetaRequests = payload => {
    return createRequest(NEW_META_API, payload.data, payload.certificate, {entity_name: payload.entity_name})
}


