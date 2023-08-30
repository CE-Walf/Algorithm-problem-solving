def solution(n):
    count = 0
    
    for i in range(1,n+1):
        temp_sum = 0
        for j in range(i,n+1):
            temp_sum += j
            if temp_sum == n:
                count += 1
                break
            if temp_sum > n:
                break
        
    return count