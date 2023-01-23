import {
    COMMON_NEW_META_START, COMMON_NEW_META_SUCCESS,
    COMMON_SAVE_META_START, COMMON_SAVE_META_SUCCESS,
    COMMON_SEARCH_META_START,
    COMMON_SEARCH_META_SUCCESS,
    COMMON_SEARCH_RESET_START,
    COMMON_SEARCH_START,
    COMMON_SEARCH_SUCCESS,
    COMMON_UPDATE_INIT_START,
    COMMON_UPDATE_INIT_SUCCESS,
    GET_FORM_META_START,
    GET_FORM_META_SUCCESS,
} from "./commonActionConstants";
import {COMMON_SELECT_START, COMMON_SELECT_SUCCESS} from "../widget/widgetActionConstants";


export const getFormMetaStartAction = (payload) => (dispatch) => {
    dispatch({
        type: GET_FORM_META_START,
        payload: payload,
    })
}

export const getFormMetaSuccessAction = (payload) => (dispatch) => {
    dispatch({
        type: GET_FORM_META_SUCCESS,
        payload: payload,
    })
}

export const commonSearchStartAction = (payload) => (dispatch) => {
    dispatch({
        type: COMMON_SEARCH_START,
        payload: payload,
    })
}

export const commonSearchSuccessAction = (payload) => (dispatch) => {
    dispatch({
        type: COMMON_SEARCH_SUCCESS,
        payload: payload,
    })
}

export const commonSearchMetaStartAction = (payload) => (dispatch) => {
    dispatch({
        type: COMMON_SEARCH_META_START,
        payload: payload,
    })
}

export const commonSearchMetaSuccessAction = (payload) => (dispatch) => {
    dispatch({
        type: COMMON_SEARCH_META_SUCCESS,
        payload: payload,
    })
}

export const commonSelectStartAction = (payload) => (dispatch) => {
    dispatch({
        type: COMMON_SELECT_START,
        payload: payload,
    })
}

export const commonSelectSuccessAction = (payload) => (dispatch) => {
    dispatch({
        type: COMMON_SELECT_SUCCESS,
        payload: payload,
    })
}

export const commonUpdateInitStartAction = (payload) => (dispatch) => {
    dispatch({
        type: COMMON_UPDATE_INIT_START,
        payload: payload,
    })
}

export const commonUpdateInitSuccessAction = (payload) => (dispatch) => {
    dispatch({
        type: COMMON_UPDATE_INIT_SUCCESS,
        payload: payload,
    })
}

export const commonSearchResetAction = payload => dispatch => {
    dispatch({
        type: COMMON_SEARCH_RESET_START,
        payload: payload
    })
}

export const commonSaveMetaStartAction = (payload) => (dispatch) => {
    dispatch({
        type: COMMON_SAVE_META_START,
        payload: payload,
    })
}

export const commonSaveMetaSuccessAction = (payload) => (dispatch) => {
    dispatch({
        type: COMMON_SAVE_META_SUCCESS,
        payload: payload,
    })
}

export const commonNewMetaStartAction = (payload) => (dispatch) => {
    dispatch({
        type: COMMON_NEW_META_START,
        payload: payload,
    })
}

export const commonNewMetaSuccessAction = (payload) => (dispatch) => {
    dispatch({
        type: COMMON_NEW_META_SUCCESS,
        payload: payload,
    })
}


