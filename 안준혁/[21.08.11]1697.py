from collections import deque

n, k = map(int, input().split())

count = 0
q = deque()
q.append([n, count])
past = [-1]

if n == k:
    print(0)

while n != k:
    n, count = q.popleft()
    if n - 1 == k or n + 1 == k or 2 * n == k:
        print(count + 1)
        break
    if (n - 1) not in past:
        past.append(n - 1)
        q.append([n - 1, count + 1])
    if n < k:
        if (n + 1) not in past:
            past.append(n + 1)
            q.append([n + 1, count + 1])
    if k > n:
        if (2 * n) not in past:
            past.append(2 * n)
            q.append([2 * n, count + 1])