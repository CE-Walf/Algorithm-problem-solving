# 13218. 조별과제
# 난이도 : D3

T = int(input())

for test_case in range(1,T+1):
    N = int(input())

    answer = N // 3

    print("#{} {}".format(test_case, answer))