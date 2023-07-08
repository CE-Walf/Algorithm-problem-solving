def solution(s):
    answer = ''
    temp_list = s.split(' ')
    temp_list = list(map(int, temp_list))
    temp_list.sort()
    
    answer += str(temp_list[0])
    answer += ' '
    answer += str(temp_list[-1])
    
        
    
    return answer
    