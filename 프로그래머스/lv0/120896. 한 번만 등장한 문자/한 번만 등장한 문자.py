def solution(s):
    answer = ''
    
    for alphabet in s:
        if s.count(alphabet) == 1:
            answer += alphabet
            
    answer = ''.join(sorted(answer))
    
    return answer