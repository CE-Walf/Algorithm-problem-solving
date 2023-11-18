# 3431. 준환이의 운동관리
# 난이도 : D3

T = int(input())

for test_case in range(1,T+1):
    L, U, X = map(int, input().split())

    if L <= X <= U:
        answer = 0
    elif X < L:
        answer = L-X
    else:
        answer = -1

    print("#{} {}".format(test_case, answer))
