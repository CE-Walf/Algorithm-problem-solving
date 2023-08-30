def solution(my_string):
    answer = [0 for i in range(52)]
    
    # A = 65, Z = 90
    # a = 97 z = 122     
    for i in my_string:
        if i.isupper():
            answer[ord(i)-65] += 1
        else:
            answer[ord(i)-97-26] += 1
        
    return answer