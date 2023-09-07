A, B = input().split()

A_list = list(A)
B_list = list(B)
A_list.reverse()
B_list.reverse()

Sangsu_A = int(''.join(A_list))
Sangsu_B = int(''.join(B_list))

if Sangsu_A > Sangsu_B:
  print(Sangsu_A)
else:
  print(Sangsu_B)