def solution(n_str):
    answer = ''
    
    index = 0
    for n in n_str:
        if n != str(0):
            break
        index += 1
        
    answer = n_str[index:]
    
    return answer