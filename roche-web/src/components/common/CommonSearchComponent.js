import React, {useEffect, useState} from 'react'
import PropTypes from "prop-types";
import {selectAuthInfo} from "../../redux/selectors/authSelectors";
import {connect} from "react-redux";
import {commonSearchMetaStartAction, commonSearchResetAction, commonSearchStartAction, getFormMetaStartAction} from "../../redux/actions/common/commonActions";
import {useNavigate, useParams} from "react-router-dom";
import TitleWidget from "../../widgets/TitleWidget";
import {selectFormMeta, selectSearchMeta, selectSearchResults} from "../../redux/selectors/commonSelectors";
import {Button, Col, Row, Table} from "antd";
import SquerForm from "../widgets/formbuilder/SquerForm";


const CommonSearchComponent = ({
                                   authInfo, formMeta, searchMeta,
                                   handleSearch, handleLoadFormMeta,
                                   handleLoadSearchMeta, searchResult,
                                   handleResetFormMeta
                               }) => {

    let navigate = useNavigate();
    let params = useParams();

    const [resultMeta, setResultMeta] = useState()

    const paintLink = (item, fun) => {
        return <Button onClick={fun} type={'link'}>Edit</Button>
    }

    useEffect(() => {
        handleLoadFormMeta({
            code: `search-${params.code}`,
            certificate: authInfo.certificate
        })
        handleLoadSearchMeta({
            entity_name: `search-${params.code}`,
            certificate: authInfo.certificate
        })
        return () => handleResetFormMeta()
    }, [params])

    useEffect(() => {
        if (searchMeta.result !== undefined) {
            setResultMeta(searchMeta.result.map(row => {
                if (row.render !== null) {
                    row.render = eval(row.render)
                }
                return row
            }))
        }
    }, [searchMeta.result])

    const handleSearchPressed = (data) => {
        handleSearch({
            searchAPI: formMeta.submitAction,
            certificate: authInfo.certificate,
            data: data
        })
    }

    const handleAddPressed = (data) => {
        navigate(`/admin/${params.code}/new`)
    }


    return (
        <Row gutter={[16, 16]}>
            <Col span={24}>
                <TitleWidget title={formMeta.title}/>
            </Col>
            <Col span={24}>
                <SquerForm meta={formMeta} actions={{submitAction: handleSearchPressed, handleAddPressed: handleAddPressed}}/>
            </Col>
            <Col span={24}>
                <Table dataSource={searchResult} columns={resultMeta} rowKey={'id'}/>
            </Col>
        </Row>
    )
}

CommonSearchComponent.propTypes = {
    authInfo: PropTypes.any,
    handleSearch: PropTypes.func,
    navigation: PropTypes.any,
    searchMeta: PropTypes.any,
    searchResult: PropTypes.array,
    handleLoadSearchMeta: PropTypes.func,
    handleResetFormMeta: PropTypes.func
}

const mapState = (state) => {
    const authInfo = selectAuthInfo(state)
    const formMeta = selectFormMeta(state)
    const searchMeta = selectSearchMeta(state)
    const searchResult = selectSearchResults(state)
    return {authInfo, formMeta, searchMeta, searchResult}
}

const actions = {
    handleSearch: commonSearchStartAction,
    handleLoadFormMeta: getFormMetaStartAction,
    handleLoadSearchMeta: commonSearchMetaStartAction,
    handleResetFormMeta: commonSearchResetAction
}

export default connect(mapState, actions)(CommonSearchComponent)
