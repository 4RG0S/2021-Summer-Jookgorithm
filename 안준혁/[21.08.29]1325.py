from collections import deque
import sys
input = sys.stdin.readline

n, m = map(int, input().split())

computers = [[] for _ in range(n+1)]

for _ in range(m):
    a, b = map(int, input().split())
    computers[b].append(a)

hacking = [0] * (n+1)

for i in range(1, n+1):
    count = 1
    visit = [0] * (n+1)
    q = deque()
    q.append(i)
    visit[i] = 1
    while q:
        now = q.pop()
        for computer in computers[now]:
            if not visit[computer]:
                count += 1
                visit[computer] = 1
                q.append(computer)
    hacking[i] = count

maxHack = max(hacking)

for i in range(1, n+1):
    if hacking[i] == maxHack:
        print(i, end=" ")
