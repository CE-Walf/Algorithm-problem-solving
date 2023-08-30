def solution(arr):
    first2_index = 0
    last2_index = 0
    
    if 2 not in arr:
        return [-1]
    
    for i in range(len(arr)):
        if arr[i] == 2:
            first2_index = i
            break
            
    for j in range(len(arr)-1,-1,-1):
        if arr[j] == 2:
            last2_index = j
            break
            
    answer = arr[first2_index:last2_index+1]
    
    return answer