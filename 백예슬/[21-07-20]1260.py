n, m, start_node = map(int,input().split())
graph={}

for i in range(n):
    graph[i+1]=list()

for _ in range(m):
    V1, V2=map(int,input().split())
    graph[V1].append(V2)
    graph[V2].append(V1)



def bfs(graph,start_node):
    visit=list()
    queue=list()

    queue.append(start_node)
    while queue:
        node = queue.pop(0)
        if node not in visit:
            visit.append(node)
            list1=sorted(graph[node])
            queue.extend(list1)
    return visit

def dfs(graph,start_node):
    visit=list()
    stack=list()
    
    
    stack.append(start_node)

    while stack:
        node=stack.pop()
        if node not in visit:
            visit.append(node)
            list1=sorted(graph[node],reverse=True)       
            stack.extend(list1)
    return visit

print(' '.join(map(str, dfs(graph,start_node))))
print(" ".join(map(str, bfs(graph,start_node))))











