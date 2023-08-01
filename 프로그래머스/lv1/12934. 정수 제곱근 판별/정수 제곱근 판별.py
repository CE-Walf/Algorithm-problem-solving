def solution(n):
    sqrtN = n ** 0.5
    
    #다시 살펴보기
    if sqrtN % 1 == 0:
        answer = (sqrtN + 1) ** 2 
    else:
        answer = -1
        
    return answer