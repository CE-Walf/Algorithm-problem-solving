N = int(input())

for i in range(N):
  PS = input()
  
  open_count = 0
  close_count = 0
  for i in PS:
    if i == '(':
      open_count += 1
    elif i == ')':
      close_count += 1
      
    if open_count < close_count:
      judge = "NO"
      break
    
  if open_count == close_count:
    judge = "YES"
  else:
    judge = "NO"
    
  print(judge)