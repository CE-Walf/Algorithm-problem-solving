N = int(input())
count = 0

# Factorial 구하기
answer = 1
for i in range(2, N+1):
  answer *= i
answer = str(answer)

# 뒤에서부터 0 세기
for i in range(len(answer)-1,-1,-1):
  if answer[i] != '0':
    break
  count += 1
  
print(count)