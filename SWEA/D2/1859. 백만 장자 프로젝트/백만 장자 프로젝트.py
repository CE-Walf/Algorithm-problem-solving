T = int(input())

for test_case in range(1, T + 1):
  N = int(input())
  N_list = list(map(int, input().split()))
  
  answer = 0
  max_price = 0
  
  for i in range(len(N_list)-1, -1, -1):
    if max_price < N_list[i]:
      max_price = N_list[i]
    else:
      answer += max_price - N_list[i]
      
  print('#' + str(test_case) + ' ' + str(answer))
