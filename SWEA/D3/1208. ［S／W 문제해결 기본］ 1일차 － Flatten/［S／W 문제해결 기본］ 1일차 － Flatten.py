# 1208. [S/W 문제해결 기본] 1일차 - Flatten
# 난이도 : D3

T = 10

for test_case in range(1,T+1):
    number = int(input())
    box_list = list(map(int,input().split()))

    # 매 차례마다 정렬을 하고, N번 만큼 최댓값에서 1을 빼고 최솟값에 1을 더한다.
    box_list.sort()
    for i in range(number):
        box_list[0] += 1
        box_list[-1] -= 1
        box_list.sort()

    diff = box_list[-1] - box_list[0]
    
    print("#{} {}".format(test_case, diff))

