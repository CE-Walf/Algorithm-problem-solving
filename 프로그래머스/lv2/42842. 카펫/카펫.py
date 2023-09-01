def solution(brown, yellow):
    answer = []
    
    # 2 * (yellow_x + yellow_y) = n (brown에서 꼭짓점 제거)
    n = (brown - 4) // 2
    
    
    for i in range(1,n):
        yellow_x = n-i # 가로가 더 기므로,
        yellow_y = i
        
        if yellow_x * yellow_y == yellow:
            answer.append(yellow_x+2)
            answer.append(yellow_y+2)
            break
    
    return answer