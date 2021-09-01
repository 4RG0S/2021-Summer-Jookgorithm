import sys
from collections import deque
input = sys.stdin.readline

n = int(input())

count = 0
for _ in range(n):
    word = list(input().strip())
    stack = deque()
    length = len(word)
    if len(word) % 2:
        continue
    else:
        for alphabet in word:
            if len(stack) == 0:
                stack.append(alphabet)
            else:
                temp = stack.pop()
                if alphabet != temp:
                    stack.append(temp)
                    stack.append(alphabet)
        if len(stack) == 0:
            count += 1

print(count)
