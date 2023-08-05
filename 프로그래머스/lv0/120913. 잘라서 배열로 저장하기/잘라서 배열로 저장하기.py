import math

def solution(my_str, n):
    answer = []
    temp = 0
    # 0부터 n까지
    # n부터 2n까지
    # 2n부터 끝까지 
    
    
    for i in range(math.ceil(len(my_str)/n)):
        answer.append(my_str[temp:temp+n])
        temp += n
        
    return answer