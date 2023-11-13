# 2805. 농작물 수확하기
# 난이도 : D3

T = int(input())

for test_case in range(1,T+1):
    N = int(input()) # 농장의 크기
    N_matrix = [list(map(int,input())) for _ in range(N)] # 농장의 정보
    harvest = 0 # 수확량 세는 변수

    # 모든 원소들을 다 더해준다.
    for i in range(N):
        mid = N // 2
        if i > mid:
            scope = abs(i - N + 1)
        else:
            scope = i
        for j in range(mid - scope, mid + scope + 1):
            harvest += N_matrix[i][j]

    print("#{} {}".format(test_case, harvest))



