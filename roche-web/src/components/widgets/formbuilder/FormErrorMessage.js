import React from 'react'
import {Typography} from "antd";

const {Text} = Typography;
const FormErrorMessage = ({message}) => {
    if (message === undefined) {
        return <></>
    }
    return (
        <Text type="danger">{message}</Text>
    )
}

export default FormErrorMessage
