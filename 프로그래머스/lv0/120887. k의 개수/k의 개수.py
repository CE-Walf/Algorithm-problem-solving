def solution(i, j, k):
    count = 0
    
    for index in range(i, j+1):
        for ch in str(index):
            if ch == str(k):
                count +=1
                
    return count