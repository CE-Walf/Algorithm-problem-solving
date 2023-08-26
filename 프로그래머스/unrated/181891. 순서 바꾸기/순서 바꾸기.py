def solution(num_list, n):
    answer = []
    
    listA = num_list[n:]
    listB = num_list[:n]
    
    for i in listA:
        answer.append(i)
    for i in listB:
        answer.append(i)
    
    return answer