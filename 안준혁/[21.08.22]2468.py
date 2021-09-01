import sys
input = sys.stdin.readline

n = int(input())

area = []

lowest = 101
highest = 0

for _ in range(n):
    temp = list(map(int, input().split()))
    if min(temp) < lowest:
        lowest = min(temp)
    if max(temp) > highest:
        highest = max(temp)
    area.append(temp)

answer = 1
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]

for height in range(lowest, highest):
    notVisit = [[1] * n for _ in range(n)]
    count = 0
    for i in range(n):
        for j in range(n):
            if area[j][i] > height and notVisit[j][i]:
                q = [[j, i]]
                notVisit[j][i] = 0
                count += 1
                while q:
                    y, x = q.pop()
                    for k in range(4):
                        nx = x + dx[k]
                        ny = y + dy[k]
                        if 0 <= nx < n and 0 <= ny < n and notVisit[ny][nx] and area[ny][nx] > height:
                            notVisit[ny][nx] = 0
                            q.append([ny, nx])
    if count > answer:
        answer = count

print(answer)
