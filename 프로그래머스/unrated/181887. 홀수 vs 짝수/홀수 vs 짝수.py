def solution(num_list):
    oddSum = 0
    evenSum = 0
    
    for i in range(0,len(num_list)):
        if (i + 1) % 2 == 1:
            oddSum += num_list[i]
        elif (i + 1) % 2 == 0:
            evenSum += num_list[i]
            
    if oddSum > evenSum:
        answer = oddSum
    else:
        answer = evenSum
        
    return answer