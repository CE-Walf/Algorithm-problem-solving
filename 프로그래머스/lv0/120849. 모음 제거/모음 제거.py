def solution(my_string):
    
    noun = ['a','e','i','o','u']
    
    for i in noun:
        my_string = my_string.replace(i, '')
        
    return my_string