N = int(input())

for i in range(1, N+1):
  str_i = str(i)
  list_i = list()
  for j in str_i:
    list_i.append(int(j))
  sum_i = sum(list_i)
  sum2 = sum_i + i
  if sum2 == N:
    answer = i
    break
  if i == N:
    answer = 0
  
print(answer)