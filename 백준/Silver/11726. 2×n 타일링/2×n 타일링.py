# 입력 : n (1 <= n <= 1000)
n = int(input())

# 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수
#  2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력
dp = [0] * 1001
dp[1] = 1
dp[2] = 2

for i in range(3, 1001):
  dp[i] = (dp[i-1] + dp[i-2]) % 10007
  
print(dp[n])