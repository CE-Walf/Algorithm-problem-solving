def solution(myString):
    answer = ''
    
    for i in myString:
        if ord('l') < ord(i):
            answer += i
        else:
            answer += 'l'
            
    return answer