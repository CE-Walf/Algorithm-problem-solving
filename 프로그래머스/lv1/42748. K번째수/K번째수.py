def solution(array, commands):
    answer = []
    
    for i, j, k in commands:
        temp_list = array[i-1:j]
        temp_list.sort()
        answer.append(temp_list[k-1])
        
    return answer