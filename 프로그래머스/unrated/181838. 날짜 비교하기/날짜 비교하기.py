def solution(date1, date2):
    answer = 0
    
    yearDiff = date2[0] - date1[0]
    monthDiff = date2[1] - date1[1]
    dayDiff = date2[2] - date1[2]
    
    if yearDiff > 0:
        answer = 1
    elif yearDiff < 0:
        answer = 0
    else:
        if monthDiff > 0:
            answer = 1
        elif monthDiff < 0:
            answer = 0
        else:
            if dayDiff > 0:
                answer = 1
            else:
                answer = 0
            
    return answer