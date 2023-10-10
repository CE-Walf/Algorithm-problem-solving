T = int(input())

for test_case in range(1, T + 1):
    tc = int(input())
    N_list = list(map(int, input().split()))

    count_list = [0] * 101

    for N in N_list:
        count_list[N] += 1

    max_count = 0
    max_index = 0 

    for count in range(1, len(count_list)):
        if max_count <= count_list[count]:
            max_count = count_list[count]
            max_index = count

    print('#' + str(test_case) + ' ' + str(max_index))