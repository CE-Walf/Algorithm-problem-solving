def solution(arr, k):
    answer = []
    
    for i in range(len(arr)):
        if len(answer) == k:
            break
        if arr[i] not in answer:
            answer.append(arr[i])    
    
    # 서로 다른 수를 담고도, k보다 answer의 원소가 적을경우,
    if len(answer) < k:
        for i in range(k-len(answer)):
            answer.append(-1)
            
    return answer