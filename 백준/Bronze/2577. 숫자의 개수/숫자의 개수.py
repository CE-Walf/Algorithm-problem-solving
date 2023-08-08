A = int(input())
B = int(input())
C = int(input())

multiply_ABC = str(A*B*C)

for i in range(10):
    print(multiply_ABC.count(str(i)))