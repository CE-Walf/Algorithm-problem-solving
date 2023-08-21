def solution(x):
    x_str = str(x)
    x_sum = 0
    for i in x_str:
        x_sum += int(i)
        
    if x % x_sum == 0:
        answer = True
    else:
        answer = False
    
    return answer