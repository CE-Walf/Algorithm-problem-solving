set_remain = set()

for i in range(10):
    n = int(input())
    set_remain.add(n % 42)

print(len(set_remain))