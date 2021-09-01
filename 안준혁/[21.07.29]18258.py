import sys
from collections import deque
input = sys.stdin.readline

n = int(input())

q = deque()

out = []

for _ in range(n):
    command = list(input().split())
    if command[0] == "push":
        q.append(command[1])
    elif command[0] == "pop":
        if not len(q):
            out.append(-1)
        else:
            out.append(q.popleft())
    elif command[0] == "size":
        out.append(len(q))
    elif command[0] == "empty":
        if not len(q):
            out.append(1)
        else:
            out.append(0)
    elif command[0] == "front":
        if not len(q):
            out.append(-1)
        else:
            out.append(q[0])
    elif command[0] == "back":
        if not len(q):
            out.append(-1)
        else:
            out.append(q[len(q) - 1])
for o in out:
    print(o)