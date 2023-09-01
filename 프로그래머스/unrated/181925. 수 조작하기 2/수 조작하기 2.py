def solution(numLog):
    answer = ''
    
    for i in range(1,len(numLog)):
        calc = numLog[i] -numLog[i-1]
        
        if calc == 1:
            answer += 'w'
        elif calc == -1:
            answer += 's'
        elif calc == 10:
            answer +=  'd'
        else:
            answer += 'a'
        
    return answer