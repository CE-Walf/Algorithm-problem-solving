def getGCD(a, b):
    while b > 0:
        a, b = b, a % b
    return a

def getLCM(a,b):
    return a * b // getGCD(a,b)

def solution(arr):
    temp_arr = arr.copy()

    for i in range(1, len(temp_arr)):
        temp_arr[i] = getLCM(temp_arr[i - 1], temp_arr[i])

    answer = temp_arr[-1]
    
    return answer