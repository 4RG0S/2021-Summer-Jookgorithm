from collections import deque

dx = [1, 1, 2, 2, -1, -1, -2, -2]
dy = [2, -2, 1, -1, 2, -2, 1, -1]

n = int(input())
counts = []

for _ in range(n):
    m = int(input())
    startX, startY = map(int, input().split())
    endX, endY = map(int, input().split())
    if startX == endX and startY == endY:
        counts.append(0)
    else:
        q = deque()
        q.append([startX, startY, 0])
        visit = [[0] * m for _ in range(m)]
        visit[startX][startY] = 1
        while q:
            nowX, nowY, nowCount = q.popleft()
            for i in range(8):
                nextX = nowX + dx[i]
                nextY = nowY + dy[i]
                if 0 <= nextX < m and 0 <= nextY < m:
                    if not visit[nextX][nextY]:
                        if nextX == endX and nextY == endY:
                            counts.append(nowCount+1)
                            q = deque()
                            break
                        visit[nextX][nextY] = 1
                        q.append([nextX, nextY, nowCount+1])

for count in counts:
    print(count)