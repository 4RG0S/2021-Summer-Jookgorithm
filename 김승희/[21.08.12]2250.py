class Node:
    def __init__(self, data, left, right):
        self.data = data
        self.left = left
        self.right = right
n = int(input())
tree = {}
parent = [i for i in range(n+1)]

root = 0
for _ in range(n):
    data, left, right = map(int, input().split())
    tree[data] = Node(data, left, right)
    if left != -1:
        parent[left] = parent[data]
    if right != -1:
        parent[right] = parent[data]
min_depth = [n for _ in range(n+1)]
max_depth = [0 for _ in range(n+1)]

for i in range(1, n+1):
    if parent[i] == i:
        root = i

def inorder(node, depth):
    result = []
    global tree_depth, x
    tree_depth = max(tree_depth, depth)
    if node.left != -1:
        result += inorder(tree[node.left], depth + 1)
    result += [(node.data, depth)]
    min_depth[depth] = min(min_depth[depth], x)
    max_depth[depth] = max(max_depth[depth], x)
    x += 1
    if node.right != -1:
        result += inorder(tree[node.right], depth + 1)
    return result
tree_depth = 1
x = 1
inorder_result = inorder(tree[root], 1)

result_depth = tree_depth
result_width = max_depth[tree_depth] - min_depth[tree_depth] + 1

for i in range(tree_depth-1, 0, -1):
    temp = max_depth[i] - min_depth[i] + 1
    if temp >= result_width:
        result_width = temp
        result_depth = i
print(result_depth, result_width)