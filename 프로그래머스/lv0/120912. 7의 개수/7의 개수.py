def solution(array):
    answer = 0
    
    for element in array:
        for num in str(element):
            if num == '7':
                answer += 1
                
    return answer