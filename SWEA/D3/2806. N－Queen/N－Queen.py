# 2806. N-Queen
# 난이도 : D3

# 퀸은 같은 행, 열, 또는 대각선 위에 있는 말을 공격할 수 있다.
# N*N 보드에 N개의 퀸을 서로 다른 두 퀸이 공격하지 못하게 놓는 경우의 수 구하기
def DFS(n):
    global answer

    if n == N: # 0행 ~ N-1행 까지 탐색 하였을때,
        answer += 1
        return

    for j in range(N):
        if visited_height[j] == visited_left_diagonal[n+j] == visited_right_diagonal[n-j] == 0:
            visited_height[j] = visited_left_diagonal[n + j] = visited_right_diagonal[n - j] = 1
            DFS(n+1)
            visited_height[j] = visited_left_diagonal[n + j] = visited_right_diagonal[n - j] = 0 # 원상복귀


T = int(input())

for test_case in range(1, T+1):
    N = int(input())

    answer = 0 # 가능한 횟수 세기

    # 방문자 리스트. 열, 대각선 왼쪽, 대각선 오른쪽, 존재하는지 확인
    visited_height = [0] * N
    visited_left_diagonal = [0] * (2 * N)
    visited_right_diagonal = [0] * (2 * N)

    DFS(0)

    print("#{} {}".format(test_case, answer))
