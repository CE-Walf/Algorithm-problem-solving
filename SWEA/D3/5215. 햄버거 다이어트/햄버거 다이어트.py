# 5215. 햄버거 다이어트
# 난이도 : D3

def DFS(i, total_tasteScore, total_kcal):
    global max_score

    # 제한 칼로리보다 총 칼로리가 초과라면, 반환해 준다.
    if total_kcal > L:
        return

    if total_tasteScore > max_score:
        max_score = total_tasteScore

    # i가 N이라면, 반환해준다.
    if i == N:
        return

    tasteScore, kcal = ingredients_data[i]

    DFS(i + 1, total_tasteScore + tasteScore, total_kcal + kcal)
    DFS(i + 1, total_tasteScore, total_kcal)

T = int(input())

for test_case in range(1,T+1):
    N, L = map(int,input().split()) # 재료의 갯수, 제한 칼로리

    # 재료의 맛에 대한 점수와 칼로리를 저장할 변수
    ingredients_data = [list(map(int,input().split())) for _ in range(N)]

    # 가장 높은 점수
    max_score = 0

    # DFS 
    DFS(0,0,0)

    print("#{} {}".format(test_case, max_score))