# push = '+', pop = '-', if cannot sort, print 'NO'
N = int(input())
stack = []
command = []
i = 1
flag = True

# 1 부터 N까지 스택에 담아내면서, pop되어 나온 수열이 이 값이여야 한다.
for index in range(N):
  num = int(input())
  
  while i <= num:
    stack.append(i)
    i += 1
    command.append('+')
    
  if stack[-1] == num:
    stack.pop()
    command.append('-')
  else:
      flag = False
      break
      
#출력
if flag:
  for pushpop in command:
      print(pushpop)
else:
  print("NO")
  