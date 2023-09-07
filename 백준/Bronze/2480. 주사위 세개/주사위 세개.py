A, B, C = map(int, input().split())

if A == B and B == C and A == C:
  price = 10000 + A * 1000
elif A != B and B != C and C != A:
  price = max(A, B, C) * 100
else:
  if A == B or A == C:
    price = 1000 + A * 100
  elif B == C:
    price = 1000 + B * 100
  
  
print(price)
  