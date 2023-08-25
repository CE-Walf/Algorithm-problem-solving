def solution(a, b):
    val_1 = int(str(a) + str(b))
    val_2 = int(str(b) + str(a))
    
    if val_1 > val_2:
        answer = val_1
    else:
        answer = val_2
        
    return answer