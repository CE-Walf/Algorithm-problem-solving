# 1986. 지그재그 숫자
# 난이도 : D2

# 1부터 N까지의 숫자에서 홀수는 더하고 짝수는 뺐을 때 최종 누적된 값

T = int(input())

for test_case in range(1,T+1):
    N = int(input())
    N_sum = 0
    
    for i in range(1,N+1):
        if i % 2 == 1:
            N_sum += i
        elif i % 2 == 0:
            N_sum -= i

    print("#{} {}".format(test_case, N_sum))
