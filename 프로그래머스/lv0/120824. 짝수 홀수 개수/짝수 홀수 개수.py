def solution(num_list):
    answer = []
    
    oddNum = 0
    evenNum = 0
    
    for i in num_list:
        if i % 2 == 0:
            evenNum += 1
        elif i % 2 == 1:
            oddNum += 1
    
    answer.append(evenNum)
    answer.append(oddNum)
    
    return answer