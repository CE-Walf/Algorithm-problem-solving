# 2050. 알파벳을 숫자로 변환
# 난이도 : D1

alpha_list = list(input())
num_list = list()

# 대문자가 입력된다고 생각하자.
for alphabet in alpha_list:
    num_list.append(ord(alphabet) - ord('A') + 1)

# 출력
for num in num_list:
    print(num, end=' ')