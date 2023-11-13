# 1215. [S/W 문제해결 기본] 3일차 - 회문1
# 난이도 : D3

T = 10 # 총 10개의 테스트 케이스

for test_case in range(1,T+1):
    N = int(input()) # 회문의 길이
    N_matrix = [list(input()) for _ in range(8)] # 8x8 행렬
    count = 0 # 회문 갯수 count 변수 (가로 세로 회문의 개수)

    # 가로 분석
    for i in range(8):
        for j in range(8-N+1):
            width_check_list = N_matrix[i][j:j+N]
            reverse_width_check_list = width_check_list[::-1]
            if width_check_list == reverse_width_check_list:
                count += 1

    # 세로 분석
    for i in range(8):
        for j in range(8-N+1):
            height_check_list = list()
            for k in range(j, j+N):
                height_check_list.append(N_matrix[k][i])
            reverse_height_check_list = height_check_list[::-1]
            if height_check_list == reverse_height_check_list:
                count += 1

    print("#{} {}".format(test_case, count))