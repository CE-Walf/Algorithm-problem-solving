# def solution(arr, idx):
#     answer = -1
    
#     temp_arr = arr[idx:]
#     for i in range(len(temp_arr)):
#         if temp_arr[i] == 1:
#             answer = i + idx
#             break
    
#     return answer

# 다른 풀이 1

def solution(arr, idx):
    answer = -1
    
    for i in range(idx, len(arr)):
        if arr[i] == 1:
            answer = i
            break
            
    return answer