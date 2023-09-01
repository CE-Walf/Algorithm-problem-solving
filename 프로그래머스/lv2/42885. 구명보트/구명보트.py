def solution(people, limit):
    answer = 0 # VARIABLE TO COUNT BOAT
    
    people.sort() 
    
    people_start = 0
    people_end = len(people)-1
    
    while people_start <= people_end:
        if people[people_start] + people[people_end] > limit:
            people_end -= 1
            answer += 1
        else:
            people_start += 1
            people_end -= 1
            answer += 1
        
    return answer