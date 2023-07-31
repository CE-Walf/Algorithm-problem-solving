def solution(num_list, n):
    answer = []
    
    ans = []
    for i in num_list:
        ans.append(i)
        if len(ans) == n:
            answer.append(ans)
            ans =[]
        
    
        
    return answer