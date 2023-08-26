def solution(myString):
    answer = []
    
    split_x = myString.split('x')
    for i in split_x:
        answer.append(len(i))
    
    return answer