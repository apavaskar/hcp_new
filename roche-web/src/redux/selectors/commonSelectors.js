import {createSelector} from 'reselect'

const common = (state) => state.common
const formMeta = (state) => state.common.formMeta
const searchMeta = (state) => state.common.searchMeta
const searchResults = state => state.common.searchResults
const selectResult = state => state.common.selectResult
const initValues = state => state.common.formInitValues
const saveMeta = state => state.common.saveMeta
const newMeta = state => state.common.newMeta
const success = state => state.common.success

export const selectFormMeta = createSelector(formMeta, (formMetaSelect) => formMetaSelect)
export const selectSearchMeta = createSelector(searchMeta, (searchMetaSelect) => searchMetaSelect)
export const selectSearchResults = createSelector(searchResults, (searchResultsSelect) => searchResultsSelect)
export const selectSelectResult = createSelector(selectResult, (selectResultSelect) => selectResultSelect)
export const selectFormInitValues = createSelector(initValues, (initValuesSelect) => initValuesSelect)
export const selectSaveMeta = createSelector(saveMeta, (saveMetaSelect) => saveMetaSelect)
export const selectNewMeta = createSelector(newMeta, (newMetaSelect) => newMetaSelect)
export const selectSuccess = createSelector(success, (successSelect) => successSelect)