# 2071. 평균값 구하기
# 난이도 : D1

T = int(input())

for test_case in range(1,T+1):
    N_list = list(map(int, input().split()))

    N_sum = sum(N_list)
    N_average = round(N_sum / len(N_list)) # 소숫점 첫째자리에서 반올림

    print("#{} {}".format(test_case, N_average))
