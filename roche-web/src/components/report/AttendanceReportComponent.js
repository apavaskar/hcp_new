import PropTypes from 'prop-types';
import {selectAuthInfo, selectProfileInfo} from '../../redux/selectors/authSelectors';
import HierarchyFilter from '../filters/HierarchyFilter';
import TitleWidget from '../../widgets/TitleWidget';
import {Button, Col, DatePicker, Row, Table} from 'antd';
import {useEffect, useState} from 'react';
import {connect} from 'react-redux';
import {attendanceReportStartAction} from '../../redux/actions/effort-report/effortReportActions';
import {toYyyyMm} from '../../utils/DateUtils';
import {selectAttendanceReport} from '../../redux/selectors/effortReportSelectors';
import {Excel} from 'antd-table-saveas-excel';

const AttendanceReportComponent = ({handleSubmitReport, authInfo, report}) => {
    const[form, setForm] = useState({})
    const [columns, setColumns] = useState([])

    useEffect(()=> {
        let cols = [
            {
                title: 'Name',
                width: 150,
                dataIndex: 'employee',
                key: 'user_name',
                render: item => item.name,
                fixed: 'left'
            },
            {
                title: 'Location',
                width: 150,
                dataIndex: 'location',
                key: 'location_name',
                render: item => item.name,
                fixed: 'left'
            },
            {
                title: 'Date',
                dataIndex: 'detailsList',
                children: [...Array(report.numDays).keys()].map(i => {
                        return {
                            title: `${i+1}`,
                            dataIndex: 'detailsList',
                            width: 100,
                            key: 'key-' + i,
                            render: item => {
                                switch (item[i].activityType) {
                                    case 'NC':
                                        return {
                                            props: {
                                                style: {background: 'orange'}
                                            },
                                            children: item[i].activityType
                                        }
                                    case 'WO':
                                        return {
                                            props: {
                                                style: {background: 'red'}
                                            },
                                            children: item[i].activityType
                                        }
                                    default:

                                        return {
                                            props: {
                                                style: {background: 'green'}
                                            },
                                            children: <>
                                                {item[i].activityType + ': ' + item[i].countActivity}<br/>
                                                {'# Ord:' +  item[i].countOrders}<br/>
                                                {'# Inv:' +  item[i].countInvoices}
                                            </>
                                        }

                                }
                            }
                        }
                    }
                )
            }

        ]


        setColumns(cols)
    },[report])

    const changeForm = (value, field) => {
        setForm({...form, [field]: value})
    }

    const submitReport = () => {
        handleSubmitReport({
            locationId: form.location,
            yearMonth: toYyyyMm(form.date),
            certificate: authInfo.token
        })
    }

    const handleClick = () => {
        const excel = new Excel();
        excel
            .addSheet('test')
            .addColumns(columns)
            .addDataSource(report.rows, {
                str2Percent: true
            })
            .saveAs('Excel.xlsx');
    };

    return (
        <>
            <TitleWidget title={'Attendance Report'} />
            <Row gutter={16}>
                <Col span={4}>
                    <HierarchyFilter onSelect={(value) => changeForm(value, 'location')}/>
                </Col>
                <Col span={3}>
                    <DatePicker onChange={(date)=> changeForm(date, 'date')} picker='month' />
                </Col>
                <Col span={4}>
                    <Button type={'primary'} onClick={submitReport}>Submit</Button>
                </Col>
            </Row>

            <Table
                style={{marginTop: 20}}
                dataSource={report.rows}
                columns={columns}
                scroll={{
                    x: 2000,
                }}
            />
        </>
    )
}

AttendanceReportComponent.propTypes = {
    authInfo: PropTypes.any,
    profileInfo: PropTypes.any,
    handleSubmitReport: PropTypes.func,
    report: PropTypes.any
}

const mapState = (state) => {
    const authInfo = selectAuthInfo(state)
    const profileInfo = selectProfileInfo(state)
    const report = selectAttendanceReport(state)
    return { authInfo, profileInfo, report }
}

const actions = {
    handleSubmitReport: attendanceReportStartAction
}

export default connect(mapState, actions)(AttendanceReportComponent)
