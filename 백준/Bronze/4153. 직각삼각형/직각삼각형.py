while True:
    side_list = list(map(int,input().split())) # 리스트로 가져오기
    side_list.sort() # 정렬

    # 종료 조건
    if side_list == [0,0,0]:
        break

    # 피타고라스 정리 
    if side_list[-1] ** 2 == side_list[0] ** 2 + side_list[1] ** 2:
        print("right")
    else:
        print("wrong")


