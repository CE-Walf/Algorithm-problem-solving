def solution(intStrs, k, s, l):
    answer = []
    
    for Strs in intStrs:
        i = int(Strs[s:s+l])
        if k < i:
            answer.append(i)
        
    return answer