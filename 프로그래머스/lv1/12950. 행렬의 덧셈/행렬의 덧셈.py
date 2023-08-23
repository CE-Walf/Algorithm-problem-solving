def solution(arr1, arr2):
    answer = []
    
    for i in range(len(arr1)): #0,1
        temp_list = list()
        for j in range(len(arr1[i])): # 0, 
            temp_list.append(arr1[i][j] + arr2[i][j])
        answer.append(temp_list)
        
    return answer