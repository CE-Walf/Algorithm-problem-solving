def solution(str_list, ex):
    answer = []
    
    for string in str_list:
        if ex not in string:
            answer.append(string)
            
    answer = ''.join(answer)
    
    return answer