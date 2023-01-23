import React, { useEffect } from 'react'
import {Col, Divider, Row, Skeleton, Typography} from 'antd'
import PropTypes from 'prop-types'
import { selectAuthInfo, selectProfileInfo } from '../../redux/selectors/authSelectors'
import { connect } from 'react-redux'
import { loadUserProfileStartAction } from '../../redux/actions/auth/authActions'
import { selectPageTitle } from '../../redux/selectors/uiSelectors'
import './HeaderComponent.less'
const HeaderComponent = ({ authInfo, profileInfo, handleLoadProfileInfo, pageTitle }) => {
  useEffect(() => {
    handleLoadProfileInfo({
      certificate: authInfo.certificate,
      id: authInfo.userId,
    })
  }, [])
  const {Title} = Typography
  return (
    <Row justify={'space-between'} style={{ height: '100%' }}>
      <Col span={4} offset={20}>
        <Skeleton loading={authInfo === null} size={'small'} paragraph={{ rows: 0 }}>
          <Title level={5}>{authInfo === null ? '' : authInfo.employeeName}</Title>
        </Skeleton>
      </Col>
    </Row>
  )
}

HeaderComponent.propTypes = {
  authInfo: PropTypes.any,
  profileInfo: PropTypes.any,
  pageTitle: PropTypes.any,
  handleLoadProfileInfo: PropTypes.func,
}

const mapState = (state) => {
  const authInfo = selectAuthInfo(state)
  const profileInfo = selectProfileInfo(state)
  const pageTitle = selectPageTitle(state)
  return { authInfo, profileInfo, pageTitle }
}

const actions = {
  handleLoadProfileInfo: loadUserProfileStartAction,
}

export default connect(mapState, actions)(HeaderComponent)
