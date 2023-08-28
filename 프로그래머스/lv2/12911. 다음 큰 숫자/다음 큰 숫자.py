def solution(n):
    answer = 0
    
    n_bin = bin(n)
    n_count = n_bin.count('1')
    
    while True:
        n += 1
        if n_count == bin(n).count('1'):
            answer = n
            break
    
    return answer