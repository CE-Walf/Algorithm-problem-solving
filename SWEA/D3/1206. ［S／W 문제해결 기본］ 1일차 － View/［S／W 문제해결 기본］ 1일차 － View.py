T = 10

for test_case in range(1, T+1):
    N = int(input())
    Array = list(map(int , input().split()))
    count = 0

    for i in range(2, len(Array)-2):
        temp_list = [Array[i-2], Array[i-1], Array[i+1], Array[i+2]]
        if max(temp_list) < Array[i]:
            count += Array[i] - max(temp_list)
      
    print('#' + str(test_case) + ' ' + str(count))