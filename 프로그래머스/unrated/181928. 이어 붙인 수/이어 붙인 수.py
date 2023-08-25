def solution(num_list):
    oddSum = ''
    evenSum = ''
    
    for num in num_list:
        if num % 2 == 0:
            evenSum += str(num)
        else:
            oddSum += str(num)
            
    answer = int(evenSum) + int(oddSum)
    
    return answer