import PropTypes from "prop-types";
import {selectAuthInfo} from "../../../redux/selectors/authSelectors";
import {connect} from "react-redux";
import {AutoComplete, Input, Spin} from "antd";
import {useEffect, useState} from "react";
import {LoadingOutlined} from '@ant-design/icons';

const AutoCompleteField = (props) => {
    const [searching, setSearching] = useState(false)

    useEffect(() => {
        if (searching === true) {
            setSearching(false)
        }
    }, [props.options])

    const antIcon = <LoadingOutlined style={{fontSize: 24}} spin/>;
    const [selectedValue, setSelectedValue] = useState({})
    const selectValue = (option) => {
        setSelectedValue(option)
    }

    const search = (e) => {
        setSearching(true)
        props.onSearch(e)
    }
    return (
        <Spin indicator={antIcon} spinning={searching}>
            <AutoComplete
                style={{width: '100%'}}
                options={props.options}
                onSelect={(val, option) => selectValue(option)}
                onSearch={search}
                onChange={e => props.onChange(e)}
                value={selectedValue.label}
            >
                <Input.Search size="large" placeholder="Search" value={selectedValue.label}/>
            </AutoComplete>
        </Spin>
    )
}

AutoCompleteField.propTypes = {
    authInfo: PropTypes.any,
}

const mapState = (state) => {
    const authInfo = selectAuthInfo(state)
    return {authInfo}
}

const actions = {}

export default connect(mapState, actions)(AutoCompleteField)
