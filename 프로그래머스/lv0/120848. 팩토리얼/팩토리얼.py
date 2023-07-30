def factorial(n):
    if n == 1:
        return 1
    return n*factorial(n-1)

def solution(n):
    answer = 0
    
    fact = 1
    fact_i = 1
    while True:
        fact_i += 1
        fact *= fact_i
        
        if n < fact:
            break
        
    answer = fact_i - 1
    
    return answer