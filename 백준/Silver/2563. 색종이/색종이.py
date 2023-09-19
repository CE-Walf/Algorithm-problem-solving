N = int(input()) # 색종이의 수

# 가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지 
# 이 도화지에 색칠이 되어있지 않은 부분은 0으로
# 색칠이 되어있는 부분은 1을 더해, 0인 부분의 넓이를 더한다.
drawing_paper = [[0]*100 for _ in range(100)]

for i in range(N):
  # x : 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리
  # y : 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리
  x, y = map(int,input().split()) 
  
  for i in range(x, x+10):
    for j in range(y, y+10):
      drawing_paper[i][j] += 1
      
# 전체에서 흰색 부분을 빼준다면, 그것이 검정 부분일 것이다.
# 흰색 부분은 해당 위치에 값이 0이다.
count = 0

for line in drawing_paper:
  for element in line:
    if element == 0:
      count += 1
      
answer = 10000 - count
print(answer)