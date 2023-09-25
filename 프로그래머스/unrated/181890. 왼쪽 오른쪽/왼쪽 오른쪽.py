def solution(str_list):
    answer = []
    leftOrRight = "" # 왼쪽 오른쪽 판별
    stop_index = 0 # 나뉘어지는 분기점
    
    # stop_index 파악, 왼쪽, 오른쪽 파악
    for str_element in str_list:
        if str_element == "l":
            leftOrRight = "left"
            break
        elif str_element == "r":
            leftOrRight = "right"
            break
        stop_index += 1
    
    # 왼쪽일때와, 오른쪽일때
    if leftOrRight == "left":
        for i in range(stop_index):
            answer.append(str_list[i])
    elif leftOrRight == "right":
        for i in range(stop_index + 1,len(str_list)):
            answer.append(str_list[i])
            
    return answer