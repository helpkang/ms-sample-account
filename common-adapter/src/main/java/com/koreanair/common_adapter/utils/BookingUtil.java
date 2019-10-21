package com.koreanair.common_adapter.utils;

import org.apache.commons.lang3.StringUtils;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class BookingUtil {

    /**
     * FlightTime을 HH:mm으로 계산 예) 18300000(ms) => 5:50
     *
     * @param time
     * @return
     */
    public static String calcFlightTime(String time) {
        String retTime = "";
        if (StringUtils.isNotEmpty(time)) {
            try {
                int timeMinute = Integer.parseInt(time) / (60 * 1000);
                retTime = String.valueOf(timeMinute / 60) + ":";
                retTime += timeMinute % 60 >= 10 ? String.valueOf(timeMinute % 60)
                        : "0" + String.valueOf(timeMinute % 60);
            } catch (Exception e) {
                //LoggingUtil.doMessageLogging("FlightTime calculation error. FlightTime: {}", time);
                return time;
            }
        }
        return retTime;
    }

    /**
     * XMLGregorianCalendar -> String 변환
     *
     * @param xgc
     * @param format
     * @return
     */
    public static String getXMLGregorianCalendar2String(XMLGregorianCalendar xgc, String format) {
        Date date = xgc.toGregorianCalendar().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * DATE_OF_BIRTH CODE(2012-01-05T00:00:00) -> 생년월일(YYYYMMDD) 변환
     *
     * @param dateOfBirth
     * @return
     */
    public static String getDOB(String dateOfBirth) {
        return dateOfBirth.substring(0, 10).replaceAll("-", "");
    }

    /**
     * 생년월일(YYYYMMDD) -> DATE_OF_BIRTH CODE(2012-01-05T00:00:00) 변환
     *
     * @param dob
     * @return
     */
    public static XMLGregorianCalendar getXGCalendar(String dob) {
        String xgcDateOfBirth = dob.substring(0, 4) + "-" + dob.substring(4, 6) + "-" + dob.substring(6) + "T00:00:00";
        return getXgcdob(xgcDateOfBirth);
    }

    /**
     * 출발날짜(YYYYMMDDHHMM) -> DATE_OF_BIRTH CODE(2012-01-05T10:00:00) 변환
     *
     * @param dob
     * @return
     */
    public static XMLGregorianCalendar getXG2Calendar(String dob) {
        String xgcDateOfBirth = dob.substring(0, 4) + "-" + dob.substring(4, 6) + "-" + dob.substring(6, 8) + "T"
                + dob.substring(8, 10) + ":" + dob.substring(10, 12) + ":00";
        return getXgcdob(xgcDateOfBirth);
    }

    private static XMLGregorianCalendar getXgcdob(String xgcDateOfBirth) {
        XMLGregorianCalendar xgc = null;
        try {
            xgc = DatatypeFactory.newInstance().newXMLGregorianCalendar(xgcDateOfBirth);
        } catch (DatatypeConfigurationException e) {
        }
        return xgc;
    }

    /**
     * 날짜 String형을 Date형으로 변환(yyyyMMdd)
     *
     * @param dateString
     * @return
     */
    public static Date getStr2Date(String dateString, String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        Date castDate = null;
        try {
            castDate = sdf.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return castDate;
    }

    /**
     * 날짜형식 ddMMyy(일월년)을 yyMMdd(년월일)로 변환
     *
     * @param ddMMyyyy
     * @return
     */
    public static String getConvDateFormat(String ddMMyy) {
        String yyyyMMdd = "";
        if (StringUtils.isNotEmpty(ddMMyy)) {
            if (ddMMyy.length() == 6) {
                yyyyMMdd += "20" + ddMMyy.substring(4) + ddMMyy.substring(2, 4) + ddMMyy.substring(0, 2);
            } else if (ddMMyy.length() == 8) {
                yyyyMMdd += ddMMyy.substring(4, 8) + ddMMyy.substring(2, 4) + ddMMyy.substring(0, 2);
            }
        }
        return yyyyMMdd;
    }

    /**
     * 1A 데이터 타입 중 Object형의 경우 VM(Virtual Machine) Vender에 따라 리턴되는 데이터 타입이 서로
     * 다름. Object(org.apache.xerces.dom.ElementNSImpl,
     * com.sun.org.apache.xerces.internal.dom.ElementNSImpl)형을 String형으로 변환
     *
     * @param obj
     * @return
     */


    /**
     * 나이계산기 (생일 형식 yyyyMMdd 과 출발일 형식 yyyyMMdd 으로 넘어와야 한다.)
     */
    public static String getAge(String ageDate, String depDate) {
        Calendar ageCal = Calendar.getInstance();
        int ageYear = Integer.parseInt(ageDate.substring(0, 4));
        int ageMonth = Integer.parseInt(ageDate.substring(4, 6));
        int ageDay = Integer.parseInt(ageDate.substring(6, 8));

        ageCal.set(Calendar.YEAR, ageYear);
        ageCal.set(Calendar.MONTH, ageMonth - 1);
        ageCal.set(Calendar.DATE, ageDay);

        Calendar depCal = Calendar.getInstance();
        int depYear = Integer.parseInt(depDate.substring(0, 4));
        int depMonth = Integer.parseInt(depDate.substring(4, 6));
        int depDay = Integer.parseInt(depDate.substring(6, 8));

        depCal.set(Calendar.YEAR, depYear);
        depCal.set(Calendar.MONTH, depMonth - 1);
        depCal.set(Calendar.DATE, depDay);

        int age = depCal.get(Calendar.YEAR) - ageCal.get(Calendar.YEAR);
        if ((ageCal.get(Calendar.MONTH) > depCal.get(Calendar.MONTH))
                || (ageCal.get(Calendar.MONTH) == depCal.get(Calendar.MONTH))
                || (ageCal.get(Calendar.DAY_OF_MONTH) > depCal.get(Calendar.DAY_OF_MONTH))) {
            age--;
        }
        String ageCalculation = String.valueOf(age);
        return ageCalculation;
    }

    /**
     * skypass 회원 (국내 기준) typeCode 추출 : 생년 월일이 (yyyyMMdd 로 와야 한다.)
     */
    public static String getDomPtcTypeByDob(String ageDate) {
        Calendar ageCal = Calendar.getInstance();
        int ageYear = Integer.parseInt(ageDate.substring(0, 4));

        ageCal.set(Calendar.YEAR, ageYear);

        int age = ageCal.get(Calendar.YEAR);

        String type = "";
        if (age > 11) {
            type = "ADT";
        } else if (age <= 11 && age >= 3) {
            type = "CHD";
        } else {
            type = "INF";
        }

        return type;
    }

    /**
     * ddmmmyy 형식을 yyyymmdd 형식으로 변환 (01JAN40 -> 19400101)
     *
     */
    public static String convertDate(String dobDate) {
        String date = dobDate;
        if (StringUtils.isNotEmpty(dobDate) && dobDate.length() == 7) {
            String day = dobDate.substring(0, 2);

            String month = DateUtil.getNumericMonth(dobDate.substring(2, 5), true);
            String year = "";
            String currentYear = DateUtil.getCurrentDate("yyyy").substring(2);
            String dobYear = dobDate.substring(5, 7);
            if (Integer.parseInt(dobYear) > Integer.parseInt(currentYear)) {
                year = "19" + dobYear;
            } else {
                year = "20" + dobYear;
            }
            date = year + month + day;
        }

        return date;
    }

    // PLUAT-2166 날짜 계산에서 사용됨
    // ddmmmyy 형식을 yyyymmdd 형식으로 변환 (01JAN40 -> 20400101) 출발날짜를
    public static String convertDate2(String dobDate) {
        String date = dobDate;
        if (StringUtils.isNotEmpty(dobDate) && dobDate.length() == 7) {
            String day = dobDate.substring(0, 2);
            String month = DateUtil.getNumericMonth(dobDate.substring(2, 5), true);
            String year = "";
            String dobYear = dobDate.substring(5, 7);
            year = "20" + dobYear;
            date = year + month + day;
        }

        return date;
    }

    /**
     * altea, eretail의 couponStatusCode를 bizCouponCode로 변환
     *
     * @param alteaCode
     * @return
     */
    public static String amadeusCouponCodeTobizCouponCode(String alteaCode) {
        String bizCode = "";
        if ("701".equals(alteaCode)) {
            bizCode = "N";
        } else if ("AL".equals(alteaCode)) {
            bizCode = "A";
        } else if ("B".equals(alteaCode)) {
            bizCode = "F";
        } else if ("BD".equals(alteaCode)) {
            bizCode = "K";
        } else if ("CK".equals(alteaCode)) {
            bizCode = "C";
        } else if ("CLO".equals(alteaCode)) {
            bizCode = "Z";
        } else if ("E".equals(alteaCode)) {
            bizCode = "E";
        } else if ("I".equals(alteaCode)) {
            bizCode = "O";
        } else if ("NAV".equals(alteaCode)) {
            bizCode = "U";
        } else if ("PE".equals(alteaCode)) {
            bizCode = "X";
        } else if ("PR".equals(alteaCode)) {
            bizCode = "P";
        } else if ("RF".equals(alteaCode)) {
            bizCode = "R";
        } else if ("S".equals(alteaCode)) {
            bizCode = "S";
        } else if ("V".equals(alteaCode)) {
            bizCode = "V";
        } else if ("Q".equals(alteaCode)) {
            bizCode = "Q";
        } else if ("IO".equals(alteaCode)) {
            bizCode = "I";
        } else if ("G".equals(alteaCode)) {
            bizCode = "G";
        } else if ("710".equals(alteaCode)) {
            bizCode = "Y";
        } else if ("708".equals(alteaCode)) {
            bizCode = "G";
        } else {
            bizCode = alteaCode;
        }
        return bizCode;
    }

    public static String ticketProcessCancelDocumentRemarkDate() {
        Date date = new Date();
        SimpleDateFormat dateformat = new SimpleDateFormat("ddMMMyy", Locale.US);
        String dateString = dateformat.format(date);
        return dateString;
    }

    public static boolean getRefundNotCurrency(String currency) {
        boolean refund = true;
        if ("ARS".equals(currency)) {
            refund = false;
            return refund;
        } else if ("BZD".equals(currency)) {
            refund = false;
            return refund;
        } else if ("BOB".equals(currency)) {
            refund = false;
            return refund;
        } else if ("BRL".equals(currency)) {
            refund = false;
            return refund;
        } else if ("CLP".equals(currency)) {
            refund = false;
            return refund;
        } else if ("COP".equals(currency)) {
            refund = false;
            return refund;
        } else if ("CRC".equals(currency)) {
            refund = false;
            return refund;
        } else if ("ECS".equals(currency)) {
            refund = false;
            return refund;
        } else if ("HNL".equals(currency)) {
            refund = false;
            return refund;
        } else if ("NIO".equals(currency)) {
            refund = false;
            return refund;
        } else if ("PYG".equals(currency)) {
            refund = false;
            return refund;
        } else if ("UYU".equals(currency)) {
            refund = false;
            return refund;
        }
        return refund;
    }

    /**
     * 국내/국제선 여부로 국내/국제선 구분 코드로 변환(D: 국내선, I: 국제선)
     *
     * @param domestic
     * @return
     */
    public static String convertDomIntlCd(Boolean domestic) {
        return domestic ? "D" : "I";
    }

    /**
     * 특정 문자열 치환
     *
     * @param str
     * @param chkStr
     * @param replStr
     * @return
     */
    public static String replaceString(String str, String chkStr, String replStr) {
        if (str.indexOf(chkStr) > -1) {
            str = str.replace(chkStr, replStr);
        }
        return str;
    }

    /**
     * ssci seatmap의 eligible한 좌석을 air_retrieveseatmap의 occupation 코드값으로 치환
     *
     * @param eligible
     * @return
     */
    public static String getSeatOccupation(Boolean eligible) {
        return eligible ? "1" : "0";
    }

    /**
     * 항공편명 자리수 변환 최소 3자리(2자리 이하는 왼쪽을 '0'으로 padding), 최대 4자리(MSB는 '0'이 아닌 수),
     * ODS에서 '0'으로 시작하는 네 자리 편명을 제공할 경우 '0'을 삭제해야 함. ex) 501 , 027 , 1201, 001
     * ==> (OK) / 0901, 2, 23 ==> (Not OK)
     *
     * @param flightNumber
     * @return
     */
    public static String getFlightNumberFormat(String flightNumber) {
        if (StringUtils.isNotEmpty(flightNumber)) {
            // 항공편명 최소 자릿수
            int minLen = 3;
            int len = flightNumber.length();
            if (len < minLen) {
                for (int i = 0; i < minLen - len; i++) {
                    flightNumber = "0" + flightNumber;
                }
            } else if (len > minLen) {
                for (int i = 0; i < len - minLen; i++) {
                    if ("0".equals(flightNumber.substring(0, 1))) {
                        flightNumber = flightNumber.substring(1);
                    } else {
                        break;
                    }
                }
            }
        }
        return flightNumber;
    }

    /**
     * 항공편명에 앞에 0이 있는 경우 제거(0901 -> 901)
     *
     * @param flightNumber
     * @return
     */
    public static String getFlightNumberRemoveZero(String flightNumber) {
        if (StringUtils.isNotEmpty(flightNumber)) {
            for (int i = 0; i < flightNumber.length(); i++) {
                if ("0".equals(flightNumber.substring(0, 1))) {
                    flightNumber = flightNumber.substring(1);
                } else {
                    break;
                }
            }
        }
        return flightNumber;
    }


    /**
     * checkin ssci service의 PTC타입으로 변경 (ADT -> A), (CHD,CNN->C), (INF ->IN)
     *
     * @param passengerTypeCode
     * @return
     */
    public static String getSSCIPtcCode(String passengerTypeCode) {
        String ptc = "";
        if ("ADT".equals(passengerTypeCode)) {
            ptc = "A";
        } else if ("CNN".equals(passengerTypeCode) || "CHD".equals(passengerTypeCode)) {
            ptc = "C";
        } else if ("INF".equals(passengerTypeCode)) {
            ptc = "IN";
        }
        return ptc;
    }

    public static String getGender(String passengerGenderCode) {
        String genderCode = "";
        if ("M".equals(passengerGenderCode)) {
            genderCode = "Male";
        } else {
            genderCode = "Female";
        }
        return genderCode;
    }

    public static String getPtcNumberType(String ptc) {
        String ptcNumberType = " "; // Lenght 1
        // Edited by Gwonsunghyun @20161014 PLUAT-2839 : Blank 처리.
        // Edited by Gwonsunghyun @20170821 PLUAT-3684 : 재적용.
        if ("A".equals(ptc) || "ADT".equals(ptc)) {
            ptcNumberType = "0";
        } else if ("C".equals(ptc) || "CHD".equals(ptc)) {
            ptcNumberType = "3";
        } else {
            ptcNumberType = "4";
        }
        return ptcNumberType;
    }

    /**
     * 예약(Pay Later) TL(EXPIRE_DATE) 변환 처리 TL 시간이 00:00, 01:00이면 TL-1일 23:30분으로
     * 처리, 그외는 1A 데이터로 처리
     *
     * @param timeLimitXgc
     * @return
     * @throws Exception
     */
    public static String getTimeLimit(XMLGregorianCalendar timeLimitXgc) throws Exception {
        String timeLimit = null;
        String timeLimitTime = getXMLGregorianCalendar2String(timeLimitXgc, "HH:mm");
        if ("00:00".equals(timeLimitTime) || "01:00".equals(timeLimitTime)) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(timeLimitXgc.toGregorianCalendar().getTime());
            cal.add(Calendar.DAY_OF_MONTH, -1);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            timeLimit = sdf.format(cal.getTime()) + "T23:30:00";
        } else {
            timeLimit = timeLimitXgc.toString();
        }
        return timeLimit;
    }

    /**
     * officeID로 NaoraID조회
     *
     * @param officeId
     * @return
     */
    public static String officeIdToNaoraId(String officeId) {
        String naoraId = "";
        if ("SELKE08IW".equals(officeId) || "SELKE08CW".equals(officeId) || "SELKE08IM".equals(officeId)
                || "SELKE08CM".equals(officeId) || "SELKE08MW".equals(officeId)) {
            naoraId = "SELCY01";

        } else if ("LAXKE08IW".equals(officeId) || "LAXKE08IM".equals(officeId) || "LAXKE08MW".equals(officeId)) {
            // naoraId = "LAXCY01";
            naoraId = "LAXIW02";

        } else if ("PARKE08IW".equals(officeId) || "PARKE08IM".equals(officeId) || "PARKE08MW".equals(officeId)) {
            // naoraId = "PARCY01";
            naoraId = "PARIW02";

        } else if ("SYDKE08IW".equals(officeId) || "SYDKE08IM".equals(officeId) || "SYDKE08MW".equals(officeId)) {
            // naoraId = "SYDCY01";
            naoraId = "SYDIW02";

        } else if ("KULKE08IW".equals(officeId) || "KULKE08IM".equals(officeId) || "KULKE08MW".equals(officeId)) {
            // naoraId = "KULCY01";
            naoraId = "KULRI02";

        } else if ("MOWKE08IW".equals(officeId) || "MOWKE08IM".equals(officeId) || "MOWKE08MW".equals(officeId)) {
            // naoraId = "MOWCY01";
            naoraId = "MOWRI02";

        } else if ("DXBKE08IW".equals(officeId) || "DXBKE08IM".equals(officeId) || "DXBKE08MW".equals(officeId)) {
            // naoraId = "DXBCY01";
            naoraId = "DXBIW02";

        } else if ("BJSKE08IW".equals(officeId) || "BJSKE08IM".equals(officeId) || "BJSKE08MW".equals(officeId)) {
            // naoraId = "BJSCY01";
            naoraId = "TAORI02";

        } else if ("TYOKE08IW".equals(officeId) || "TYOKE08IM".equals(officeId) || "TYOKE08MW".equals(officeId)) {
            // naoraId = "TYOCY01";
            naoraId = "OSARI02";

        } else if ("SELKE08IA".equals(officeId) || "SELKE08SA".equals(officeId)) {
            // naoraId = "SELCY03";
            naoraId = "CKSIMIT";

        } else if ("LAXKE08SN".equals(officeId) || "LAXKE08SA".equals(officeId)) {
            naoraId = "LAXIN02";

        } else if ("JKTKE08IA".equals(officeId) || "JKTKE08SA".equals(officeId)) {
            naoraId = "JKTIN02";
        } else if ("TYOKE08IA".equals(officeId)) {
            naoraId = "TYOIN01";
        } else if ("TYOKE08SA".equals(officeId)) {
            naoraId = "OSAST01";
        } else {
            naoraId = "SELCY01";
        }
        return naoraId;
    }

    /** yyyymmdd 형식의 날짜 요일 구하기 */
    public static String getWeekDay(String day) throws Exception {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, Integer.parseInt(day.substring(0, 4)));
        cal.set(Calendar.MONTH, Integer.parseInt(day.substring(4, 6)) - 1);
        cal.set(Calendar.DATE, Integer.parseInt(day.substring(6, 8)));

        String[] dayOfWeek = { "sun", "mon", "tue", "wed", "thu", "fri", "sat" };
        String weekday = dayOfWeek[cal.get(Calendar.DAY_OF_WEEK) - 1];

        return weekday;
    }

    /**
     * 날짜차이구하기
     *
     * @param begin
     *            yyyymmdd
     * @param end
     *            yyyymmdd
     * @return
     * @throws Exception
     */
    public static long diffOfDate(String begin, String end) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");

        Date beginDate = formatter.parse(begin);
        Date endDate = formatter.parse(end);

        long diff = endDate.getTime() - beginDate.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000);

        return diffDays;
    }

    /**
     * 2014-05-21T19:00:00 - > 201405211900 (yyyymmddhhmm)
     *
     * @param xmlGregorianCalendarString
     * @return
     */
    public static String xmlgregorianCalendarToDateString(String xmlGregorianCalendarString) {
        String dateString = "";
        dateString = xmlGregorianCalendarString.replaceAll("-", "");
        dateString = dateString.replaceAll(":", "");
        dateString = dateString.replaceAll("T", "");
        dateString = dateString.substring(0, 12);
        return dateString;
    }
}
