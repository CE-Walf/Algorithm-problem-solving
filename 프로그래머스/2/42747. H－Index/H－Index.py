def solution(citations):
    answer = 0
    
    citations.sort() # 정렬
    
    for h_index in range(0, len(citations)+1):
        more_count = 0
        below_count = 0
        
        for element in citations:
            if h_index <= element:
                more_count += 1
            elif h_index >= element:
                below_count += 1
                
        if h_index <= more_count and h_index >= below_count:
            answer = h_index
            
    return answer