# 2043. 서랍의 비밀번호
# 난이도 : D1

P, K = map(int, input().split())

# K부터 1씩 증가시켜 확인해본다 하였으므로,
count = P - K + 1

print(count)