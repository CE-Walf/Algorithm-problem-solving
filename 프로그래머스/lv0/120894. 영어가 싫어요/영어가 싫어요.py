def solution(numbers):
    # dict와 replace를 사용하자.
    # 주의 : replace는 문자를 문자로 바꾸지 문자를 정수로 바꾸지 못한다.
    
    num_dict = {
        "zero" : "0",
        "one" : "1",
        "two" : "2",
        "three" : "3",
        "four" : "4",
        "five" : "5",
        "six" : "6",
        "seven" : "7",
        "eight" : "8",
        "nine" : "9",
    }
    
    for num in num_dict:
        if num in numbers:
            numbers = numbers.replace(num, num_dict[num])
    
    numbers = int(numbers)
                             
    return numbers
