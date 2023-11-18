# 1225. [S/W 문제해결 기본] 7일차 - 암호생성기
# 난이도 : D3

T = 10 # 테스트 케이스 10개

for _ in range(1,T+1):
    test_case = int(input()) # 테스트 케이스 번호
    password_list = list(map(int,input().split())) # 8개의 데이터

    # 암호의 마지막 숫자가 0이면 반복문 종료
    while password_list[-1] != 0:
        for i in range(1, 6): # 한 사이클 1 ~ 5
            if password_list[-1] <= 0:
                password_list[-1] = 0 # 0 이하일 경우, 0으로
                break
            password_list.append(password_list[0] - i)
            password_list.pop(0) 
            
    answer = ' '.join(map(str,password_list))

    print("#{} {}".format(test_case, answer))