# 1213. [S/W 문제해결 기본] 3일차 - String
# 난이도 : D3

for _ in range(10):
    T = int(input())
    search = input()
    sentence = input()

    answer = sentence.count(search)

    print("#{} {}".format(T, answer))
