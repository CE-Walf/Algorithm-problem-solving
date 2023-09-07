x_list = list()
y_list = list()

for i in range(3):
    x, y = map(int, input().split())
    x_list.append(x)
    y_list.append(y)

for i in x_list:
    if x_list.count(i) == 1:
        answer_x = i

for i in y_list:
    if y_list.count(i) == 1:
        answer_y = i

print(answer_x, answer_y)