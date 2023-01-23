import PropTypes from 'prop-types';
import {selectAuthInfo, selectProfileInfo} from '../../redux/selectors/authSelectors';
import {connect} from 'react-redux';
import { Select, Spin} from 'antd';
import {employeeHierarchyStartAction} from '../../redux/actions/filter/filterActions';
import React, {useEffect, useState} from 'react';
import {selectHierarchy} from "../../redux/selectors/filterSelectors";
import _ from 'lodash'
const { Option } = Select;
const HierarchyFilter = ({authInfo,
                          profileInfo,
                          handleLoadSelect,
                          hierarchy,
                          onSelect}) => {

    const [selectHierarchy, setSelectHierarchy] = useState([])
    const [selectedValue, setSelectedValue] = useState()
    useEffect(()=> {
        handleLoadSelect({
            locationId: profileInfo.location.id,
            certificate: authInfo.certificate
        })
    },[])

    useEffect(()=> {
        setSelectHierarchy(hierarchy)
    },[hierarchy])
    const handleSelectEmployee = (value) => {
        setSelectedValue(value)
        onSelect(value)
    }

    const handleSearch  = (value) => {
        const selected = hierarchy.filter(h => {
            return h.location.ciName.startsWith(value.toLowerCase())})
        setSelectHierarchy(selected)
    }
    return (
        <Spin tip={'Loading Filters'} spinning={_.isEmpty(hierarchy)} >
            <Select
                showSearch
                onSearch={handleSearch}
                filterOption={false}
                defaultValue={`${selectedValue ? selectedValue.value : ''}`}
                style={{
                    width: '100%',
                }}
                onChange={handleSelectEmployee}
                allowClear>
                {selectHierarchy.map(e =>
                    <Option value={e.location.id} key={e.location.id}>
                        {e.location.name}</Option>
                )}
            </Select>
        </Spin>
    )
}

HierarchyFilter.propTypes = {
    authInfo: PropTypes.any,
    profileInfo: PropTypes.any,
    hierarchy: PropTypes.any,
    handleLoadSelect: PropTypes.func,
    onSelect: PropTypes.func
}

const mapState = (state) => {
    const authInfo = selectAuthInfo(state)
    const profileInfo = selectProfileInfo(state)
    const hierarchy = selectHierarchy(state)
    return { authInfo, profileInfo, hierarchy }
}

const actions = {
    handleLoadSelect: employeeHierarchyStartAction
}

export default connect(mapState, actions)(HierarchyFilter)
