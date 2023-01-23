import React from 'react';
import PropTypes from 'prop-types';
import {selectAuthInfo, selectUserPrivileges} from '../../redux/selectors/authSelectors';
import {connect} from 'react-redux';
import {Button} from 'antd';

const ActionButton = ({type, size, title, onClick, privilege, userPrivileges}) => {
    let showAction = false
    if (privilege === undefined) {
        showAction = true
    } else {
        showAction = userPrivileges[privilege] !== undefined
    }
    if (showAction === false) {
        return <></>
    }
    return (
        <Button type={type} size={size ? size : 'default'} onClick={onClick}>{title}</Button>
    )
}

ActionButton.propTypes = {
    authInfo: PropTypes.any,
    type: PropTypes.oneOf(['primary', 'default', 'dashed', 'text', 'link']),
    privilege: PropTypes.number,
    userPrivileges: PropTypes.any,
    size: PropTypes.oneOf(['large', 'default', 'small'])
}

const mapState = (state) => {
    const authInfo = selectAuthInfo(state)
    const userPrivileges = selectUserPrivileges(state)
    return {authInfo, userPrivileges}
}

const actions = {}

export default connect(mapState, actions)(ActionButton)
