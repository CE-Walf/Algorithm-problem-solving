x, y, w, h = map(int, input().split())

# w, h말고 고려해야할 것 => 직사각형의 변에는 x축, y축이 존재
print(min(x, y, w-x, h-y))