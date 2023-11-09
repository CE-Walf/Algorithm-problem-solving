# 1288. 새로운 불면증 치료법
# 난이도 : D2

T = int(input())

for test_case in range(1,T+1):
    N = int(input())

    i = 0
    num_set = set()
    while True:
        i += 1
        multi_i = N * i
        multi_i = str(multi_i)

        for num in multi_i:
            if num not in num_set:
                num_set.add(num)

        if len(num_set) == 10:
            break

    print("#{} {}".format(test_case, i*N))