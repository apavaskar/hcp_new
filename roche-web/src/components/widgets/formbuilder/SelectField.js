import React, {useEffect} from "react";
import {Select} from "antd";
import PropTypes from "prop-types";
import {selectAuthInfo} from "../../../redux/selectors/authSelectors";
import {connect} from "react-redux";
import {commonSelectStartAction} from "../../../redux/actions/common/commonActions";
import {selectSelectResult} from "../../../redux/selectors/commonSelectors";

const SelectField = ({onChange, handleInitSelect, init, name, authInfo, selectResult, value, disabled}) => {
    // console.log(value)
    // useEffect(() => {
    //     handleInitSelect({
    //         api: init,
    //         certificate: authInfo.certificate,
    //         name: name
    //     })
    // }, [name])
    if (selectResult === undefined) {
        return <></>
    }

    return <Select
        style={{width: '100%'}}
        onChange={onChange}
        value={(value && value.id) ? value.id : value}
        options={selectResult[name] || []}
        disabled={disabled == null ? false: disabled}
        optionFilterProp="children"
        showSearch
        filterOption={(input, option) => (option?.label.toLowerCase() ?? '').includes(input.toLowerCase())}
        filterSort={(optionA, optionB) =>
            (optionA?.label ?? '').toLowerCase().localeCompare((optionB?.label ?? '').toLowerCase())}
    />
}

SelectField.propTypes = {
    authInfo: PropTypes.any,
    handleInitSelect: PropTypes.func,
    onChange: PropTypes.func,
    init: PropTypes.string,
    name: PropTypes.string,
    selectResult: PropTypes.any
}

const mapState = (state) => {
    const authInfo = selectAuthInfo(state)

    return {authInfo}
}

const actions = {
    handleInitSelect: commonSelectStartAction
}

export default connect(mapState, actions)(SelectField)
