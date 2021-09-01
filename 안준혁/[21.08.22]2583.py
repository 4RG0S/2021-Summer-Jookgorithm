import sys
input = sys.stdin.readline

M, N, K = map(int, input().split())

paper = [[1] * M for _ in range(N)]

for _ in range(K):
    x1, y1, x2, y2 = map(int, input().split())
    for i in range(x1, x2):
        for j in range(y1, y2):
            paper[i][j] = 0

size = 0
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]
answer = []

for i in range(M):
    for j in range(N):
        if paper[j][i]:
            count = 1
            q = [[j, i]]
            paper[j][i] = 0
            while q:
                y, x = q.pop()
                for k in range(4):
                    nx = x + dx[k]
                    ny = y + dy[k]
                    if 0 <= nx < M and 0 <= ny < N and paper[ny][nx]:
                        paper[ny][nx] = 0
                        count += 1
                        q.append([ny, nx])
            answer.append(count)

print(len(answer))
answer.sort()

for num in answer:
    print(num, end=' ')