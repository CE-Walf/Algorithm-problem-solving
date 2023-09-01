def solution(my_string, m, c):
    answer = ''
    string_list = list()
    
    for i in range(0, len(my_string)//m):
        string_list.append(my_string[m*i:m*i+m])
        
    for val in string_list:
        answer += val[c-1]
        
        
    return answer