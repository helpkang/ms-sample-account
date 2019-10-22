/*
 * Copyright 2011-2019 KoreanAir
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
package com.koreanair.common.exception;

import java.io.IOException;

import org.apache.http.HttpStatus;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class GenericException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final ExceptionCode exceptionCode;
	private final String exceptionMessage;
	private final Object exceptionData;
	private final String exceptionStackTrace;

	public GenericException(ExceptionCode exceptionCode) {
		super(exceptionCode.getMessage());
		this.exceptionCode = exceptionCode;
		this.exceptionMessage = exceptionCode.getMessage();
		this.exceptionData = null;
		this.exceptionStackTrace = "";
	}
	public GenericException(ExceptionCode exceptionCode, String message) {
		super(message);
		this.exceptionCode = exceptionCode;
		this.exceptionMessage = message;
		this.exceptionData = null;
		this.exceptionStackTrace = "";
	}
	public GenericException(ExceptionCode exceptionCode, Throwable cause) {
		super(cause);
		this.exceptionCode = exceptionCode;
		this.exceptionMessage = cause.getMessage();
		this.exceptionData = null;
		this.exceptionStackTrace = "";
	}
	public GenericException(ExceptionCode exceptionCode, String message, Throwable cause) {
		super(message, cause);
		this.exceptionCode = exceptionCode;
		this.exceptionMessage = message;
		this.exceptionData = null;
		this.exceptionStackTrace = "";
	}
	public GenericException(ExceptionCode exceptionCode, String message, Object exceptionData) {
		super(message);
		this.exceptionCode = exceptionCode;
		this.exceptionMessage = message;
		this.exceptionData = exceptionData;
		this.exceptionStackTrace = "";
	}
	public GenericException(ExceptionCode exceptionCode, String message, Object exceptionData, Throwable cause) {
		super(message, cause);
		this.exceptionCode = exceptionCode;
		this.exceptionMessage = message;
		this.exceptionData = exceptionData;
		this.exceptionStackTrace = "";
	}
	public GenericException(ExceptionCode exceptionCode, String message, Object exceptionData, String exceptionStackTrace) {
		super(message);
		this.exceptionCode = exceptionCode;
		this.exceptionMessage = message;
		this.exceptionData = exceptionData;
		this.exceptionStackTrace = exceptionStackTrace;
	}
	public GenericException(ExceptionCode exceptionCode, String message, Object exceptionData, String exceptionStackTrace, Throwable cause) {
		super(message, cause);
		this.exceptionCode = exceptionCode;
		this.exceptionMessage = message;
		this.exceptionData = exceptionData;
		this.exceptionStackTrace = exceptionStackTrace;
	}

	public GenericException(String message) {
		super(message);
		this.exceptionCode = ExceptionCode.BUSINESS_ERROR;
		this.exceptionMessage = message;
		this.exceptionData = null;
		this.exceptionStackTrace = "";
	}

	public GenericException(Throwable cause) {
		super(cause);
		this.exceptionCode = ExceptionCode.BUSINESS_ERROR;
		this.exceptionMessage = cause.getMessage();
		this.exceptionData = null;
		this.exceptionStackTrace = "";
	}

	public GenericException(String message, Throwable cause) {
		super(message, cause);
		this.exceptionCode = ExceptionCode.BUSINESS_ERROR;
		this.exceptionMessage = message;
		this.exceptionData = null;
		this.exceptionStackTrace = "";
	}
	public GenericException(String message, Object exceptionData, Throwable cause) {
		super(message, cause);
		this.exceptionCode = ExceptionCode.BUSINESS_ERROR;
		this.exceptionMessage = message;
		this.exceptionData = exceptionData;
		this.exceptionStackTrace = "";
	}

	// "Fields in a "Serializable" class should either be transient or serializable" 를 회피하기 위해 writeObject  , readObject 를 구현함.
	private void writeObject(java.io.ObjectOutputStream stream) throws IOException {
		stream.writeObject(exceptionData);
	}

	private void readObject(java.io.ObjectInputStream stream) throws IOException, ClassNotFoundException {
		log.debug("readObject");
	}

	/**
	 * <pre>
	 * 예외레벨
	 * - FATAL, ERROR, WARN, INFO, DEBUG
	 * </pre>
	 */
	public enum Level {
		FATAL, ERROR, WARN, INFO, DEBUG
	}

	/**
	 * <pre>
	 * 예외 코드 리스트 정의
	 * - 예외 코드 상세 : HTTP응답상태 코드, 예외레벨, 기본 메세지
	 * </pre>
	 */
	@Getter
	public enum ExceptionCode {

		BAD_REQUEST(HttpStatus.SC_BAD_REQUEST, Level.WARN, "잘못된 요청입니다."), // 사용자의 잘못된 요청

		NOT_FOUND(HttpStatus.SC_NOT_FOUND, Level.WARN, "요청하신 RESOURCE가 없습니다."), // 요청을 처리할 Controller 메서드가 없거나 웹자원이 없음

		UNSUPPORTED_MEDIA_TYPE(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, Level.ERROR, "지원되지 않는 미디어 타입입니다."), // 잘못된 미디어 타입

		/* 데이터 예외 */
		DB_ERROR(HttpStatus.SC_INTERNAL_SERVER_ERROR, Level.ERROR, "DB 에러가 발생하였습니다."), // 기타 DB 관련 예외

		/* 서버 예외 */
		INTERNAL_SERVER_ERROR(HttpStatus.SC_INTERNAL_SERVER_ERROR, Level.ERROR, "서버 에러가 발생하였습니다."), // 예측되지 않은 시스템 예외

		/* 업무 예외 */
		BUSINESS_ERROR(HttpStatus.SC_FORBIDDEN, Level.WARN, "업무 예외가 발생하였습니다.");

		private final int httpStatus;
		private final Level level;
		private final String message;

		ExceptionCode(int httpStatus, Level level, String message) {
			this.httpStatus = httpStatus;
			this.level = level;
			this.message = message;
		}
	}


}