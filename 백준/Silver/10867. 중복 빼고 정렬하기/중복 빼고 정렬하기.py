N = int(input())

element_list = list(set(map(int, input().split())))

element_list.sort()

for element in element_list:
  print(element, end=' ')




