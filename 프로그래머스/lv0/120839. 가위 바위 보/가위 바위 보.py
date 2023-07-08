def solution(rsp):
    temp_list = list()
    answer = ''
    
    for i in rsp:
        if i == '2':
            temp_list.append('0')
        elif i == '0':
            temp_list.append('5')
        elif i == '5':
            temp_list.append('2')
            
    answer = ''.join(temp_list)
    
    return answer