def solution(num_list):

    a = 1
    for i in num_list:
        a *= i
        
    b = sum(num_list)
    b = b ** 2
    
    if a < b:
        answer = 1
    else: 
        answer = 0
        
    return answer