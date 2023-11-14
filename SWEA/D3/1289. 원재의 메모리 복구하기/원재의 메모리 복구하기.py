# 1289. 원재의 메모리 복구하기
# 난이도 : D3

T = int(input())

for test_case in range(1, T+1):
    bit_list = list(input()) # 입력받은 비트 리스트
    N = len(bit_list) # 비트 리스트의 길이
    temp = '0' # 대조할 변수
    count = 0 # 바뀐 횟수를 세는 리스트

    for i in range(N):
        if bit_list[i] != temp:
            temp = bit_list[i]
            count += 1


    print("#{} {}".format(test_case, count))