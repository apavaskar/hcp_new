import React from "react";
import {Input} from "antd";

const InputField = (props) => {
    return <Input onChange={(e) => props.onChange(e.target.value)} style={{width: '100%'}}
                  value={props.value}/>
}

export default InputField
