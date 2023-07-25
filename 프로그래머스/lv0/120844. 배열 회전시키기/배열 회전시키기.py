def solution(numbers, direction):
    
    #temp_list라는 numbers 리스트의 복사본 생성
    temp_list = list()
    for i in numbers:
        temp_list.append(i)
    
    if direction == "left":
        for i in range(0,len(numbers)):
            numbers[i] = temp_list[(i+1)%len(numbers)]
    elif direction == "right":
        for i in range(0,len(numbers)):
            numbers[i] = temp_list[(i-1)%len(numbers)]
        
    return numbers