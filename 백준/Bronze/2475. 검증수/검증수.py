unique_number = input().split()

sum = 0
for i in unique_number:
    sum += int(i) ** 2

print(sum % 10)