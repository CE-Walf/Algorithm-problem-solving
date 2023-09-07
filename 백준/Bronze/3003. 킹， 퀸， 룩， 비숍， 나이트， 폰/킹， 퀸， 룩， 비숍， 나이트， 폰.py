# 킹 1개, 퀸 1개, 비숍 2개, 나이트 2개, 폰 8개
complete_list = [1, 1, 2, 2, 2, 8]
input_list = list(map(int,input().split()))

for i in range(6):
    print(complete_list[i] - input_list[i], end =' ')

