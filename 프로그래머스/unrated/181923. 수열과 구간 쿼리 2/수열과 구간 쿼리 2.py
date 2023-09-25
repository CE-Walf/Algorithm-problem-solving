def solution(arr, queries):
    answer = []
    
    for (s, e, k) in queries:
        temp_list = arr[s:e+1] # 해당하는 범위에 알맞는 임시 리스트
        temp_list.sort()
        for i in range(len(temp_list)):
            if temp_list[i] > k:
                answer.append(temp_list[i])
                break
            # 끝까지 반복문을 순회했는데 break문을 안 만났을시,
            if i == len(temp_list)-1:
                answer.append(-1)
    return answer