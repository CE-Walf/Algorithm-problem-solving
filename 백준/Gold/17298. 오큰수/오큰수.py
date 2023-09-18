N = int(input())
N_list = list(map(int, input().split()))
answer_list = [-1]*N
index_stack = []

index_stack.append(0)
for i in range(1,N):
  # index_stack에 내용이 존재하고, 
  # index_stack의 마지막 원소 위치의 N_list 원소와
  # N_list의 i번쨰 원소보다 작을 시에만 
  # 반복문 실행
  while index_stack and N_list[index_stack[-1]] < N_list[i]:
    answer_list[index_stack.pop()] = N_list [i]
  index_stack.append(i)

# 리스트 개별요소로 분리하여 출력
print(*answer_list)