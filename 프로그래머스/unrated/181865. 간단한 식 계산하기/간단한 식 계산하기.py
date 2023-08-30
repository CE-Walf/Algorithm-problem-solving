def solution(binomial):

    if '+'in binomial:
        temp_question = binomial.split('+')
        answer = int(temp_question[0]) + int(temp_question[1])
    elif '-' in binomial:
        temp_question = binomial.split('-')
        answer = int(temp_question[0]) - int(temp_question[1])
    else:
        temp_question = binomial.split('*')
        answer = int(temp_question[0]) * int(temp_question[1])
        
    return answer