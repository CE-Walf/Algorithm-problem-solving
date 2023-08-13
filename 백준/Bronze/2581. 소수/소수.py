def isPrime(num):
  
  if num == 1:
    return False
  
  for i in range(2, num):
    if num % i == 0:
      return False
    
  return True

N = int(input())
M = int(input())

prime_list = list()
for i in range(N, M+1):
  if isPrime(i):
    prime_list.append(i)
    
if len(prime_list) == 0:
  print(-1)
else:
  print(sum(prime_list))
  print(min(prime_list))

