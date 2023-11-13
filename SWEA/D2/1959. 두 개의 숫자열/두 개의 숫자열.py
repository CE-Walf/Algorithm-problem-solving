# 1959. 두 개의 숫자열
# 난이도 : D2

T = int(input())

for test_case in range(1,T+1):
    N, M = map(int, input().split())
    Ai = list(map(int,input().split()))
    Bj = list(map(int,input().split()))

    # 가능한 모든 조합의 경우의 수를 담을 리스트
    sum_list = list()

    # Ai 와 Bj중 더 길이가 작은 것이 무엇인지 탐색한다.
    if N < M:
        flag = True
    else:
        flag = False

    # True 일때는, Bj가 더 긴 리스트 (Ai가 기준)
    # False 일때는, Ai가 더 긴 리스트 (Bj가 기준)
    if flag:
        for i in range(M-N+1):
            temp_sum = 0
            for j in range(N):
                temp_sum += Ai[j] * Bj[j+i]
            sum_list.append(temp_sum)
    else:
        for i in range(N-M+1):
            temp_sum = 0
            for j in range(M):
                temp_sum += Ai[j+i] * Bj[j]
            sum_list.append(temp_sum)

    # 모든 경우의 수에서 가장 큰 값이 해답
    answer = max(sum_list)

    print("#{} {}".format(test_case, answer))

