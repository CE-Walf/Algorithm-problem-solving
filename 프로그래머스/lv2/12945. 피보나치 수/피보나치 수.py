def solution(n):
    Fibonacchi_list = list()
    Fibonacchi_list.append(0)
    Fibonacchi_list.append(1)
    
    for i in range(2, n):
        Fibonacchi_list.append(Fibonacchi_list[i-2] + Fibonacchi_list[i-1])
        
    answer = (Fibonacchi_list[-1] + Fibonacchi_list[-2]) % 1234567
        
    return answer