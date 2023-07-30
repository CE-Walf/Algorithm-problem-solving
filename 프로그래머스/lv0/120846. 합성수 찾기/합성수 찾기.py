def searchCompositeNum(number):
    count = 0
    
    for i in range(1, number+1):
        if number % i == 0:
            count += 1
            
    if count >= 3:
        return True
    else:
        return False
    
def solution(n):
    answer = 0
    
    for i in range(1, n+1):
        if searchCompositeNum(i):
            answer += 1
            
    return answer