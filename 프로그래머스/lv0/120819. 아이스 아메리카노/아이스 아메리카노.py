def solution(money):
    answer = []
    
    share = money // 5500
    remain = money % 5500
    
    answer.append(share)
    answer.append(remain)
    
    return answer