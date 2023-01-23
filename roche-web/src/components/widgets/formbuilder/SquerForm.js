import React from 'react';
import {Button, Col, Form, Input} from "antd";
import {template} from "lodash";
import SelectField from "./SelectField";
import MultiSelectField from "./MultiSelectField";

const SquerForm = ({meta, actions, initialValues}) => {
    const [form] = Form.useForm()
    if (meta === undefined || meta.attributes === undefined) {
        return <></>
    }
    const onFinish = (values) => {
        console.log(values)
        actions['submitAction'](values)
    };
    return (
        <Col span={24}>
            <Form
                form={form}
                onFinish={onFinish}
                labelCol={{span: 6}}
                layout={meta.inline ? 'inline' : 'horizontal'}
                initialValues={initialValues}
            >
                {meta.attributes.map((element, index) => {
                    if (element.type.toUpperCase() === 'SUBMIT') {

                    }
                    const w = element.span / 24 * 100
                    let validations = []
                    if (element.validations) {
                        const validation = element.validations
                        const message = template(validation.message)({[element.name]: element.props.label})
                        if (validation.isRequired === true) {
                            validations.push({required: true, message: message})
                        }
                    }
                    return (
                        <Form.Item key={index}
                                   wrapperCol={{
                                       offset: `${element.offset}`,
                                   }}
                                   rules={validations}
                                   style={{width: `calc(${w}%)`}}
                                   name={element.name}
                                   label={element.type === 'SUBMIT' || element.type === 'button' ? null : element.props.label}>
                            <FormElement type={element.type} element={element} actions={actions}/>
                        </Form.Item>
                    )
                })}
            </Form>
        </Col>
    );
}

const FormElement = ({type, element, actions, onChange, value}) => {
    switch (type.toUpperCase()) {
        case 'TEXT':
            return <Input placeholder={element.props.placeholder} onChange={onChange} value={value}/>
        case 'SUBMIT':
            return <Button type={'primary'} htmlType="submit">{element.props.label}</Button>
        case 'BUTTON':
            console.log(actions, element)
            return <Button onClick={actions[element.props.action]}>{element.props.label}</Button>
        case 'SELECT':
            console.log(element)
            return <SelectField name={element.name} init={element.onSearch} onChange={onChange} value={value}/>
        case 'MULTI_SELECT':
            return <MultiSelectField name={element.name} init={element.onSearch} onChange={onChange} value={value}/>
        default:
            return type
    }
}


export default SquerForm
