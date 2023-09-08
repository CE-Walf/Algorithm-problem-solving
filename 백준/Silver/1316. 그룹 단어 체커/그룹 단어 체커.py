N = int(input())
count = N

for i in range(N):
  word = input()
  word_list = list()
  
  for j in word:
    if j not in word_list:
      word_list.append(j)
    else:
      if word_list[-1] != j:
        count -= 1
        break
      
print(count)