def solution(numbers):
    number_list = [str(num) for num in numbers]
    number_list.sort(key=lambda x : x*3, reverse=True)
    answer = str(int(''.join(number_list)))
    return answer