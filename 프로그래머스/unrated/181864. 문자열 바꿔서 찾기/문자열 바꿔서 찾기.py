def solution(myString, pat):
    tempString = ''
    
    for i in range(len(myString)):
        if myString[i] == 'A':
            tempString += 'B'
        elif myString[i] == 'B':
            tempString += 'A'
            
    if pat in tempString:
        answer = 1
    else:
        answer = 0
        
    return answer