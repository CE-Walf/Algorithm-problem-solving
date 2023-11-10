# 1940. 가랏! RC카!
# 난이도 : D2

T = int(input())

for test_case in range(1, T+1):
    N = int(input()) # Command 수, 그리고 초
    
    dist = 0 # N초동안 움직인 거리
    speed = 0 # 속도
    
    for i in range(N):
        command = list(map(int, input().split()))

        if command[0] == 1:
            speed += command[1]
        elif command[0] == 2:
            if speed - command[1] < 0:
                speed = 0
            else:
                speed -= command[1]

        dist += speed

    print("#{} {}".format(test_case, dist))