def solution(arr):
    # n x n 정사각형
    row = len(arr[0])
    column = len(arr)
    n = max(row,column)
    # 미리 n x n에 0으로 차있는 정사각형 생성
    answer = [[0]*n for _ in range(n)]
    
    for i in range(column):
        for j in range(row):
            answer[i][j] = arr[i][j]
            
    return answer