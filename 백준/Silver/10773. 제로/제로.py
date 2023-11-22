K = int(input())
K_list = list() # 돈을 부르는 리스트

for i in range(K):
    M = int(input())

    if M == 0:
        K_list.pop()
    else:
        K_list.append(M)

answer = sum(K_list)

print(answer)