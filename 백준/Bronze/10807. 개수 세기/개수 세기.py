N = int(input())
N_list = map(int,input().split())
v = int(input())

count = 0

for num in N_list:
  if num == v:
    count += 1

print(count)