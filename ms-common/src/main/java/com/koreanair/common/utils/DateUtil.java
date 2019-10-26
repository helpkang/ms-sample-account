/*
 * Copyright 2011-2019 Koreanair.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.koreanair.common.utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.StringUtils;

public class DateUtil {

    public static String getDateByUserFormat(XMLGregorianCalendar value, String dateFormat) {
        if (value == null) {
            return null;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        return sdf.format(Long.valueOf(value.toGregorianCalendar().getTimeInMillis()));
    }


    /**
     * <pre>
     * 입력받은 문자열 형식의 일자를 pattern에 맞추어 LocalDateTime으로 반환한다.
     * </pre>
     *
     * @param strDate
     * @param datePattern
     * @return LocalDateTime
     */
    public static LocalDateTime getLocalDateTime(String strDate , String datePattern) {
        return LocalDateTime.parse(strDate, DateTimeFormatter.ofPattern(datePattern));
    }

    /**
     * <pre>
     * XMLGregorianCalendar 을 LocalDateTime으로 변환
     * </pre>
     *
     * @param xcal
     * @return LocalDateTime
     */
    public static LocalDateTime getLocalDateTimeFromXCal(XMLGregorianCalendar xcal) {
        return xcal.toGregorianCalendar().toZonedDateTime().toLocalDateTime();
    }

    /**
     * <pre>
     * XMLGregorianCalendar 을 LocalDate로 변환
     * </pre>
     *
     * @param xcal
     * @return LocalDate
     */
    public static LocalDate getLocalDateFromXCal(XMLGregorianCalendar xcal) {
        return xcal.toGregorianCalendar().toZonedDateTime().toLocalDate();
    }

	public static String getMillisecondsToDuration(long millis) {
		long days = TimeUnit.MILLISECONDS.toDays(millis);
		millis -= TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(millis);
		millis -= TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
		millis -= TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(millis);
		return String.format("%d 일 %d 시간 %d 분, %d 초", days, hours, minutes, seconds);
	}

	private final static int SEG_COMPARE_DATE = 352;
	private static String[] MONTH_ALPHA = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" };
	private static String[] MONTH_NUMERIC = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
	private static String[] DAY_OF_WEEK_KOR = { "일", "월", "화", "수", "목", "금", "토" };
	private static String[] DAY_OF_WEEK_ENG = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	private static String[] DAY_OF_WEEK_PNR = { "SU", "MO", "TU", "WE", "TH", "FR", "SA" };

    /**
     * 현재 날짜를 지정한 Format 값으로 Return Symbol Meaning Presentation Example G era
     * designator (Text) AD y year (Number) 1996 M month in year (Text & Number)
     * July & 07 d day in month (Number) 10 h hour in am/pm (1~12) (Number) 12 H
     * hour in day (0~23) (Number) 0 m minute in hour (Number) 30 s second in
     * minute (Number) 55 S millisecond (Number) 978 E day in week (Text)
     * Tuesday D day in year (Number) 189 F day of week in month (Number) 2 (2nd
     * Wed in July) w week in year (Number) 27 W week in month (Number) 2 a
     * am/pm marker (Text) PM k hour in day (1~24) (Number) 24 K hour in am/pm
     * (0~11) (Number) 0 z time zone (Text) Pacific Standard Time ' escape for
     * text (Delimiter) '' single quote (Literal)
     *
     * Pattern Example Format Pattern Result "yyyy.MM.dd G 'at' HH:mm:ss z"
     * 1996.07.10 AD at 15:08:56 PDT "EEE, MMM d, ''yy" Wed, July 10, '96
     * "h:mm a" 12:08 PM "hh 'o''clock' a, zzzz" 12 o'clock PM, Pacific Daylight
     * Time "K:mm a, z" 0:00 PM, PST "yyyyy.MMMMM.dd GGG hh:mm aaa" 1996.July.10
     * AD 12:08 PM
     *
     * @param format
     * @return currendDate
     *
     */
    public static String getCurrentDate(String format) {
        if (format == null || format.trim().length() == 0) {
            format = "yyyyMMddHHmmss";
        }
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        formatter.setTimeZone(TimeZone.getDefault());
        Date currentDate = new Date();
        return formatter.format(currentDate);
    }

    public static String today() {
//		Calendar cal = Calendar.getInstance();
//		String year = String.valueOf(cal.get(Calendar.YEAR));
//		String month = StringUtils.leftPad(String.valueOf(cal.get(Calendar.MONTH) + 1), 2, "0");
//		String date = StringUtils.leftPad(String.valueOf(cal.get(Calendar.DATE)), 2, "0");
//		return year + month + date;
        return DateTimeFormatter.ofPattern("yyyyMMdd").format(LocalDate.now());
    }


    public static String todayGmt(String officeId) {

        int gmt = 0;
        //서버타임과 일치하는 oid
        String hr0 = "SELKE08CM,SELKE08CW,SELKE08IM,SELKE08IW,SELKE08MW,SELKE08IA,SELKE08SA,TYOKE08IM,TYOKE08IW,TYOKE08MW,TYOKE08IA,TYOKE08SA";
        //서버타임보다 1시간 늦는 oid
        String hrm1 = "BJSKE08IM,BJSKE08IW,BJSKE08MW,KULKE08IM,KULKE08IW,KULKE08MW,JKTKE08IA";
        //서버타임보다 5시간 늦는 oid
        String hrm5 = "DXBKE08IM,DXBKE08IW,DXBKE08MW,MOWKE08IM,MOWKE08IW,MOWKE08MW";
        //서버타임보다 8시간 늦는 oid
        String hrm8 = "PARKE08IM,PARKE08IW,PARKE08MW";
        //서버타임보다 16시간 늦는 oid
        String hrm16 = "LAXKE08IM,LAXKE08IW,LAXKE08MW,LAXKE08SN,LAXKE08SA";
        //서버타임보다 1시간 빠른 oid
        String hrp1 = "SYDKE08IM,SYDKE08IW,SYDKE08MW";

        HashMap<String,String> gmtmap = new HashMap<String,String>();
        gmtmap.put("hr0", hr0);
        gmtmap.put("hrm1", hrm1);
        gmtmap.put("hrm5", hrm5);
        gmtmap.put("hrm8", hrm8);
        gmtmap.put("hrm16", hrm16);
        gmtmap.put("hrp1", hrp1);

        String []hrkey = {"hr0","hrm1","hrm5","hrm8","hrm16","hrp1"};

        boolean isgmt = false;
        for(String key : hrkey){
            if(isgmt){
                break;
            }
            String hr = gmtmap.get(key);
            String []hrArr = hr.split(",");
            for(String oid : hrArr){
                if(oid.equals(officeId)){
                    if("hr0".equals(key)){
                        gmt=0;
                        isgmt=true;
                    }else if("hrm1".equals(key)){
                        gmt=-1;
                        isgmt=true;
                    }else if("hrm5".equals(key)){
                        gmt=-5;
                        isgmt=true;
                    }else if("hrm8".equals(key)){
                        gmt=-8;
                        isgmt=true;
                    }else if("hrm16".equals(key)){
                        gmt=-16;
                        isgmt=true;
                    }else if("hrp1".equals(key)){
                        gmt=1;
                        isgmt=true;
                    }
                }
            }
        }
        SimpleDateFormat sdfmt = new SimpleDateFormat("yyyyMMdd");
        GregorianCalendar cal = new GregorianCalendar();
        cal.add(cal.HOUR, gmt);

        return sdfmt.format(cal.getTime());
    }


    /**
     * 날짜차이 계산
     *
     * @param someDate
     * @param pastDate
     * @return
     */
    public static long getDiffDaysToLong(String someDate, String compareDateTime) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        long diffDays = 0;
        try {
            Date targetDate = formatter.parse(someDate);
            Date compareDate = formatter.parse(compareDateTime);
            long diff = compareDate.getTime() - targetDate.getTime();
            diffDays = diff / (24 * 60 * 60 * 1000);
        } catch (Exception ex) {
        }
        return diffDays;
    }

    /**
     * 분차이 계산
     *
     * @param someDate
     * @param pastDate
     * @return
     */
    public static long getDiffMins(String compareMaxTime, String compareMinTime) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmm");
        long diffMins = 0;
        try {
            Date targetDate = formatter.parse(compareMaxTime);
            Date compareDate = formatter.parse(compareMinTime);
            long diff = compareDate.getTime() - targetDate.getTime();
            diffMins = diff / (60 * 1000);
        } catch (Exception ex) {
            // do Nothing
        }
        return diffMins;
    }

    /**
     * 출발지 출발일자와 도착지 도착일자간 날짜 계산(날짜형식 : yyyyMMdd)
     *
     * @param depDate
     * @param arrDate
     * @return
     */
    public static String getDiffDays(String depDate, String arrDate) {
        return String.valueOf(getDiffDaysToLong(depDate, arrDate));
    }


    /**
     * 현재 날짜에서 더하기 빼기
     *
     * @param int
     *            calVal (하루이전 날짜를 구하려면 -1, 10일 이후 날짜를 구하려면 10)
     * @return calculatedDate (YYYYMMDD)
     */
    public static String getCaluatedDate(int calVal) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, calVal);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        return formatter.format(cal.getTime());
    }
    /**
     * 현재 시간에서 분을 더하기 빼기
     *
     * @param int
     *            calVal ()
     * @return calculatedDate (YYYYMMDD)
     */
    public static String getCaluatedMin(int calVal, String format) {
        String calculatedDate = "";
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MINUTE, calVal);
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        calculatedDate = formatter.format(cal.getTime());
        return calculatedDate;
    }

    /**
     * 특정 날짜에서 더하기 빼기
     *
     * @param segMonth
     * @param segDay
     * @return
     */
    private static String getCaluatedDate(String yearMonthDay, int calVal, String format) {
        String calculatedDate = "";
        String year = yearMonthDay.substring(0, 4);
        String month = yearMonthDay.substring(4, 6);
        String day = yearMonthDay.substring(6, 8);
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        cal.add(Calendar.DATE, calVal);
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        calculatedDate = formatter.format(cal.getTime());
        return calculatedDate;
    }

    public static String getCaluatedDate(String yearMonthDay, int calVal) {
        return getCaluatedDate(yearMonthDay, calVal, "yyyyMMdd");
    }

    /**
     * 특정 시간에서 더하기 빼기
     * @param segMonth
     * @param segDay
     * @return
     */
    public static String getCaluatedHour (String yearMonthDayHourMin, int calVal, String format) {
        String calculatedDate = "";
        String year 	= yearMonthDayHourMin.substring(0, 4);
        String month 	= yearMonthDayHourMin.substring(4, 6);
        String day 		= yearMonthDayHourMin.substring(6, 8);
        String hour 	= yearMonthDayHourMin.substring(8, 10);
        String min 		= yearMonthDayHourMin.substring(10, 12);

        Calendar cal 	= Calendar.getInstance();
        cal.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day), Integer.parseInt(hour), Integer.parseInt(min));
        cal.add(Calendar.HOUR_OF_DAY, calVal);
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        calculatedDate = formatter.format(cal.getTime());
        return calculatedDate;
    }

    /**
     * 특정 월에서 더하기 빼기
     *
     * @param segMonth
     * @param segDay
     * @return
     */
    public static String getCaluatedMonth(String yearMonthDay, int calVal, String format) {
        String calculatedDate = "";
        String year = yearMonthDay.substring(0, 4);
        String month = yearMonthDay.substring(4, 6);
        String day = yearMonthDay.substring(6, 8);
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        cal.add(Calendar.MONTH, calVal);
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        calculatedDate = formatter.format(cal.getTime());
        return calculatedDate;
    }

    /**
     * Seg의 날짜를 받아서, 년도를 계산한다. 352일 기준으로
     *
     * @param segMonth
     *            (ex [JUL,06,6,Jul,jul)
     * @param segDay
     *            (ex [4, 04])
     * @return
     */
    public static String getSegYear(String segMonth, String segDay) {
        String calculatedYear = "";
        String currentDate = getCurrentDate("yyyyMMdd");
        String currentYear = currentDate.substring(0, 4);
        String segYear = "";

        if (Character.isDigit(segMonth.charAt(0)) == false) {
            segMonth = getNumericMonth(segMonth, true);
        }

        NumberFormat formatter = new DecimalFormat("00");
        segMonth = formatter.format(Double.parseDouble(segMonth));
        segDay = formatter.format(Double.parseDouble(segDay));

        int curentDateIntValue = Integer.parseInt(currentDate.substring(4));
        int segDateIntValue = Integer.parseInt(segMonth + segDay);

        if (curentDateIntValue <= segDateIntValue) {
            segYear = currentYear;
        } else {
            segYear = Integer.toString(Integer.parseInt(currentYear) + 1);
        }

        long diffDays = getDiffDaysToLong(segYear + segMonth + segDay, currentDate);

        if (segYear.equals(currentYear)) {
            if (diffDays > SEG_COMPARE_DATE) {
                calculatedYear = Integer.parseInt(currentYear) - 1 + "";
            } else {
                calculatedYear = currentYear;
            }
        } else {
            if (diffDays > SEG_COMPARE_DATE) {
                calculatedYear = currentYear;
            } else {
                calculatedYear = Integer.parseInt(currentYear) + 1 + "";
            }
        }

        return calculatedYear;
    }

    /**
     * Alpha Month를 Nemeric Month로 Return (ex : Jun --> 1 or 01) Formatting 여부
     *
     * @param alphaMonth
     */
    public static String getNumericMonth(String alphaMonth, boolean formating) {
        String rslt = "";

        if (alphaMonth == null || alphaMonth.trim().length() == 0) {
            return "";
        }

        for (int k = 0; k < MONTH_ALPHA.length; k++) {
            if (MONTH_ALPHA[k].equals(alphaMonth.toUpperCase())) {
                rslt = MONTH_NUMERIC[k];
                break;
            }
        }

        if (formating == true) {
            NumberFormat formatter = new DecimalFormat("00");
            rslt = formatter.format(Double.parseDouble(rslt));
        }

        return rslt;
    }

    /**
     * Alpha Month를 Nemeric Month로 Return (ex : Jun --> 1 or 01) Formatting 여부
     *
     * @param alphaMonth
     */
    public static String getAlphaMonth(String numericMonth) {
        String rslt = "";

        if (numericMonth == null || numericMonth.trim().length() == 0) {
            return "";
        }

        numericMonth = Integer.parseInt(numericMonth) + "";

        for (int k = 0; k < MONTH_ALPHA.length; k++) {
            if (MONTH_NUMERIC[k].equals(numericMonth)) {
                rslt = MONTH_ALPHA[k];
                break;
            }
        }
        return rslt;
    }

    /**
     * 요일 가져오기
     *
     * @param year
     * @param month
     * @param day
     * @param lang
     * @return
     */
    private static String getDayOfWeek(String year, String month, String day, String lang) {
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        if ("ENG".equals(lang)) {
            return DAY_OF_WEEK_ENG[dayOfWeek - 1];
        } else {
            return DAY_OF_WEEK_KOR[dayOfWeek - 1];
        }

    }

    public static String getDayOfWeek(String yyyy_mm_dd, String lang) {
        String[] dateArr = yyyy_mm_dd.split("-");
        return getDayOfWeek(dateArr[0], dateArr[1], dateArr[2], lang);
    }

    /**
     * PNR상의 요일 가져오기
     */
    public static String getDayOfWeekPnr(String dayOfWeek, String lang) {
        int idx = -1;
        for (int k = 0; k < DAY_OF_WEEK_PNR.length; k++) {
            if (DAY_OF_WEEK_PNR[k].equals(dayOfWeek)) {
                idx = k;
                break;
            }
        }
        if ("ENG".equals(lang)) {
            return DAY_OF_WEEK_ENG[idx];
        } else {
            return DAY_OF_WEEK_KOR[idx];
        }
    }

    /**
     * 날짜입력유효성 Check
     *
     * @param String
     *            유효성검증값, String format(yyyyMMdd)
     */
    public static boolean isDateFormat(String checkStr, String format) {
        String formatedDate = "";
        SimpleDateFormat sdf = null;
        try {
            sdf = new SimpleDateFormat(format);
            formatedDate = sdf.format(sdf.parse(checkStr));
        } catch (Exception ex) {
            return false;
        }

        if (checkStr.equals(formatedDate) == false) {
            return false;
        }

        return true;
    }

    /**
     * 달력 생성
     *
     * @param YEAR(2007),
     *            MONTH(4)
     * @return
     */
    private static List<String[]> getCalendarTable(int year, int month) {
        List<String[]> calendarTable = new ArrayList<String[]>();
        String weekArr[] = null;
        Calendar currentCal = Calendar.getInstance();
        currentCal.set(year, month - 1, 1);

        int currentYear = currentCal.get(Calendar.YEAR);
        int currentMonth = currentCal.get(Calendar.MONTH) + 1;
        int currentStartDay = currentCal.get(Calendar.DATE);
        int currentLastDay = currentCal.getActualMaximum(Calendar.DAY_OF_MONTH); // 선택한달의
        // 마지막
        // 일.
        int weekOfDay = currentCal.get(Calendar.DAY_OF_WEEK);

        currentCal.add(Calendar.DATE, -1);
        int beforeYear = currentCal.get(Calendar.YEAR);
        int beforeMonth = currentCal.get(Calendar.MONTH) + 1;
        int beforeLastDay = currentCal.getActualMaximum(Calendar.DAY_OF_MONTH); // 선택한달의
        // 마지막
        // 일.
        int beforeStartDay = beforeLastDay - (weekOfDay - 2);

        currentCal.set(year, month - 1, currentLastDay);
        currentCal.add(Calendar.DATE, +1);
        int nextYear = currentCal.get(Calendar.YEAR);
        int nextMonth = currentCal.get(Calendar.MONTH) + 1;
        int nextStartDay = currentCal.get(Calendar.DATE); // 선택한달의 마지막 일.

        boolean isMonthEnd = false;
        for (int k = 0; k < 6; k++) {
            weekArr = new String[7];
            for (int x = 0; x < 7; x++) {
                if (k == 0 && x < weekOfDay - 1) {
                    weekArr[x] = beforeYear + "-" + doFormatting(String.valueOf(beforeMonth), "00") + "-"
                            + doFormatting(String.valueOf(beforeStartDay++), "00");
                } else if (currentStartDay <= currentLastDay) {
                    weekArr[x] = currentYear + "-" + doFormatting(String.valueOf(currentMonth), "00") + "-"
                            + doFormatting(String.valueOf(currentStartDay++), "00");
                } else if (currentStartDay > currentLastDay) {
                    weekArr[x] = nextYear + "-" + doFormatting(String.valueOf(nextMonth), "00") + "-"
                            + doFormatting(String.valueOf(nextStartDay++), "00");
                    isMonthEnd = true;
                }
            }
            calendarTable.add(weekArr);
            if (isMonthEnd == true) {
                break;
            }
        }

        return calendarTable;
    }

    /**
     * 달력 생성
     *
     * @param YEAR(2007),
     *            MONTH(4)
     * @return
     */
    public static List<String[]> getCalendarTable(String year, String month) {
        return getCalendarTable(Integer.parseInt(year), Integer.parseInt(month));
    }

    private static String doFormatting(String data, String format) {
        NumberFormat formatter = new DecimalFormat(format);
        return formatter.format(Double.parseDouble(data));
    }

    public static String getNumericMonth(String alphaMonth) {
        return getNumericMonth(alphaMonth, false);
    }

    public static String changeDateFormat(String dateStr, String beforeFormat, String afterFormat) {
        SimpleDateFormat format = new SimpleDateFormat(beforeFormat);
        try {
            Date date = format.parse(dateStr);
            SimpleDateFormat toFromat = new SimpleDateFormat(afterFormat);
            return toFromat.format(date);
        } catch (Exception ex) {
            // do Noting;
        }
        return "";
    }


    /*	Refactoring	*/

    /**
     * date format 변경 (yyyyMMdd-> ddMMMyy)
     *
     * @param dateString
     * @return
     */
    public static String dateToIcDate(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("ddMMMyy", Locale.US);
        return convertIcDate(dateString, sdf, sdf2);
    }

    /**
     * date format 변경 (ddMMMyy-> yyyyMMdd)
     *
     * @param dateString
     * @return
     */
    public static String IcDateToDate(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMMyy", Locale.US);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
        return convertIcDate(dateString, sdf, sdf2);
    }

    /**
     * date format 변경 (ddMMMyyyy-> yyyyMMdd)
     *
     * @param dateString
     * @return
     */
    public static String IcDateToDate2(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMMyyyy", Locale.US);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
        return convertIcDate(dateString, sdf, sdf2);
    }

    /**
     * date format 변경 (ddMMyy-> ddMMMyy)
     *
     * @param dateString
     * @return
     */
    public static String IcDate2ToDate(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMMyy", Locale.US);
        SimpleDateFormat sdf2 = new SimpleDateFormat("ddMMyy");
        return convertIcDate(dateString, sdf2, sdf);
    }

    /**
     * date format 변경 (ddMMyy-> yyyyMMdd)
     *
     * @param dateString
     * @return
     */
    public static String IcDate4ToDate(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy", Locale.US);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
        return convertIcDate(dateString, sdf, sdf2);
    }

    /**
     * date format 변경 (yyyyMMdd-> ddMMyy)
     *
     * @param dateString
     * @return
     */
    public static String IcDate5ToDate(String dateString) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("ddMMyy");
        return convertIcDate(dateString, sdf, sdf2);
    }

    private static String convertIcDate(String dateString, SimpleDateFormat sdf, SimpleDateFormat sdf2) {
        Date date = null;
        try {
            date = sdf.parse(dateString);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sdf2.format(date);
    }

    /**
     * ddmmyy 형태의 altea date형식을 yyyymmdd형식으로 변환
     *
     */
    public static String alteaDateToDate(String alteaDate) {
        String date = alteaDate;
        if (StringUtil.isNotEmpty(alteaDate) && alteaDate.length() == 6) {
            String day = alteaDate.substring(0, 2);
            String month = alteaDate.substring(2, 4);
            String year = "20" + alteaDate.substring(4, 6);
            date = year + month + day;
        }

        return date;
    }

    /**
     * yyyymmdd형식을 altea date형식으로 변환
     *
     */
    public static String dateToAlteaDate(String date) {
        String alteaDate = date;
        if (StringUtil.isNotEmpty(date) && date.length() == 8) {
            String day = date.substring(6, 8);
            String month = date.substring(4, 6);
            String year = date.substring(2, 4);
            alteaDate = day + month + year;
        }

        return alteaDate;
    }

    /**
     * 입력 받은 날짜만큼 더한 날짜 리턴(-3이면 현재일로부터 3일 전 날짜)
     * 예 : BASE 체크 시 현재일로부터 3일 후 날짜 구할 때
     * @param addDay
     * @return
     */
    public static String getAddDate(int addDay) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, addDay);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return "";
        //return String.valueOf(year) + IbeCommonUtil.addZero(String.valueOf(month)) + IbeCommonUtil.addZero(String.valueOf(day));
    }

	public static String changeDateFormat(String psOrgDateStr, String psOrgFormat, String psChgFormat, Locale poOrgLocale, Locale poChgLocale) throws ParseException {
		SimpleDateFormat lSimpleDateFormat = new SimpleDateFormat(psOrgFormat, poOrgLocale);
		lSimpleDateFormat.format(new Date());
		Date oParseData = lSimpleDateFormat.parse(psOrgDateStr);

		lSimpleDateFormat = new SimpleDateFormat(psChgFormat, poChgLocale);
		return lSimpleDateFormat.format(oParseData).toUpperCase();
	}

    public static String changeDateFormat(String psOrgDateStr, String psOrgFormat, String psChgFormat) throws ParseException {
        if (StringUtils.isEmpty(psOrgDateStr)) {
            return psOrgDateStr;
        }
        SimpleDateFormat lSimpleDateFormat = new SimpleDateFormat(psOrgFormat);
        lSimpleDateFormat.format(new Date());
        Date oParseData = lSimpleDateFormat.parse(psOrgDateStr);

        lSimpleDateFormat = new SimpleDateFormat(psChgFormat);
        return lSimpleDateFormat.format(oParseData).toUpperCase();
    }

}
