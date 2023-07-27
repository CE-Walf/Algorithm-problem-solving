def solution(num_list):
    answer = -1
    
    for index, num in enumerate(num_list):
        if num < 0:
            answer = index
            break
            
    return answer