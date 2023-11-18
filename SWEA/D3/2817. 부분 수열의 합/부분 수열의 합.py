# 2817. 부분 수열의 합
# 난이도 : D3
def DFS(index, total): # 횟수, 합한 값
    global count

    # 합이 K일 경우, 경우의 수 담는 변수에 1추가
    if total == K:
        count += 1
        return

    # K보다 커져버렸을 경우 그리고 index가 N이 되었을 경우, 반환
    if index == N or total > K:
        return

    # N_list의 요소
    element = N_list[index]

    DFS(index + 1, total + element) # 해당 값을 더할때,
    DFS(index + 1, total) # 해당 값을 더하지 않을때


T = int(input())

for test_case in range(1,T+1):
    N, K = map(int,input().split())
    N_list = list(map(int,input().split())) #[1,2,1,2] 이런 느낌

    count = 0 # 경우의 수를 셀 변수

    DFS(0,0) # DFS

    print("#{} {}".format(test_case, count))



