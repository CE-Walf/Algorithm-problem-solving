submit_list = list()

for i in range(28):
  submit_list.append(int(input()))
  
for i in range(1, 31):
  if i not in submit_list:
    print(i)