def solution(nums):
    n = len(nums) # 폰켓몬의 갯수
    choose = len(nums) // 2 # 고를 수 있는 폰켓몬의 수
    
    hashDict = dict()
    
    for num in nums:
        if hash(num) in hashDict:
            hashDict[hash(num)] += 1 
        else: 
            hashDict[hash(num)] = 1
            
    if len(hashDict) <= choose:
        answer = len(hashDict)
    else:
        answer = choose
        
    return answer