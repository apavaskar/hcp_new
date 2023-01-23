import PropTypes from 'prop-types';
import {selectAuthInfo, selectProfileInfo} from '../../redux/selectors/authSelectors';
import TitleWidget from '../../widgets/TitleWidget';
import {connect} from 'react-redux';
import {effortReportStartAction} from '../../redux/actions/effort-report/effortReportActions';
import {selectEffortReport} from '../../redux/selectors/effortReportSelectors';
import {Button, Col, DatePicker, Row, Table} from 'antd';
import HierarchyFilter from '../filters/HierarchyFilter';
import {useState} from 'react';
import {toYyyyMm} from '../../utils/DateUtils';
import {Excel} from 'antd-table-saveas-excel';


const EffortReportComponent = ({handleSubmitReport, authInfo, report}) => {
    const[form, setForm] = useState({})
    const columns = [
        {
            title: 'RTF',
            width: 25,
            dataIndex: 'rtfName',
            key: 'rtfName',
            fixed: 'left'
        },
        {
            title: 'HQ Name',
            width: 25,
            dataIndex: 'hqName',
            key: 'hqName',
            fixed: 'left'
        },
        {
            title: '# Field Days',
            width: 10,
            dataIndex: 'fwdNum',
            key: 'fwdNum',
            align: 'right',
        },
        {
            title: '# Customers',
            width: 15,
            dataIndex: 'customerListNum',
            key: 'customerListNum',
            align: 'right',
        },
        {
            title: '# Calls',
            width: 10,
            dataIndex: 'totalCallsDone',
            key: 'totalCallsDone',
            align: 'right',

        },
        {
            title: '# Met Once',
            width: 10,
            dataIndex: 'totalMetOnce',
            key: 'totalMetOnce',
            align: 'right',
        },
        {
            title: '# Met > 1',
            width: 10,
            dataIndex: 'totalMetMultiple',
            key: 'totalMetMultiple',
            align: 'right',
        },
        {
            title: '# Missed',
            width: 10,
            dataIndex: 'totalMissedCalls',
            key: 'totalMissedCalls',
            align: 'right',
        },
        {
            title: '# WholeSeller Repeat',
            width: 20,
            dataIndex: 'totalWholesellerRepeatCalls',
            key: 'totalWholesellerRepeatCalls',
            align: 'right',
        },
        {
            title: '# Retailer Repeat',
            width: 20,
            dataIndex: 'totalRetailerRepeatCalls',
            key: 'totalRetailerRepeatCalls',
            align: 'right',
        },
        {
            title: 'WholeSeller Order Value',
            width: 20,
            dataIndex: 'l2OrderValue',
            key: 'l2OrderValue',
            render: item => item.toFixed(2),
            align: 'right',
        },
        {
            title: 'Retailer Order Value',
            width: 15,
            dataIndex: 'l3OrderValue',
            key: 'l3OrderValue',
            render: item => item.toFixed(2),
            align: 'right',
        },
        {
            title: '# Productive Calls',
            width: 15,
            dataIndex: 'productiveCalls',
            key: 'productiveCalls',
            align: 'right',
        },
        {
            title: '# Customer with Inv',
            width: 15,
            dataIndex: 'customersWithInventory',
            key: 'customersWithInventory',
            align: 'right',
        },
        {
            title: '# WholeSeller Invoice',
            width: 20,
            dataIndex: 'l2InvoiceCount',
            key: 'l2InvoiceCount',
            align: 'right',
        },
        {
            title: 'WholeSeller Invoice Value',
            width: 20,
            dataIndex: 'l2InvoiceValue',
            key: 'l2InvoiceValue',
            render: item => item.toFixed(2),
            align: 'right',
        },
        {
            title: '# Retailer Invoice',
            width: 20,
            dataIndex: 'l3InvoiceCount',
            key: 'l3InvoiceCount',
            align: 'right',
        },
        {
            title: 'WholeSeller Retailer Value',
            width: 20,
            dataIndex: 'l3InvoiceValue',
            key: 'l3InvoiceValue',
            render: item => item.toFixed(2),
            align: 'right',
        },
    ]
    const changeForm = (value, field) => {
        setForm({...form, [field]: value})
    }

    const handleClick = () => {
        const excel = new Excel();
        excel
            .addSheet('test')
            .addColumns(columns)
            .addDataSource(report, {
                str2Percent: true
            })
            .saveAs('Excel.xlsx');
    };


    const submitReport = () => {
        handleSubmitReport({
            locationId: form.location,
            yearMonth: toYyyyMm(form.date),
            certificate: authInfo.certificate
        })
    }

    return (
        <>
            <TitleWidget title={'Effort Report'} />
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
            <Row>
                <Col span={2} offset={22}>
                    <Button type={'primary'} onClick={handleClick}>Export</Button>
                </Col>
            </Row>
            <Table
                style={{marginTop: 20}}
                dataSource={report}
                columns={columns}
                scroll={{
                    x: 2000,
                }}
            />
        </>
    )
}

EffortReportComponent.propTypes = {
    authInfo: PropTypes.any,
    profileInfo: PropTypes.any,
    handleSubmitReport: PropTypes.func,
    report: PropTypes.any
}

const mapState = (state) => {
    const authInfo = selectAuthInfo(state)
    const profileInfo = selectProfileInfo(state)
    const report = selectEffortReport(state)
    console.log(report)
    return { authInfo, profileInfo, report }
}

const actions = {
    handleSubmitReport: effortReportStartAction
}

export default connect(mapState, actions)(EffortReportComponent)
