import math

def solution(n):
    if math.sqrt(n) * 10 == int(math.sqrt(n))*10:
        answer = 1
    else:
        answer = 2
        
    return answer