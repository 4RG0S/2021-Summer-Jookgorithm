n = int(input())

q = []

for _ in range(n):
    now = int(input())
    if now == 0:
        q.pop()
    else:
        q.append(now)

print(sum(q))