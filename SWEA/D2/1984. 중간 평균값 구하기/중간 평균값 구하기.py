# 1984. 중간 평균값 구하기
# 난이도 : D2

T = int(input())

for test_case in range(1, T+1):
    N_list = list(map(int,input().split()))
    max_N = max(N_list)
    min_N = min(N_list)

    # 최대 수와 최소 수를 제외한 나머지의 평균값을 출력
    aver_N = round((sum(N_list)-max_N-min_N) / 8)

    print("#{} {}".format(test_case, aver_N))