# 1970. 쉬운 거스름돈
# 난이도 : D2

T = int(input())
pay_list = [50000, 10000, 5000, 1000, 500, 100, 50, 10]

for test_case in range(1,T+1):
    N = int(input())

    print('#' + str(test_case))
    for pay in pay_list:
        print(N // pay, end=' ')
        N = N % pay
    print()
