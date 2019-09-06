Feature: Account 기능

Scenario: Account 생성
	# Given Account 전체 비우기
	When Account a 잔고 10으로 생성 
	Then Account a 잔고 10 있어야 함

# Scenario: 가방에 몇개 넣기
# 	Given 가방을 비우기
# 	When 1개 potato 가방에 넣기
# 	And 2개 cucumber 가방에 넣기
# 	Then 가방에 1개 potato 있어야 함
# 	And 가방에 2개 cucumber 있어야 함