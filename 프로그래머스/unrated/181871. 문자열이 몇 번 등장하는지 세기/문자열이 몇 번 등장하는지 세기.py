def solution(myString, pat):
    start = 0
    count = 0 
    
    while True:
        temp_start = myString.find(pat,start)
        # find는 찾는 항목이 없을경우 -1 반환
        if temp_start == -1:
            break
            
        count += 1
        start = temp_start + 1 # 다음번의 pat와 맞는 index find
        
    return count