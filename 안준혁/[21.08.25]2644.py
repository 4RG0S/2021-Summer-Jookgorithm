import sys

n = int(input())

a, b = map(int, input().split())

persons = [[] for _ in range(n + 1)]
visit = [0] * (n + 1)

m = int(input())

for i in range(m):
    x, y = map(int, input().split())
    persons[x].append(y)
    persons[y].append(x)

q = [[a, 0]]

while q:
    now, count = q.pop()
    visit[now] = 1
    for next in persons[now]:
        if next == b:
            print(count + 1)
            sys.exit()
        if visit[next]:
            continue
        q.append([next, count + 1])
print("-1")