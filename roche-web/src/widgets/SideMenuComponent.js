import PropTypes from 'prop-types'
import { selectAuthInfo } from '../redux/selectors/authSelectors'
import { connect } from 'react-redux'
import {Menu, Spin} from 'antd'
import { selectMenus } from '../redux/selectors/uiSelectors'
import React, { useState, useEffect } from 'react'
import { setPageTitle, uiMenuStartAction } from '../redux/actions/ui/uiActions'
import { useNavigate } from 'react-router-dom'

const SideMenuComponent = ({ menus, authInfo, handleLoadMenus, handleMenuClicked, handleResetFormMeta }) => {
  const navigate = useNavigate()
  useEffect(() => {
    handleLoadMenus({
      id: authInfo.userId,
      certificate: authInfo.certificate,
    })
  }, [])

  const menuClicked = (e) => {
    handleMenuClicked({ title: e.item.props.title })
    navigate(e.item.props.path)
  }

  return (
      <Spin tip={'Loading Menus'} spinning={menus.length === 0} >
    <Menu
      onClick={menuClicked}
      theme="light"
      defaultSelectedKeys={['1']}
      mode="inline"
      items={menus}
    />
      </Spin>
  )
}

SideMenuComponent.propTypes = {
  authInfo: PropTypes.any,
  menus: PropTypes.array,
  handleLoadMenus: PropTypes.func,
  handleMenuClicked: PropTypes.func,
}

const mapState = (state) => {
  const authInfo = selectAuthInfo(state)
  const menus = selectMenus(state)
    console.log(menus);
  return { authInfo, menus }
}

const actions = {
  handleLoadMenus: uiMenuStartAction,
  handleMenuClicked: setPageTitle,
}

export default connect(mapState, actions)(SideMenuComponent)
