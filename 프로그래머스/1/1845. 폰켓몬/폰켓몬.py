def solution(nums):
    n = len(nums) # 폰켓몬의 갯수
    choose = len(nums) // 2 # 고를 수 있는 폰켓몬의 수
    
    len_nums= len(list(set(nums)))
            
    if len_nums <= choose:
        answer = len_nums
    else:
        answer = choose
        
    return answer