# 유클리드 호제법
def getGCD(a, b):
    
    if a % b == 0:
        return b
    elif b == 0:
        return a
    else:
        return getGCD(b, a % b)
    
def solution(n, m):
    answer = []
    
    nmGCD = getGCD(n,m)
    nmLCM = n * m / nmGCD
    
    answer.append(nmGCD)
    answer.append(nmLCM)
    
    return answer