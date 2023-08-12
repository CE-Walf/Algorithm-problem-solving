N = int(input())
xy_list = list()

for i in range(N):
  x, y = map(int, input().split())
  xy_list.append([x,y])
  
xy_list.sort()

for dot in xy_list:
  print(dot[0], dot[1])
  