# BFS (너비 우선 탐색)
def solution(numbers, target):
    # 모든 계산 결과값을 담을 변수
    leaves = [0]
    # 총 생성될 수 있는 방법의 수를 담는 변수
    count = 0 
    
    
    for number in numbers:
        temp_list = []
        
        for leaf in leaves:
            temp_list.append(leaf + number) # 더하기 연산
            temp_list.append(leaf - number) # 빼기 연산
        
        leaves = temp_list # 이렇게 최하위 레벨 노드 뽑아내기.
    
    
    # 최하위 레벨의 노드들과, target을 비교해 같은 것만 +1
    for leaf in leaves:
        if leaf == target:
            count += 1

    return count 