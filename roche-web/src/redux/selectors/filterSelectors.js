import { createSelector } from 'reselect'

const filter = (state) => state.filter
const hierarchy = (state) => state.filter.hierarchy

export const selectHierarchy = createSelector(hierarchy,
    (hierarchySelect) => hierarchySelect)
