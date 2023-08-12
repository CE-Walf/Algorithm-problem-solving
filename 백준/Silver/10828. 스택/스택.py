import sys

N = int(sys.stdin.readline())
stack = []

for i in range(N):
  command = sys.stdin.readline().split()
  
  if command[0] == "push":
    stack.append(int(command[1]))
  elif command[0] == "pop":
    print(stack.pop()) if len(stack) > 0 else print(-1)
  elif command[0] == "top":
    print(stack[-1]) if len(stack) > 0 else print(-1)
  elif command[0] == "size":
    print(len(stack))
  elif command[0] == "empty":
    print(0) if len(stack) > 0 else print(1)