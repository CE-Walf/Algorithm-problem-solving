def solution(chicken):
    
    coupon = 0
    answer = 0
    
    while True:
        chicken -= 10
        if chicken < 0:
            break
        chicken += 1
        answer += 1

    return answer