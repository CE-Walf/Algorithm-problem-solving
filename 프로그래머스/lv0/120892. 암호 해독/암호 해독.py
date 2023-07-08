def solution(cipher, code):
    answer = ''
    temp_list = list()
    
    for i in range(code-1, len(cipher), code):
        temp_list.append(cipher[i])
        
    answer = ''.join(temp_list)
    
    return answer