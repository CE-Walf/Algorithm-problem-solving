T = int(input()) #테스트 케이스의 수

for test_case in range(1, T+1):
  N = int(input()) # 시험문제의 수
  score_list = list(map(int,input().split())) # 각 문제의 배점들

  visited = [0] * (sum(score_list) + 1) # 점수의 합만큼의 배열 크기 생성 (그것이 최대 점수일 터이니)
  visited[0] = 1 # 다 틀리면 0점이므로 1 추가가

  for score in score_list:
    for i in range(len(visited)-1, -1, -1):
      if visited[i] == 1:
        visited[i + score] = 1

  print("#{} {}".format(test_case,sum(visited)))