def solution(numbers):
    answer = []
    
    # 다 더하고, set을 이용하여 중복을 제거해주자.
    for i in range(len(numbers)):
        for j in range(i+1, len(numbers)):
            answer.append(numbers[i] + numbers[j])
            
    answer = list(set(answer)) # 중복 제거
    answer.sort() # 정렬
    
    return answer