def solution(array, commands):
    answer = []
    
    for command in commands:
        i = command[0]
        j = command[1]
        k = command[2]
        
        temp_list = array[i-1:j]
        temp_list.sort()
        answer.append(temp_list[k-1])
        
    return answer