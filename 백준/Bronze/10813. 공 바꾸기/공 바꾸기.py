N, M = map(int, input().split())

N_arr = [index for index in range(1, N+1)]

for k in range(M):
  i, j = map(int, input().split())
  temp = N_arr[j-1]
  N_arr[j-1] = N_arr[i-1]
  N_arr[i-1] = temp
  
for element in N_arr:
  print(element, end=' ')
  
  