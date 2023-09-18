# 입력 : n (1 <= n <= 1000)
n = int(input())

# 2×n 직사각형을 1×2, 2×1과 2×2 타일로 채우는 방법의 수
dp = [0] * 1001
dp[1] = 1
dp[2] = 3

for i in range(3, 1001):
  dp[i] = (dp[i-1] + dp[i-2] * 2) % 10007

print(dp[n])