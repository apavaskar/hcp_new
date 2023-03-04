import {createReducer} from './reducerUtils'
import {
    COMMON_NEW_META_SUCCESS,
    COMMON_SAVE_META_SUCCESS,
    COMMON_SEARCH_META_SUCCESS,
    COMMON_SEARCH_RESET_START,
    COMMON_SEARCH_SUCCESS,
    COMMON_UPDATE_INIT_SUCCESS,
    GET_FORM_META_SUCCESS,
    LOCATION_SEARCH_SUCCESS,
    PRODUCT_SEARCH_SUCCESS,
    SEARCH_TOWN_SUCCESS
} from "../actions/common/commonActionConstants";
import {COMMON_SELECT_SUCCESS} from "../actions/widget/widgetActionConstants";

const initialState = {
    formMeta: {},
    searchResults: [],
    searchMeta: [],
    saveMeta:[],
    newMeta:[],
    selectResult: {},
    formInitValues: {},
    formInitialized: false,
    success: false
}

const getFormMetaSuccessReducer = (state = initialState, payload) => {
    return {
        ...state,
        formMeta: payload.meta,
        formInitialized: true,
    }
}

const commonSearchSuccessReducer = (state = initialState, payload) => {
    return {
        ...state,
        searchResults: payload.searchResult,
    }
}

const commonSearchMetaSuccessReducer = (state = initialState, payload) => {

    return {
        ...state,
        searchMeta: payload.searchMetaResult,
    }
}

const commonSaveMetaSuccessReducer = (state = initialState, payload) => {

    return {
        ...state,
        saveMeta: payload.saveMetaResult,
        success: true
    }
}

const commonNewMetaSuccessReducer = (state = initialState, payload) => {
    return {
        ...state,
        newMeta: payload.newMetaResult,
        success: true
    }
}

const commonSelectSuccessReducer = (state = initialState, payload) => {
    return {
        ...state,
        selectResult: {
            ...state.selectResult, [payload.name]: payload.searchResult.map(row => {
                return {
                    label: row.name,
                    value: row.id
                }
            })
        }
    }
}

const commonUpdateInitSuccessReducer = (state = initialState, payload) => {
    return {
        ...state,
        formMeta: payload.meta,
        formInitValues: payload.initialValues,
        formInitialized: true
    }
}

const commonSearchResetReducer = (state = initialState, payload) => {
    return initialState
}

const globalFailReducer = (state = initialState, payload) => {
    return {
        success: false
    }
}

export default createReducer(initialState, {
    [GET_FORM_META_SUCCESS]: getFormMetaSuccessReducer,
    [COMMON_SEARCH_SUCCESS]: commonSearchSuccessReducer,
    [COMMON_SEARCH_META_SUCCESS]: commonSearchMetaSuccessReducer,
    [COMMON_SELECT_SUCCESS]: commonSelectSuccessReducer,
    [COMMON_UPDATE_INIT_SUCCESS]: commonUpdateInitSuccessReducer,
    [COMMON_SEARCH_RESET_START]: commonSearchResetReducer,
    [COMMON_SAVE_META_SUCCESS]: commonSaveMetaSuccessReducer,
    [COMMON_NEW_META_SUCCESS]: commonNewMetaSuccessReducer
})
