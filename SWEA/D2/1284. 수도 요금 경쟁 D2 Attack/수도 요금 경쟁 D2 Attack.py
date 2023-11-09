# 1284. 수도 요금 경쟁
# 난이도 : D2

T = int(input())

# 한 달간 사용하는 수도의 양 : W
for test_case in range(1, T+1):
    P, Q, R, S, W = map(int,input().split())

    # A사 : 1L당 요금 P
    A_fee = P * W

    # B사 : 월간 사용량이 R리터 이하인 경우 기본요금 Q 청구
    #       R리터를 초과하여 사용하였을 경우, 초과량 1L당 요금 S
    if W <= R:
        B_fee = Q
    else:
        B_fee = Q + S * (W-R)


    answer = min(A_fee, B_fee)

    print("#{} {}".format(test_case, answer))