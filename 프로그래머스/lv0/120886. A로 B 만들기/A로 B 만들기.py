def solution(before, after):
    sorted_before = sorted(before)
    sorted_after = sorted(after)
    
    if sorted_before == sorted_after:
        return 1
    else:
        return 0