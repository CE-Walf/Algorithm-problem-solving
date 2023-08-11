N = int(input())
member_list = list()

for num in range(N):
  age, name = input().split()
  age = int(age)
  member_list.append([age,name])
  
member_list.sort(key=lambda x:x[0])
  
for member in member_list:
  print(member[0],member[1])