def solution(arr):
    # 1000 이하의 2의 거듭제곱을 리스트로 만들어준다.
    power2_list = [1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024]
    
    
    #우선 어느 길이를 골라야 한다.
    for i in range(len(power2_list)):
        if power2_list[i] >= len(arr):
            arr_len = power2_list[i]
            break
            
    # 골라낸 길이에서 현재 arr의 길이를 빼서, 그만큼 0을 추가해주도록 한다.
    for i in range(arr_len - len(arr)):
        arr.append(0)    
        
    return arr