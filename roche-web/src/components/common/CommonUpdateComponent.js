import React, {useEffect} from 'react'
import PropTypes from "prop-types";
import {selectAuthInfo} from "../../redux/selectors/authSelectors";
import {connect} from "react-redux";
import {
    commonSaveMetaStartAction,
    commonSearchMetaStartAction,
    commonSearchStartAction,
    commonUpdateInitStartAction,
    getFormMetaStartAction
} from "../../redux/actions/common/commonActions";
import TitleWidget from "../../widgets/TitleWidget";
import {
    selectFormInitValues,
    selectFormMeta,
    selectSaveMeta,
    selectSearchMeta,
    selectSearchResults
} from "../../redux/selectors/commonSelectors";
import {Col, Row} from "antd";
import {useParams} from "react-router-dom";
import SquerForm from "../widgets/formbuilder/SquerForm";
import {toDotNotation} from 'object-nested-to-dot'

const CommonUpdateComponent = ({
                                   authInfo, formMeta, searchMeta,
                                   handleSearch, handleLoadFormMeta,
                                   handleLoadSearchMeta, searchResult,
                                   handleInitForm, initialValues,handleSave, saveMeta
                               }) => {
    const params = useParams()
    console.log(params)

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


    return (
        <Row gutter={[16, 16]}>
            <Col span={24}>
                <TitleWidget title={formMeta.title}/>
            </Col>
            <Col span={24}>
                <SquerForm meta={formMeta} actions={{submitAction: (data) => handleSavePressed(data)}} initialValues={toDotNotation(initialValues)}/>
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
    saveMeta:PropTypes.any
}

const mapState = (state) => {
    const authInfo = selectAuthInfo(state)
    const formMeta = selectFormMeta(state)
    const searchMeta = selectSearchMeta(state)
    const searchResult = selectSearchResults(state)
    const initialValues = selectFormInitValues(state)
    const saveMeta = selectSaveMeta(state)
    return {authInfo, formMeta, searchMeta, searchResult, initialValues, saveMeta}
}

const actions = {
    handleSearch: commonSearchStartAction,
    handleSave: commonSaveMetaStartAction,
    handleLoadFormMeta: getFormMetaStartAction,
    handleLoadSearchMeta: commonSearchMetaStartAction,
    handleInitForm: commonUpdateInitStartAction
}

export default connect(mapState, actions)(CommonUpdateComponent)
