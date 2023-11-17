# 1244. [S/W 문제해결 응용] 2일차 - 최대 상금
# 난이도 : D3

def DFS(n):
    global answer # 보다 큰 값이 나올때 수정이 필요하기에, 전역변수로 수정해준다.

    if n == N:
        answer = max(answer, int(''.join(map(str,numPad))))
        return

    for i in range(numPad_len-1):
        for j in range(i+1, numPad_len):
            numPad[i], numPad[j] = numPad[j], numPad[i]

            tuple_visited = (int(''.join(map(str,numPad))),n) # (숫자값, 교환횟수)
            if tuple_visited not in visited:
                DFS(n+1)
                visited.append(tuple_visited)

            numPad[i], numPad[j] = numPad[j], numPad[i]


T = int(input())

for test_case in range(1,T+1):
    numPad, N = input().split() # 우선 문자열로 받아와 준다.
    numPad = list(map(int, numPad)) # 입력된 문자열을 정수형 리스트 형태로 가져와 준다.
    N = int(N) # 교환 횟수 N

    numPad_len = len(numPad) # 숫자판의 크기
    answer = 0 # 정답을 담을 변수
    visited = list() # 방문을 확인할 변수

    DFS(0) # 횟수 0번부터 N번까지

    print("#{} {}".format(test_case, answer))
