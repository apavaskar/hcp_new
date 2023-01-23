import {selectAuthInfo} from "../../../redux/selectors/authSelectors";
import {connect} from "react-redux";
import TitleWidget from "../../../widgets/TitleWidget";
import {Col, Input, Row, Select} from "antd";
import {useEffect} from "react";

const SearchLocationComponent = ({authInfo, locationTypes}) => {

    useEffect(()=> {

    },[])

    const { Option } = Select;
    const changeSearchForm = (value, item) => {
        console.log(value, item)
    }

    return(
        <>
            <TitleWidget title={'Search Locations'} />
            <Row gutter={[16,16]}>
                <Col span={6}><Input placeholder="Location Name" /></Col>
                <Col span={6}><Select
                    defaultValue="lucy"
                    style={{
                        width: 120,
                    }}
                    onChange={(value) => changeSearchForm(value, 'type')}
                >
                    <Option value="jack">Jack</Option>
                    <Option value="lucy">Lucy</Option>
                    <Option value="disabled" disabled>
                        Disabled
                    </Option>
                    <Option value="Yiminghe">yiminghe</Option>
                </Select></Col>
            </Row>
        </>
    )

}

const mapState = (state) => {
    const authInfo = selectAuthInfo(state)
    return { authInfo }
}

const actions = {
}


export default connect(mapState, actions)(SearchLocationComponent)
