N = int(input())

for i in range(N):
    score = 0
    count = 0
    Quiz_OX = input()

    for OX in Quiz_OX:
        if OX == 'O':
            count += 1
            score += count
        elif OX == 'X':
            count = 0

    print(score)