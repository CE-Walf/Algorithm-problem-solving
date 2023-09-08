telephone = input()

alpha_list = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
time_count = 0


for alpha in alpha_list:
    for tele in telephone:
      if tele in alpha:
        time_count += alpha_list.index(alpha) + 3

print(time_count)