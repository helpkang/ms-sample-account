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
package com.koreanair.common_adapter.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import javax.xml.datatype.XMLGregorianCalendar;

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
}
