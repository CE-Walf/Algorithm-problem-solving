# 2070. 큰 놈, 작은 놈, 같은 놈
# 난이도 : D1

T = int(input())

for test_case in range(1, T+1):
    a, b = map(int, input().split())

    if a > b:
        answer = ">"
    elif a == b:
        answer = "="
    else:
        answer = "<"

    print("#{} {}".format(test_case, answer))
