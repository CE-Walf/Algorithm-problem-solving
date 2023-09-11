N = int(input())

for i in range(N):
  sentence_list = input().split()
  
  for word in sentence_list:
    print(word[::-1], end = ' ')

  print()

