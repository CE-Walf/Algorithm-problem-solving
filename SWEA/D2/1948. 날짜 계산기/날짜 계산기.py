# 1948. 날짜 계산기
# 난이도 : D2

T = int(input())
# 0을 추가해 1월~12월 맞추기
month_day = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

for test_case in range(1, T+1):
    m1, d1, m2, d2 = map(int,input().split())
    answer = 0

    # m1 ~ m2 달의 날들을 다 더해준다.
    for i in range(m1, m2+1):
        answer += month_day[i]

    # 1 ~ d1 - 1 을 빼주어야 한다.
    answer -= d1 - 1
    # 그 달의 말일에 d2를 빼준것을 빼줘야 한다.
    answer -= month_day[m2] - d2

    print("#{} {}".format(test_case, answer))



