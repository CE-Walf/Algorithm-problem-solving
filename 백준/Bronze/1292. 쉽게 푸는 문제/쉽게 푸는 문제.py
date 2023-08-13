A, B = map(int, input().split())
sequence_list = list()

for i in range(1, B+1):
  for j in range(1, i+1):
    sequence_list.append(i)
    
answer = sum(sequence_list[A-1:B])
print(answer)