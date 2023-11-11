# 10505. 소득 불균형
# 난이도 : D3

T = int(input())

for test_case in range(1,T+1):
    N = int(input())
    N_list = list(map(int,input().split()))

    # 평균 구하기
    aver = sum(N_list) / N

    # 평균 이하 세는 변수
    count = 0

    for element in N_list:
        if element <= aver:
            count += 1

    print("#{} {}".format(test_case, count))