from collections import deque
import sys
input = sys.stdin.readline

n = int(input())
tree = [[] for _ in range(n)]

notVisit = [1] * n
for _ in range(n - 1):
    u, v = map(int, input().split())
    tree[u - 1].append(v - 1)
    tree[v - 1].append(u - 1)

q = deque()
q.append(0)

answer = [0] * n
while q:
    now = q.popleft()
    nextList = tree[now]
    for next in nextList:
        if notVisit[next]:
            notVisit[next] = 0
            q.append(next)
            answer[next] = now

for i in range(1, n):
    print(answer[i] + 1)