import React, {useEffect} from "react";
import {Select} from "antd";
import PropTypes from "prop-types";
import {selectAuthInfo} from "../../../redux/selectors/authSelectors";
import {connect} from "react-redux";
import {commonSelectStartAction} from "../../../redux/actions/common/commonActions";
import {selectSelectResult} from "../../../redux/selectors/commonSelectors";

const MultiSelectField = ({onChange, handleInitSelect, init, name, authInfo, selectResult, value}) => {
    console.log(init)
    useEffect(() => {
        handleInitSelect({
            api: init,
            certificate: authInfo.certificate,
            name: name
        })
    }, [name])


    return <Select
        mode={'multiple'}
        style={{width: '100%'}}
        onChange={onChange}
        value={(value && value.id) ? value.id : value}
        options={selectResult[name]}
    />
}

MultiSelectField.propTypes = {
    authInfo: PropTypes.any,
    handleInitSelect: PropTypes.func,
    onChange: PropTypes.func,
    init: PropTypes.string,
    name: PropTypes.string,
    selectResult: PropTypes.any
}

const mapState = (state) => {
    const authInfo = selectAuthInfo(state)
    const selectResult = selectSelectResult(state)
    return {authInfo, selectResult}
}

const actions = {
    handleInitSelect: commonSelectStartAction
}

export default connect(mapState, actions)(MultiSelectField)
