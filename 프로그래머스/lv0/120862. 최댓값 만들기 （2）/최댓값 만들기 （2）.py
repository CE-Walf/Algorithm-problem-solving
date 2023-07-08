def solution(numbers):
    numbers.sort()
    
    value_1 = numbers[0] * numbers[1]
    value_2 = numbers[-1] * numbers[-2]
    
    if value_1 > value_2:
        answer = value_1
    else:
        answer = value_2
    
    return answer