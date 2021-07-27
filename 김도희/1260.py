#DFS, BFS (1)
from sys import stdin
n, m, v = map(int, stdin.readline().split())
graph = [[0] * (n+1) for _ in range(n+1)]
for _ in range(m):
    line = list(map(int, stdin.readline().split()))
    graph[line[0]][line[1]] = 1
    graph[line[1]][line[0]] = 1

#use queue_재귀 안됨
def bfs(root):
    #root를 넣어주고 시작
    visited = [root]
    queue = [root]
    while queue:
        n = queue.pop(0)
        for i in range(len(graph[root])):
            if graph[n][i] == 1 and (i not in visited):
                #인접한 것이 있고, 그중에 방문되지 않았을 경우
                visited.append(i)
                queue.append(i)
    return visited

#use stack_재귀 가능
def dfs(root, visited):
    #root를 넣어주고 시작
    visited += [root]
    for i in range(len(graph[root])):
        if graph[root][i] == 1 and (i not in visited):
            #인접한 것이 있고, 그중에 방문되지 않았을 경우
            dfs(i, visited)
    return visited

print(*dfs(v,[]))
print(*bfs(v))