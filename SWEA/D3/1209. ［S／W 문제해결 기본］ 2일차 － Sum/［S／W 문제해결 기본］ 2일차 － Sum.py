T = 10
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
  N = int(input())

  # 100 x 100 행렬
  N_matrix = list()
  
  # 100개의 행을 list 형태로 가져오게 된다.
  for i in range(100):
    N_matrix.append(list(map(int, input().split())))
    
  # 최종적으로 가장 큰 최댓 값
  answer = -1
    
  # 각 행의 합 중에서 최댓값 구하기
  for i in range(100):
    row_sum = sum(N_matrix[i])
    if row_sum > answer:
      answer = row_sum
  
  # 각 열의 합 중에서 최댓값 구하기
  for i in range(100):
    column_sum = sum([N_matrix[j][i] for j in range(100)])
    if column_sum > answer:
      answer = column_sum

  # 대각선 두 개
  left_across_sum = 0
  right_across_sum = 0

  for i in range(100):
    left_across_sum += N_matrix[i][i]
    right_across_sum += N_matrix[i][99-i]
    
  if left_across_sum > answer:
      answer = left_across_sum
  if right_across_sum > answer:
      answer = right_across_sum
  
  print('#' + str(test_case) + ' ' + str(answer))