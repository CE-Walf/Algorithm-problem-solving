def solution(l, r):
    answer = []
    
    for i in range(l,r+1):
        str_val = str(i)
        flag = True
        for val in str_val:
            if val != "5" and val != "0":
                flag = False
                break
        if flag:
            answer.append(i)
            
    if len(answer) == 0:
        answer.append(-1)
                   
    return answer