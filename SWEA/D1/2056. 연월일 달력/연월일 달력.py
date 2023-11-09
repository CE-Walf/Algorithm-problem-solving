# 2056. 연월일 달력
# 난이도 : D1

T = int(input())

# 1월부터 12월까지 날짜 정보
monthDay = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

for t in range(1,T+1):
    ymd = input() # 입력 받기

    answer = '' # 정답을 담을 변수

    year = ymd[:4] # 년
    month = ymd[4:6] # 월
    day = ymd[6:8] # 일

    if  1 <= int(month) <= 12 and 1 <= int(day) <= monthDay[int(month)-1]:
        answer = year + '/' + month + '/' + day
    else:
        answer = str(-1)

    print("#{} {}".format(t, answer))


