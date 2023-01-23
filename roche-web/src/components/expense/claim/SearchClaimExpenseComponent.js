import {selectAuthInfo, selectProfileInfo} from "../../../redux/selectors/authSelectors";
import TitleWidget from "../../../widgets/TitleWidget";
import {Button, Col, DatePicker, Row, Select, Table} from "antd";
import {useState} from "react";
import {changeLocationTypeAction, searchExpenseStartAction} from "../../../redux/actions/expense/expenseActions";
import {toDisplayDateDay, toYyyyMm} from "../../../utils/DateUtils";
import {selectExpenseHeaders, selectSummary} from "../../../redux/selectors/expenseReportSelectors";
import {Typography} from "antd";
import { connect } from 'react-redux'

const SearchClaimExpenseComponent = ({authInfo,
                                      profileInfo,
                                         summary,
                                      handleSearchExpense,
                                      handleChangeLocationType,
                                      headers}) => {
    const[form, setForm] = useState({})

    const changeForm = (value, field) => {
        setForm({...form, [field]: value})
    }

    const changeLocationType = (value, id) => {
        handleChangeLocationType({
            type: value,
            id: id
        })
    }

    let cols = [
        {
            title: 'Date',
            width: 10,
            dataIndex: 'dateExpense',
            key: 'dateExpense',
            render: item => toDisplayDateDay(item),
            fixed: 'left'
        },
        {
            title: 'Activity Type',
            width: 10,
            dataIndex: 'activityId',
            key: 'activityId',
            render: item => {
              switch (item) {
                  case 0: return 'None'
                  case 1: return 'Calls'
                  case 2: return 'Leave'
              }
            },
            fixed: 'left'
        },
        {
            title: 'Location Type',
            width: 15,
            dataIndex: 'location_type',
            key: 'location_type',
            render: (text, record )=> {
                if (record.activityId === 1) {
                    return <Select
                        defaultValue=''
                        style={{
                            width: 180,
                        }}
                        onChange={(v) => changeLocationType(v, record.id)}>
                        <Select.Option value="HQ">HQ</Select.Option>
                        <Select.Option value="EX-HQ">EX HQ</Select.Option>
                        <Select.Option value="OS">OUTSTATION</Select.Option>
                        <Select.Option value="EX-OS">EX OUTSTATION</Select.Option>
                    </Select>
                } else {
                    return ''
                }
            }
        },
        {
            title: 'Towns Visited',
            width: 20,
            dataIndex: 'townsVisited',
            key: 'towns',
            render: (item, record) => {
                if (item.length === 0) {
                    return  '-'
                }
                return item.map(i => i.name).join(' -> ')
            }
        },
        {
            title: 'Distance',
            width: 10,
            dataIndex: 'distance',
            key: 'distance',
            render: (item) => {
                return 0
            }
        },
        {
            title: 'Daily Allowance',
            width: 10,
            dataIndex: 'dailyAllowance',
            key: 'dailyAllowance'
        },
        {
            title: 'Fare',
            width: 10,
            dataIndex: 'fare',
            key: 'fare',
            render: item =>  '0'
        }

    ]
    const submitReport = () => {
        handleSearchExpense({
            certificate: authInfo.token,
            employeeId: profileInfo.user.id,
            yearMonth: toYyyyMm(form.date)
        })
    }
    return(
        <>
            <TitleWidget title={'Claim Expense'} />
            <Row gutter={16}>
                <Col span={3}>
                    <DatePicker onChange={(date)=> changeForm(date, 'date')} picker='month' />
                </Col>
                <Col span={4}>
                    <Button type={'primary'} onClick={submitReport}>Submit</Button>
                </Col>
            </Row>
            <Row gutter={16}>
                <Table
                    pagination={false}
                    style={{marginTop: 20}}
                    dataSource={headers.details}
                    columns={cols}
                    scroll={{
                        x: 1000,
                    }}
                />
            </Row>
            <Row>
                <Col span={4}>Claim Summary</Col>
                <Col span={3}><Typography.Title level={5} style={{ margin: 0 }}>DA: {summary.totalDA}</Typography.Title></Col>
                <Col span={3}><Typography.Title level={5} style={{ margin: 0 }}>Fare: {summary.totalFare}</Typography.Title></Col>
            </Row>

        </>
        )
}

const mapState = (state) => {
    const authInfo = selectAuthInfo(state)
    const profileInfo = selectProfileInfo(state)
    const headers = selectExpenseHeaders(state)
    const summary = selectSummary(state)
    return { authInfo, profileInfo, headers, summary }
}

const actions = {
    handleSearchExpense: searchExpenseStartAction,
    handleChangeLocationType: changeLocationTypeAction
}


export default connect(mapState, actions)(SearchClaimExpenseComponent)
