while True:
  T = int(input())
  
  if T == -1:
    break
  
  measure_list = list()
  
  for i in range(1,T):
    if T % i == 0:
      measure_list.append(i)
      
  answer = ''    
  if sum(measure_list) == T:
    
    answer += str(T) + " = "
    answer += ' + '.join(map(str,measure_list))
  else:
    answer += str(T)
    answer += " is NOT perfect."
    
  print(answer)