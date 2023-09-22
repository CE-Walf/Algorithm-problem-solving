# 각 단어의 짝수번째 알파벳은 대문자로, 
# 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수
def solution(s):
    answer_list = list()
    
    words = s.split(' ')
    for word in words:
        temp = ''
        for i in range(len(word)):
            if i % 2 == 0:
                temp += word[i].upper()
            if i % 2 == 1:
                temp += word[i].lower()    
        answer_list.append(temp)
        
    answer = ' '.join(answer_list)
    
    return answer