Feature: Account 기능

Scenario: Account 생성
	Given 시작
	When Account abcd 잔고 10으로 생성 
	Then Account  abcd 잔고 10 있어야 함

