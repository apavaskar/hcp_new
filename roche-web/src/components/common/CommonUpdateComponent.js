import React, {useEffect} from 'react'
import PropTypes from "prop-types";
import {selectAuthInfo} from "../../redux/selectors/authSelectors";
import {connect} from "react-redux";
import {
    commonSaveMetaStartAction,
    commonSearchMetaStartAction, commonSearchResetAction,
    commonSearchStartAction, commonSelectStartAction,
    commonUpdateInitStartAction,
    getFormMetaStartAction
} from "../../redux/actions/common/commonActions";
import TitleWidget from "../../widgets/TitleWidget";
import {
    selectFormInitValues,
    selectFormMeta,
    selectSaveMeta,
    selectSearchMeta,
    selectSearchResults, selectSelectResult, selectSuccess
} from "../../redux/selectors/commonSelectors";
import {Col, Row} from "antd";
import {useParams} from "react-router-dom";
import SquerForm from "../widgets/formbuilder/SquerForm";
import {toDotNotation} from 'object-nested-to-dot'
import {useNavigate} from "react-router-dom";

const CommonUpdateComponent = ({
                                   authInfo, formMeta,handleInitSelect, selectResults,
                                   handleInitForm, initialValues,handleSave, success,handleResetFormMeta
                               }) => {
    let navigate = useNavigate();
    const params = useParams()
    console.log(params)

    useEffect(() => {
        return () => handleResetFormMeta()
    },[])

    const setValue = (object, path, value) => {
        console.log(object, path)
        var keys = path.split('.'),
            last = keys.pop();
        keys.reduce((o, k) => o[k] = o[k] || {}, object)[last] = value;
        return object;
    }

    useEffect(() => {
        handleInitForm({
            code: `edit-${params.code}`,
            id: params.id,
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


    const handleSavePressed = (data) => {
        var target = Object
            .entries(data)
            .reduce((o, [k, v]) => setValue(o, k, v), {});
        target["id"] = initialValues.id;
        handleSave({
            entity_name: `${params.code}`,
            certificate: authInfo.certificate,
            data: target
        })


    }


    return success ? (
        navigate(`/home/${params.code}/search`)
        ):(
        <Row gutter={[16, 16]}>
            <Col span={24}>
                <TitleWidget title={formMeta.title}/>
            </Col>
            <Col span={24}>
                <SquerForm meta={formMeta} actions={{submitAction: (data) => handleSavePressed(data)}} initialValues={toDotNotation(initialValues)} selectResults={selectResults}/>
            </Col>

        </Row>
    )
}

CommonUpdateComponent.propTypes = {
    authInfo: PropTypes.any,
    handleSearch: PropTypes.func,
    navigation: PropTypes.any,
    searchMeta: PropTypes.any,
    searchResult: PropTypes.array,
    handleLoadSearchMeta: PropTypes.func,
    handleInitForm: PropTypes.func,
    initialValues: PropTypes.any,
    handleSave:PropTypes.func,
    saveMeta:PropTypes.any,
    success: PropTypes.any,
    handleInitSelect: PropTypes.func
}

const mapState = (state) => {
    const authInfo = selectAuthInfo(state)
    const formMeta = selectFormMeta(state)
    const searchMeta = selectSearchMeta(state)
    const searchResult = selectSearchResults(state)
    const initialValues = selectFormInitValues(state)
    const saveMeta = selectSaveMeta(state)
    const success = selectSuccess(state)
    const selectResults = selectSelectResult(state)
    return {authInfo, formMeta, searchMeta, searchResult, initialValues, saveMeta, success, selectResults}
}

const actions = {
    handleSearch: commonSearchStartAction,
    handleSave: commonSaveMetaStartAction,
    handleLoadFormMeta: getFormMetaStartAction,
    handleLoadSearchMeta: commonSearchMetaStartAction,
    handleInitForm: commonUpdateInitStartAction,
    handleInitSelect: commonSelectStartAction,
    handleResetFormMeta: commonSearchResetAction
}

export default connect(mapState, actions)(CommonUpdateComponent)
