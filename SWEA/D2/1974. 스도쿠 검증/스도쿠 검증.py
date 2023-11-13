# 1974. 스도쿠 검증
# 난이도 : D2

T = int(input())

for test_case in range(1,T+1):
    sudoku = [list(map(int,input().split())) for _ in range(9)] # 스도쿠 입력 받기

    # 가로, 세로, 3x3안의 값
    flag_width = False
    flag_length = False
    flag_3x3 = False

    # 들어가야 하는 수
    num_list = [1,2,3,4,5,6,7,8,9]

    # 가로일 경우를 구해보자.
    for row in sudoku:
        temp_row = sorted(row)
        if num_list == temp_row:
            flag_width = True
        else:
            flag_width = False
            break

    # 세로의 경우를 구해보자.
    for i in range(9):
        temp_list = list()
        for j in range(9):
            temp_list.append(sudoku[j][i])
        temp_list.sort()
        if num_list == temp_list:
            flag_length = True
        else:
            flag_length = False
            break

    # 3 x 3 부분들의 합이 모두 45일 경우
    for i in range(0,9,3):
        for j in range(0,9,3):
            sum = 0
            for k in range(i, i+3):
                for l in range(j, j+3):
                    sum += sudoku[k][l]
            if sum == 45:
                flag_3x3 = True
            else:
                flag_3x3 = False
                break
        if sum != 45:
            break

    # 정답이라면 1 출력, 정답이 아닐시 0 출력
    if flag_width and flag_length and flag_3x3:
        answer = 1
    else:
        answer = 0

    print("#{} {}".format(test_case, answer))