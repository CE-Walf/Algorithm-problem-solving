N = int(input())

PrimeFactors = list()

i = 2
while N != 1:
  if N % i == 0:
    PrimeFactors.append(i)
    N /= i
  else:
    i += 1
    
# 소인수 출력
for i in PrimeFactors:
  print(i)