def solution(my_string, queries):
    answer = my_string
    
    # queries 내부의 query를 순회
    for query in queries:
        start = query[0]    # 시작
        end = query[1]  # 끝
        # [::-1]을 써서 문자열을 역순으로 보기 위해 임시변수
        reversed_string = answer[start:end+1] 
        answer = answer[:start] + reversed_string[::-1] + answer[end+1:]
        
    return answer