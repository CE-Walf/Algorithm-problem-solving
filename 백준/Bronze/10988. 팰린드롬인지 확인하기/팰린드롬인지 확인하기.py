word = input()

# 거꾸로 해도 같은지 확인
if word == word[::-1]:
    print(1)
else:
    print(0)