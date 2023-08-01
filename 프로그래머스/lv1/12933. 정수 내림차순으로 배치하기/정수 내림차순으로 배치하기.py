def solution(n):
    n_list = list()
    
    for i in str(n):
        n_list.append(i)
    
    n_list.sort(reverse=True)
    
    answer = int(''.join(n_list))
    
    return answer