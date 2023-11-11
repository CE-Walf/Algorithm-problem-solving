# 12368. 24시간
# 난이도 : D3

T = int(input())

for test_case in range(1,T+1):
    A, B = map(int, input().split())
    answer = (A + B) % 24

    print("#{} {}".format(test_case, answer))