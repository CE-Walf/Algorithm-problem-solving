def solution(d, budget):
    answer = 0
    
    d.sort()
    for apply in d:
        if budget >= apply:
            budget -= apply
            answer += 1
            
    return answer