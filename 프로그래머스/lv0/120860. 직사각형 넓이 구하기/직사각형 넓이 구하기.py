def solution(dots):
    x_list = [dot[0] for dot in dots]
    y_list = [dot[1] for dot in dots]
    
    x = abs(max(x_list) - min(x_list))
    y = abs(max(y_list) - min(y_list))
    
    answer = x * y
    
    return answer