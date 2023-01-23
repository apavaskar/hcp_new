import React, {useEffect} from 'react'
import PropTypes from "prop-types";
import {selectAuthInfo} from "../../redux/selectors/authSelectors";
import {connect} from "react-redux";
import {
    commonNewMetaStartAction,
    commonSearchMetaStartAction,
    commonSearchStartAction,
    commonUpdateInitStartAction,
    getFormMetaStartAction
} from "../../redux/actions/common/commonActions";
import TitleWidget from "../../widgets/TitleWidget";
import {
    selectFormInitValues,
    selectFormMeta,
    selectNewMeta,
    selectSearchMeta,
    selectSearchResults
} from "../../redux/selectors/commonSelectors";
import {Col, Row} from "antd";
import {useParams} from "react-router-dom";
import SquerForm from "../widgets/formbuilder/SquerForm";

const CommonNewComponent = ({
                                authInfo, formMeta, searchMeta,
                                handleSearch, handleLoadFormMeta,
                                handleLoadSearchMeta, searchResult,
                                handleInitForm, initialValues, handleNewMeta, newMeta
                            }) => {
    const params = useParams()

    useEffect(() => {
        handleLoadFormMeta({
            code: `add-${params.code}`,
            certificate: authInfo.certificate
        })
    }, [params.id, params.code])

    const handleNewPressed = (data) => {
        handleNewMeta({
            entity_name: `${params.code}`,
            certificate: authInfo.certificate,
            data: data
        })
    }


    return (
        <Row gutter={[16, 16]}>
            <Col span={24}>
                <TitleWidget title={formMeta.title}/>
            </Col>
            <Col span={24}>
                <SquerForm meta={formMeta} actions={{submitAction: (data) => handleNewPressed(data)}} initialValues={initialValues}/>
            </Col>

        </Row>
    )
}

CommonNewComponent.propTypes = {
    authInfo: PropTypes.any,
    handleSearch: PropTypes.func,
    navigation: PropTypes.any,
    searchMeta: PropTypes.any,
    searchResult: PropTypes.array,
    handleLoadSearchMeta: PropTypes.func,
    handleInitForm: PropTypes.func,
    initialValues: PropTypes.any,
    handleNewMeta: PropTypes.func,
    newMeta: PropTypes.any
}

const mapState = (state) => {
    const authInfo = selectAuthInfo(state)
    const formMeta = selectFormMeta(state)
    const searchMeta = selectSearchMeta(state)
    const searchResult = selectSearchResults(state)
    const initialValues = selectFormInitValues(state)
    const newMeta = selectNewMeta(state)
    return {authInfo, formMeta, searchMeta, searchResult, initialValues, newMeta}
}

const actions = {
    handleSearch: commonSearchStartAction,
    handleLoadFormMeta: getFormMetaStartAction,
    handleLoadSearchMeta: commonSearchMetaStartAction,
    handleInitForm: commonUpdateInitStartAction,
    handleNewMeta: commonNewMetaStartAction
}

export default connect(mapState, actions)(CommonNewComponent)
