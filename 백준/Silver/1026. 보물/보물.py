N = int(input())
A_list = list(map(int, input().split()))
B_list = list(map(int, input().split()))

tempB_list = B_list[:]

tempB_list.sort(reverse=True)
A_list.sort()

answer = 0
for i in range(0, N):
  answer += A_list[i] * tempB_list[i]
  
print(answer)





