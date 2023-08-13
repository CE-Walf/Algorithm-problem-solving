import math

N, K = map(int, input().split())

answer = math.comb(N,K)

print(answer)
