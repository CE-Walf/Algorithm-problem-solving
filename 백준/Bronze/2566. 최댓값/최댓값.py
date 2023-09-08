matrix = list()
for i in range(9):
  matrix.append(list(map(int, input().split())))
  
max = 0

for i in range(9):
  for j in range(9):
    if max <= matrix[i][j]:
      max = matrix[i][j]
      result_i, result_j = i + 1, j + 1
      
print(max)
print(result_i, result_j)