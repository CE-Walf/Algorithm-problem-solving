def solution(myString, pat):
    myString = myString.upper()
    pat = pat.upper()

    if pat in myString:
        answer = 1
    else:
        answer = 0
        
    return answer