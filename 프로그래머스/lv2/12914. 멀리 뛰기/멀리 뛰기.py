# 재귀로 진행할 시, 시간초과
def solution(n):
    dp = [0, 1, 2] # 0은 필요없는 수.
    
    for i in range(3,n+1):
        dp.append(dp[i-1] + dp[i-2])
    
    answer = dp[n] % 1234567
    
    return answer