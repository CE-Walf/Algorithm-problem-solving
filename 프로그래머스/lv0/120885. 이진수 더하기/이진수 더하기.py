def solution(bin1, bin2):
    bin1 = int('0b' + bin1, 2)
    bin2 = int('0b' + bin2, 2)
    
    answer = str(bin(bin1 + bin2))[2:]
    
    return answer