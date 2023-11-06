# 2005. 파스칼의 삼각형
# 난이도 : D2

T = int(input())

for test_case in range(1, T+1):
    N = int(input()) # 삼각형의 크기 N은 1 이상 10 이하의 정수

    rectangle = [[1]] # 맨 위 미리 설정

    # 그 아래 부분 설정
    for i in range(N-1):
        temp_list = []
        temp_list.append(1)
        for j in range(i):
            temp_list.append(i+1)
        temp_list.append(1)
        rectangle.append(temp_list)

    print("#{}".format(test_case))

    for floor in rectangle:
        print(' '.join(map(str,floor)))


