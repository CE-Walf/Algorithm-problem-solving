def solution(arr1, arr2):
    
    if len(arr1) > len(arr2):
        answer = 1
    elif len(arr1) < len(arr2):
        answer = -1
    else:
        if sum(arr1) > sum(arr2):
            answer = 1
        elif sum(arr1) < sum(arr2):
            answer = -1
        else:
            answer = 0
            
    return answer