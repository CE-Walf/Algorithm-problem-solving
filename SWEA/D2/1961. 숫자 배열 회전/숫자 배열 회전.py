# 1961. 숫자 배열
# 난이도 : D2

T = int(input())

for test_case in range(1,T+1):
    N = int(input())
    N_matrix = [list(map(int,input().split())) for _ in range(N)]

    # 배열 초기화
    matrix_90 = [[0]*N for _ in range(N)]
    matrix_180 = [[0]*N for _ in range(N)]
    matrix_270 = [[0]*N for _ in range(N)]
    
    # 90도 돌린 행렬
    for i in range(N):
        for j in range(N):
            matrix_90[i][j] = N_matrix[N-1-j][i]

    # 180도 돌린 행렬 (90도를 다시 90도)
    for i in range(N):
        for j in range(N):
            matrix_180[i][j] = matrix_90[N-1-j][i]

    # 270도 돌린 행렬 (180도를 다시 90도 회전)
    for i in range(N):
        for j in range(N):
            matrix_270[i][j] = matrix_180[N-1-j][i]

    # 출력
    print('#' + str(test_case))
    for i in range(N):
        print(''.join(map(str,matrix_90[i])) + ' '
              + ''.join(map(str,matrix_180[i])) + ' '
              +''.join(map(str,matrix_270[i])))
