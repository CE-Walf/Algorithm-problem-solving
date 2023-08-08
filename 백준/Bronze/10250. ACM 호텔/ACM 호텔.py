N = int(input())

for i in range(N):
    H, W, N = map(int, input().split())
    
    count = 0
    for i in range(1, W+1):
        for j in range(1, H+1):
            count += 1
            if count == N:
                if i < 10:
                    print(str(j) + '0' + str(i))
                else:
                    print(str(j) + str(i))
                break