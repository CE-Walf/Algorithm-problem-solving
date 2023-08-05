def solution(my_string):
    answer = 0
    val_int = ''

    for i in my_string:
        if i.isdigit():
            val_int += i
        else:
            if val_int == '':
                continue
            else:
                answer += int(val_int)
                val_int = ''
                
    if val_int != '':
        answer += int(val_int)
    
    return answer