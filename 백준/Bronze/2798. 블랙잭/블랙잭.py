N, M  = map(int, input().split())
card_list = list(map(int, input().split()))

temp = 0
for i in range(0,N-2):
  for j in range(i+1,N-1):
    for k in range(j+1, N):
      multiply_card = card_list[i] + card_list[j] + card_list[k]
      
      if multiply_card > M:
        continue
      
      temp = max(temp, multiply_card)
      
print(temp)