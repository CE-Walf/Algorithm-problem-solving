score_dict = {
  'A+': 4.5,
  'A0': 4.0,
  'B+': 3.5,
  'B0': 3.0,
  'C+': 2.5,
  'C0': 2.0,
  'D+': 1.5,
  'D0': 1.0,
  'F' : 0.0
}

grade_sum = 0
score_sum = 0

for i in range(20):
  grade_inf = input().split()
  grade = grade_inf[1]
  score = grade_inf[2]
  
  if score == 'P':
    continue
  
  grade_sum += float(grade)
  score_sum += float(grade) * score_dict[score]
  
total_score = score_sum / grade_sum
print(total_score)
  
  