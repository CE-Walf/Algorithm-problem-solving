# 3가지 방법
# 1. import math factorial
# 2. import math comb
# 3. for 문으로 factorial 함수 만들기

def factorial(n):
    temp = 1
    for i in range(1, n+1):
        temp *= i
    
    return temp

def solution(balls, share):
    answer = factorial(balls) / (factorial(balls-share) * factorial(share))
    
    return answer