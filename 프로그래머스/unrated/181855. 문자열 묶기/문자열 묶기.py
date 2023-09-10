def solution(strArr):
    
    answer = 0
    length_list = [0] * 31
    for str in strArr:
        length_list[len(str)] += 1
    
    answer = max(length_list)
    
    return answer