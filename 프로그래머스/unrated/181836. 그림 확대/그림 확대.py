def solution(picture, k):
    answer = []
    
    for pic in picture:
        temp_string = ''
        for ele in pic:
            temp_string += ele * k
        for i in range(k):
            answer.append(temp_string)
            
    return answer