def solution(array, n):
    distance = list()
    array.sort()
    
    for i in range(len(array)):
        distance.append(abs(n-array[i]))
    
    answer = distance.index(min(distance))
    answer = array[answer]
    
    return answer
        