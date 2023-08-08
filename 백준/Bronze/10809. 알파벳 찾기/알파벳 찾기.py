S = list(input())
alpha_list = [-1 for i in range(26)]

for ch in S:
    alpha_list[ord(ch)-ord('a')] = S.index(ch)

for i in alpha_list:
    print(i, end=' ')
