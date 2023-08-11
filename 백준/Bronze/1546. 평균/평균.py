n = int(input())
score = list(map(int, input().split()))

#최댓값
max_score = max(score)
#과목의 수
subject = len(score)

sum = 0
for i in score:
  sum += i/max_score * 100
  
answer = sum / subject

print(answer)
