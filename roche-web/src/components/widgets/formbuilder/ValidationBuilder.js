import * as Yup from 'yup';

const buildValidationSchema = (validation) => {
    let y = getMainObject(validation.dataType)
    if (validation.isRequired === true) {
        y = y.required('Required')
    }
    return y
}

const getMainObject = (type) => {
    switch (type.toUpperCase()) {
        case 'STRING':
            return Yup.string()
        case 'PHONE':
            const phoneRegExp = /^((\\+[1-9]{1,4}[ \\-]*)|(\\([0-9]{2,3}\\)[ \\-]*)|([0-9]{2,4})[ \\-]*)*?[0-9]{3,4}?[ \\-]*[0-9]{3,4}?$/
            return Yup.string().matches(phoneRegExp, 'Phone number is not valid')
        default:
            return Yup.string()
    }
}

export default buildValidationSchema

