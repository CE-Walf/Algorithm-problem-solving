def solution(s):
    answer = True
    
    #p와 y의 개수를 셀 count variable
    pCount = 0
    yCount = 0
    
    #문자열을 소문자로 변환
    s = s.lower()
    
    for i in s:
        if i == 'p':
            pCount += 1
        elif i == 'y':
            yCount += 1
            
    if pCount != yCount:
        answer = False

    return answer