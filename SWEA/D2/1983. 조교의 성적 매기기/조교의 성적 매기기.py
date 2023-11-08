# 1983. 조교의 성적 매기기
# 난이도 : D2
# 한번 더 코드 살펴보기

# 중요한 제약 사항 : K번째 학생의 총점과 다른 학생의 총점이 동일한 경우는 입력으로 주어지지 않는다.
T = int(input())

# 학점 리스트
grade_list = ['A+', 'A0', 'A-', 'B+', 'B0', 'B-', 'C+', 'C0', 'C-', 'C0', 'D0']

for test_case in range(1, T+1):
    N, K = map(int, input().split()) # N : 학생수, K : 알고 싶은 학생의 성적
    score_list = list() # 점수를 담을 리스트 설정

    # 점수들 입력받고, 총점 산정하기.
    for i in range(N):
        mid_term, final_exam, assignment = map(int,input().split())
        score_list.append(mid_term * 35 + final_exam * 45 + assignment * 20) # 총점을 리스트에 담아준다.

    # K번째 학생의 총점을 가져온다.
    K_score = score_list[K-1]

    # 내림차순으로 score_list를 정렬해준다.
    score_list.sort(reverse=True)

    # K_score이 몇번째 위치에 있는지 구해준다. 
    K_index = score_list.index(K_score) // (N // 10)

    # 학점 구하기
    grade = grade_list[K_index]

    print("#{} {}".format(test_case, grade))



