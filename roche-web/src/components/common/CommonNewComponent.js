import React, {useEffect} from 'react'
import PropTypes from "prop-types";
import {selectAuthInfo} from "../../redux/selectors/authSelectors";
import {connect} from "react-redux";
import {
    commonNewMetaStartAction,
    commonSearchMetaStartAction, commonSearchResetAction,
    commonSearchStartAction, commonSelectStartAction,
    commonUpdateInitStartAction,
    getFormMetaStartAction
} from "../../redux/actions/common/commonActions";
import TitleWidget from "../../widgets/TitleWidget";
import {
    selectFormInitValues,
    selectFormMeta,
    selectNewMeta,
    selectSearchMeta,
    selectSearchResults, selectSelectResult, selectSuccess
} from "../../redux/selectors/commonSelectors";
import {Col, Row} from "antd";
import {useParams} from "react-router-dom";
import SquerForm from "../widgets/formbuilder/SquerForm";
import {useNavigate} from "react-router-dom";

const CommonNewComponent = ({
                                authInfo, formMeta, handleLoadFormMeta, initialValues, handleNewMeta, success, selectResults,handleInitSelect,handleResetFormMeta
                            }) => {
    let navigate = useNavigate();
    const params = useParams()

    useEffect(() => {
        return () => handleResetFormMeta()
    },[])

    useEffect(() => {
        handleLoadFormMeta({
            code: `add-${params.code}`,
            certificate: authInfo.certificate
        })
    }, [params.id, params.code])

    useEffect(() => {
        (formMeta.attributes || []).filter(f => f.type == 'SELECT').forEach(f => {
            handleInitSelect({
                api: f.onSearch,
                certificate: authInfo.certificate,
                name: f.name
            })
        })
    }, [formMeta.id])

    const handleNewPressed = (data) => {
        handleNewMeta({
            entity_name: `${params.code}`,
            certificate: authInfo.certificate,
            data: data
        })
    }


    return success ? (
        navigate(`/home/${params.code}/search`)
    ): (
        <Row gutter={[16, 16]}>
            <Col span={24}>
                <TitleWidget title={formMeta.title}/>
            </Col>
            <Col span={24}>
                <SquerForm meta={formMeta} actions={{submitAction: (data) => handleNewPressed(data)}} initialValues={initialValues} selectResults={selectResults}/>
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
    newMeta: PropTypes.any,
    success: PropTypes.any,
    selectResults: PropTypes.any,
    handleInitSelect: PropTypes.func
}

const mapState = (state) => {
    const authInfo = selectAuthInfo(state)
    const formMeta = selectFormMeta(state)
    const searchMeta = selectSearchMeta(state)
    const searchResult = selectSearchResults(state)
    const initialValues = selectFormInitValues(state)
    const newMeta = selectNewMeta(state)
    const success = selectSuccess(state)
    const selectResults = selectSelectResult(state)
    return {authInfo, formMeta, searchMeta, searchResult, initialValues, newMeta, success, selectResults}
}

const actions = {
    handleSearch: commonSearchStartAction,
    handleLoadFormMeta: getFormMetaStartAction,
    handleLoadSearchMeta: commonSearchMetaStartAction,
    handleInitForm: commonUpdateInitStartAction,
    handleNewMeta: commonNewMetaStartAction,
    handleInitSelect: commonSelectStartAction,
    handleResetFormMeta: commonSearchResetAction
}

export default connect(mapState, actions)(CommonNewComponent)
