string = list(map(int, input().split()))

asc_list = sorted(string)
desc_list = sorted(string,reverse=True)

if string == asc_list:
    print("ascending")
elif string == desc_list:
    print("descending")
else:
    print("mixed")