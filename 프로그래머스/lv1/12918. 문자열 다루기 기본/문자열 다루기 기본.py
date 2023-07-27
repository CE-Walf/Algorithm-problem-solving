def solution(s):
    
    if len(s) == 4 or len(s) == 6:
        try:
            int(s)
        except:
            return False
        
        return True
    else:
        return False
        