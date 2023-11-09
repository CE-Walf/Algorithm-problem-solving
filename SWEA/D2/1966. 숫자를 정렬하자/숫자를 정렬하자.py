# 1966. 숫자를 정렬하자
# 난이도 : D2

T = int(input())

for test_case in range(1, T+1):
    N = int(input())
    N_list = list(map(int,input().split()))

    # 정렬
    N_list.sort()

    print('#' + str(test_case), end = ' ')
    for element in N_list:
        print(element, end=' ')
    print()
