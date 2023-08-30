def solution(s):
    answer = True
    
    open_count = 0
    close_count = 0
    
    for i in s:
        if i == '(':
            open_count += 1
        else:
            close_count += 1
        
        if open_count < close_count:
            answer = False
    if open_count != close_count:
        answer = False
        
    return answer