def solution(arr, k):
    answer = []
    
    for var in arr:
        # if문은 짝수일때, elif문은 홀수일때, 
        if k % 2 == 0:
            answer.append(var+k)
        elif k % 2 != 0:
            answer.append(var*k)
            
    return answer