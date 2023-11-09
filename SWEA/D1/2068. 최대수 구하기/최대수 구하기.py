# 2068. 최대수 구하기
# 난이도 : D1

T = int(input())

for test_case in range(1,T+1):
    T_list = list(map(int, input().split()))
    max_T = max(T_list)

    print("#{} {}".format(test_case, max_T))