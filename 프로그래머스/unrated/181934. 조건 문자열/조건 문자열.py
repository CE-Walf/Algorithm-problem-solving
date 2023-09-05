def solution(ineq, eq, n, m):
    answer = 0
    
    # set operator
    operator = ineq + eq
    if eq == "!":
        operator = ineq
        
    # write expression
    expression = str(n) + operator + str(m)
    
    if eval(expression):
        answer = 1
    else:
        answer = 0
        
    return answer