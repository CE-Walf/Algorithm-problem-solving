T = int(input())

for test_case in range(1, T+1):
  # N x N의 단어 퍼즐, 길이 K의 단어
  N, K = map(int, input().split())

  # 가로 세로의 끝부분에 0을 추가하고, 리스트 만들기
  N_list = list()
  N_list.append([0]*(N+2))
  for element in range(N):
    N_list.append([0] + list(map(int,input().split())) + [0])
  N_list.append([0]*(N+2))

  count = 0 # 들어갈 수 있는 자리의 수

  # 가로 살펴보기
  for i in range(1, N+1): # i행
      for j in range(1, N-K+2): # j열
        width = 0
        for a in range(K):
          width += N_list[i][j+a]
        if width == K and N_list[i][j+K] == 0 and N_list[i][j-1] == 0:
          count += 1
          width = 0


  # 세로 살펴보기
  for i in range(1, N+1):
      for j in range(N-K+2):
        height = 0
        for b in range(K):
          height += N_list[j+b][i]
        if height == K and N_list[j+K][i] == 0 and N_list[j-1][i] == 0:
          count += 1
          height = 0

  print("#{} {}".format(test_case, count))