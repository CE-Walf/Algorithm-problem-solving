def solution(emergency):
    sorted_emergency = sorted(emergency)
    
    for i in range(len(emergency)):
        for element in sorted_emergency:
            if emergency[i] == element:
                emergency[i] = len(emergency) - sorted_emergency.index(element)
                break
                
    return emergency