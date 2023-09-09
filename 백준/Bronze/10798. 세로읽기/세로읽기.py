result_list = list()
result = ''

for i in range(5):
  temp_list = [''] * 15
  word = input()
  for j in range(len(word)):
    temp_list[j] = word[j]
  result_list.append(temp_list)
  
for i in range(15):
  for j in range(5):
    if result_list[j][i] != '':
      result += result_list[j][i]
      
print(result)