def solution(numbers, k):
    
    answer = numbers[(1 + 2 * (k-1)) % len(numbers) - 1]
        
    return answer