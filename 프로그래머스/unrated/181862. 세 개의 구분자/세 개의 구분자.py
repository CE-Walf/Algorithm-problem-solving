def solution(myStr):
    answer = []
    
    temp_string = ''
    for alpha in myStr:
        if alpha == 'a' or alpha == 'b' or alpha == 'c':
            answer.append(temp_string)
            temp_string = ''
        else:
            temp_string += alpha
    
    # 마지막에 a,b,c를 제외한 알파벳이 나왔을때, APPEND
    answer.append(temp_string)
    
    # 빈 문자열 제거
    answer = list(filter(None, answer)) 
    
    #빈 문자열은 "EMPTY"
    if len(answer) == 0:
        answer.append("EMPTY")

    return answer