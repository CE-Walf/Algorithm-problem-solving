import math

while True:
  number = input()
  if number == '0':
    break
  
  answer = 'yes'
  for i in range(0,math.floor(len(number)//2)):
    if number[i] != number[-i-1]:
      answer = 'no'
  
  print(answer)
