N, M = map(int, input().split())

A_matrix = list()
B_matrix = list()

for i in range(N):
  A_matrix.append(list(map(int, input().split())))
  
for i in range(N):
  B_matrix.append(list(map(int, input().split())))
  
result_matrix = list() 
 
for i in range(N):
  temp_list = list()
  for j in range(M):
    temp_list.append(A_matrix[i][j] + B_matrix[i][j])
  result_matrix.append(temp_list)
  
# 결과 행렬 출력
for i in range(N):
  for j in range(M):
    print(result_matrix[i][j], end=' ')
  print()