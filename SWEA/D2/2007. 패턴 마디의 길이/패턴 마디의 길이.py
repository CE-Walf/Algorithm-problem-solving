# 2007. 패턴 마디의 길이
# 난이도 : D2

T = int(input())

for test_case in range(1,T+1):
    string_input = input() #문자열 입력받기

    # 마디의 최대 길이는 10
    # i를 0부터 시작할때는 빈 문자열 = 빈 문자열로 진행되게 되어, i는 1부터 시작
    for i in range(1,11):
        if string_input[:i] == string_input[i:2*i]:
            answer = len(string_input[:i])
            break

    print("#{} {}".format(test_case, answer))