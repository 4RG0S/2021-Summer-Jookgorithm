mat = []
for i in range(5):
    mat.append(list(input().split()))

lst = []

dy = [0, 0, 1, -1]
dx = [1, -1, 0, 0]

def go(y, x, cnt, rst):
    rst += mat[y][x]
    cnt += 1
    if cnt == 6:
        lst.append(rst)
        return
    for i in range(4):
        ny = y + dy[i]
        nx = x + dx[i]
        if 0 <= nx < 5 and 0 <= ny < 5:
            go(ny, nx, cnt, rst)


for i in range(5):
    for j in range(5):
        go(i, j, 0, '')

print(len(set(lst)))