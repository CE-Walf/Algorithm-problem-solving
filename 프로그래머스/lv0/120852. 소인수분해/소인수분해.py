# 효율적인 코드는 절대로 아님.
# 더 좋은 해결책 생각해 볼 것

def isPrime(n):
    count = 0 
    
    for i in range(1, n+1):
        if n % i == 0:
            count += 1
    
    if count == 2:
        return True
    else: 
        return False

    
def solution(n):
    answer = []
    
    for i in range(2, n+1):
        if n % i == 0:
            if isPrime(i):  
                answer.append(i)
            else:
                pass
        
    return answer