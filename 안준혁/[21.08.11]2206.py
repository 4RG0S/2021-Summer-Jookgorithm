import sys
input = sys.stdin.readline

n, m = map(int, input().split())

Map = []
for i in range(n):
    str = input()
    temp = []
    for j in range(m):
        temp.append(int(str[j]))
    Map.append(temp)

visit = [[0] * m for _ in range(n)]
print(Map)
print(visit)
q = [[0, 0, 1]]

for i in range(n):
    for j in range(m):
        if Map[i][j] == 1:
            q.append([i, j])

answer = -1

while q:
    y, x, crush = q.pop()
    Map[y][x] = 0
    if answer >0
    Map[y][x] = 1