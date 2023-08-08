n = int(input())

for i in range(n):
    index, word = input().split()

    for j in word:
        print(j*int(index), end='')
    print()