import moment from 'moment'

const monthNames = ["","Jan","Feb","Mar", "Apr","May","Jun","Jul","Aug","Sep","Oct","Nov", "Dec"]

export const toYyyyMm = (date) => moment(date).format('yyyyMM')
export const toDisplayDateDay=(date) => moment(date).format(('DD, ddd'))
export const toMonthYear = (yyyyMm) => {
    console.log(yyyyMm)
    let year = `${yyyyMm}`.substring(0,4)
    let month = `${yyyyMm}`.substring(4)
    console.log(month)
    return monthNames[parseInt(month)] + "-" +  year
}
