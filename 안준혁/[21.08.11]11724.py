import sys
input = sys.stdin.readline
n, m = map(int, input().split())

graph = [[] for _ in range(n)]

for _ in range(m):
    u, v = map(int, input().split())
    graph[u-1].append(v-1)
    graph[v-1].append(u-1)

node = []
for i in range(n):
    node.append(i)

q = []
count = 0

while(node):
    count += 1
    q.append(node[0])
    while q:
        now = q.pop()
        node.remove(now)
        while graph[now]:
            next = graph[now].pop()
            graph[next].remove(now)
            if next in node and next not in q:
                q.append(next)

print(count)