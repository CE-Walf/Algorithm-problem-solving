# sides에 가장 큰 변이 있을경우, 없을 경우를 나누어 계산하자.
# 조건 = 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 한다.
def solution(sides):
    answer = 0
    sides.sort()
    
    # 1. sides에 가장 큰 변이 존재하였을때
    answer += sides[0]
    
    # 2. sides에 가장 큰 변이 존재하지 않을 때
    answer +=  sides[0]-1
    
    return answer