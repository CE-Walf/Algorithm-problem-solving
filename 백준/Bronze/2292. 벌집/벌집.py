N = int(input())

i = 0
boundary = 1
while True:
  boundary += 6*i
  if N <= boundary:
    print(i+1)
    break
  i += 1