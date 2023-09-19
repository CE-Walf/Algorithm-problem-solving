import copy

def solution(arr):
    answer = 0 # 반복 횟수
    
    while True:
        temp_arr = copy.deepcopy(arr)
        # 값이 50보다 크거나 같은 짝수라면 2로 나누기
        # 값이 50보다 작은 홀수라면, 2를 곱하고 다시 1을 더하기
        for i in range(len(arr)):
            if arr[i] >= 50 and arr[i] % 2 == 0:
                arr[i] = arr[i] // 2
            elif arr[i] < 50 and arr[i] % 2 == 1:
                arr[i] =  arr[i] * 2 + 1

        answer += 1
        if temp_arr == arr:
            answer -= 1
            break
        
    return answer