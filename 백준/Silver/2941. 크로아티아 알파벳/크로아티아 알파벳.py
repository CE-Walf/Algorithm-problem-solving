W = input()

croatia_list = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

for croatia_alpha in croatia_list:
  W = W.replace(croatia_alpha, "_")
  
print(len(W))

