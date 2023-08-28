def solution(my_strings, parts):
    answer = ''
    
    i = 0
    for myString in my_strings:
        answer += myString[parts[i][0]:parts[i][1]+1]
        i += 1
            
        
    return answer