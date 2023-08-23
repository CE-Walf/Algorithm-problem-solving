def countDivisor(n):
    count = 0
    
    for i in range(1, n+1):
        if n % i == 0:
            count += 1
        
    return count

def solution(left, right):
    answer = 0
    
    for i in range(left, right+1):
        if countDivisor(i) % 2 == 0:
            answer += i
        elif countDivisor(i) % 2 == 1:
            answer -= i
    
    return answer