def solution(s):
    answer = 0
    
    #공백을 기준으로 split하여 분리시킨다.
    s_list = s.split(' ')
    
    # eneumerate로 index와 value를 전달받아, 
    # Z일 경우에는 answer에서 list의 이전 index값을 제거하고
    # Z가 아닐경우에는 answer에 그 element값을 추가한다.
    for index, element in enumerate(s_list):
        if element == 'Z':
            answer -= int(s_list[index-1])
        else:
            answer += int(element)
    
    return answer