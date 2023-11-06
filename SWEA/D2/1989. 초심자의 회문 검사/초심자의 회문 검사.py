# 1989. 초심자의 회문 검사
# 난이도 : D2
# 풀었나? X

T = int(input())

for test_case in range(1,T+1):
    sentence = input() # 문장 입력 받기
    reverse_sentence = "" # 뒤집은 문장

    # sentence 뒤집기
    for i in range(len(sentence)-1,-1,-1):
        reverse_sentence += sentence[i]

    # 뒤집은 것과 같으면 1, 다르면 0
    if sentence == reverse_sentence:
        answer = 1
    else:
        answer = 0

    print("#{} {}".format(test_case, answer))

