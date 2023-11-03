T = int(input())

for test_case in range(1, T + 1):
  N, M = map(int, input().split()) # N = 파리의 개수, M = 파리체의 범위

  # 파리의 위치가 담긴 N x N배열 담기
  N_list = list()
  for fly in range(N):
    N_list.append(list(map(int,input().split())))

  # M x M 범위의 합을 담을 리스트
  fly_list = list()

  for i in range(N-M+1):
    for j in range(N-M+1):
      temp_sum = 0 # 합 더하기
      for M1 in range(M):
        for M2 in range(M):
          temp_sum += N_list[i + M1][j + M2]
      fly_list.append(temp_sum)

  print("#{} {}".format(test_case,max(fly_list)))

