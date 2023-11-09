# 2029. 몫과 나머지 출력하기
# 난이도 : D1

T = int(input())

for test_case in range(1, T+1):
    a, b = map(int, input().split())

    share = a // b
    remain = a % b

    print("#{} {} {}".format(test_case, share, remain))