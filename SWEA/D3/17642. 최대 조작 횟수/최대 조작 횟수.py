T = int(input())

for test_case in range(1, T + 1):
    a, b = map(int, input().split())

    gap = b - a
    
    if gap == 1:
      answer = -1
    elif gap <= -1:
    	answer = -1
    else:
      answer = gap // 2
        
    print('#' + str(test_case) + " " + str(answer))