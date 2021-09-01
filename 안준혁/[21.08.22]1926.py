import sys
input = sys.stdin.readline

n, m = map(int, input().split())

paper = []

for _ in range(n):
    paper.append(list(map(int, input().split())))

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]
answer = [0]

for i in range(m):
    for j in range(n):
        if paper[j][i]:
            count = 1
            q = [[j, i]]
            paper[j][i] = 0
            while q:
                y, x = q.pop()
                for k in range(4):
                    nx = x + dx[k]
                    ny = y + dy[k]
                    if 0 <= nx < m and 0 <= ny < n and paper[ny][nx]:
                        paper[ny][nx] = 0
                        count += 1
                        q.append([ny, nx])
            answer.append(count)

print(len(answer) - 1)
print(max(answer))