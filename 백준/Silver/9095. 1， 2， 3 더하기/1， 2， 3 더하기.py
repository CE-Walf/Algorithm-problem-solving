def solution(num):
  if num == 1:
    return 1
  elif num == 2:
    return 2
  elif num == 3:
    return 4
  else:
    return solution(num-1) + solution(num-2) + solution(num-3)
    
T = int(input())

for i in range(T):
  N = int(input())
  print(solution(N))

