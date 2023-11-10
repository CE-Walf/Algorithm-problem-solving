# 1217. [S/W 문제해결 기본] 4일차 - 거듭 제곱
# 난이도 : D3

for test_case in range(10):
    T = int(input())
    N, M = map(int,input().split())

    answer = 1
    for i in range(M):
        answer *= N

    print("#{} {}".format(T, answer))

