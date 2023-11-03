T = int(input())

# 우, 하, 좌, 상 순으로 움직이고,그때의 i와 j의 변화를 담은 리스트
direction_i = [0, 1, 0, -1]
direction_j = [1, 0, -1, 0]

for test_case in range(1, T + 1):
  N = int(input()) # N 입력
  snail = [[0] * N for _ in range(N)]   # N x N의 빈 배열 생성

  direction_index = 0 # 방향을 바꾸기 위해 사용하는 변수
  i, j = 0, -1 # 인덱스 변수 i, j 초기 좌표 설정
  count = 1

  # 1부터 N*N까지 값을 배열에 넣어준다.
  while count <= N*N:
    # 다음 좌표 설정
    next_i = i + direction_i[direction_index]
    next_j = j + direction_j[direction_index]

    if next_i < N and next_j < N and snail[next_i][next_j] == 0:
      i = next_i
      j = next_j
      snail[i][j] = count
      count += 1
    else:
      direction_index = (direction_index + 1) % 4

  print("#" + str(test_case))
  # 이 아래 배열 입력
  for row in snail:
    print(*row)