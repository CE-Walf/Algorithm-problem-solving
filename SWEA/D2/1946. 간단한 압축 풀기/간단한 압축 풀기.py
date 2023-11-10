# 1946. 간단한 압축 풀기
# 난이도 : D2

T = int(input())

for test_case in range(1,T+1):
    N = int(input())

    # 전달받아, 문자열 하나로 합치기
    answer = ''
    for i in range(N):
        Ci, Ki = input().split()
        answer += Ci * int(Ki)

    print('#' + str(test_case))
    # 출력
    for j in range(1, len(answer) // 10 + 2):
        print(answer[(j-1)*10:j*10])