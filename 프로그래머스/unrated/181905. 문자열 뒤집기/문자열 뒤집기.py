def solution(my_string, s, e):
    answer = ''
    
    first_piece = my_string[:s]
    last_piece = my_string[e+1:]
    piece = my_string[s:e+1]
    
    answer += first_piece
    for i in range(len(piece)-1,-1,-1):
        answer += piece[i]
    answer += last_piece
    
    return answer