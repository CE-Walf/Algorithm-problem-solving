def dfs(n): # n번째 행
    global answer

    if n == N: # 마지막 행까지 다다랐을때
        answer += 1
        return

    for j in range(N): # N개의 열
        if v1[j] == v2[n+j] == v3[n-j] == 0:
            v1[j] = v2[n+j] = v3[n-j] = 1
            dfs(n+1)
            v1[j] = v2[n+j] = v3[n-j] = 0

N = int(input())

answer = 0

v1 = [0] * N # 행에서
v2 = [0] * (2 * N) # 대각선 1
v3 = [0] * (2 * N) # 대각선 2

dfs(0)

print(answer)