def solution(id_pw, db):

    for inf in db:
        if id_pw == inf:
            result = "login"
            break
        elif inf[0] == id_pw[0]:
            result = "wrong pw"
            break
        else:
            result = "fail"
            
    return result