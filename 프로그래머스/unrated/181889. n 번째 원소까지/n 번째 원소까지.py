def solution(num_list, n):
    answer = []
    
    for index, value in enumerate(num_list, start=1):
        answer.append(value)
        if index == n:
            break
        
            
    return answer