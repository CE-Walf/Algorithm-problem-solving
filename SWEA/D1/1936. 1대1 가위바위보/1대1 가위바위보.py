# 1936. 1대1 가위바위보
# 난이도 : D1

A, B = map(int, input().split())

# 가위는 1, 바위는 2, 보는 3, 비기는 경우는 없다.
if (A == 1 and B == 3) or (A == 2 and B == 1) or (A == 3 and B == 2):
    print('A')
else:
    print('B')
