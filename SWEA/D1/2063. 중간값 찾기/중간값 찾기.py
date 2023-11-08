# 2063. 중간값 찾기
# 난이도 : D1

N = int(input()) # 점수의 개수
N_list = list(map(int, input().split())) # 점수 입력 받기

N_list.sort() # 정렬

# N은 무조건 홀수이므로
median_index = N // 2

# 중간값
median = N_list[median_index]

print(median)