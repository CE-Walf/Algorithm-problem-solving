# 1240. [S/W 문제해결 응용] 1일차 - 단순 2진 암호코드
# 난이도 : D3

# 해독
code_dict = {'0001101' : 0,
             '0011001' : 1,
             '0010011' : 2,
             '0111101' : 3,
             '0100011' : 4,
             '0110001' : 5,
             '0101111' : 6,
             '0111011' : 7,
             '0110111' : 8,
             '0001011' : 9}

T = int(input())

for test_case in range(1,T+1):
    N, M = map(int, input().split()) # 높이 = N, 너비 = M
    pw_list = [list(map(int,input())) for _ in range(N)] # 암호 입력 받기

    # 암호문 위치 찾기
    height = 0
    width = 0

    # 암호 코드의 위치 찾기 (암호 코드 길이 : 7x8 = 56)
    # 모든 암호는 맨 뒤가 1이기에, 뒤부터 탐색
    # 암호문 마지막 행의 암호코드 시작 위치 좌표가 구해질 것
    for i in range(N):
        for j in range(M-1, -1, -1):
            if pw_list[i][j] == 1:
                height = i
                width = j - 56 + 1
                break

    # 암호문 코드
    pw_code = pw_list[height][width:width+56]

    odd_list = list()
    even_list = list()
    for i in range(1,9): # 코드 8개
        temp = code_dict[''.join(map(str,pw_code[(i-1)*7:i*7]))]
        # 짝수일 경우
        if i % 2 == 0:
            even_list.append(temp)
        elif i % 2 == 1:
            odd_list.append(temp)

    # 잘못된 코드인지 아닌지 판별
    if (sum(odd_list) * 3 + sum(even_list)) % 10 == 0:
        answer = sum(odd_list) + sum(even_list)
    else:
        answer = 0 # 잘못 되었을 경우, 0 출력

    print("#{} {}".format(test_case, answer))