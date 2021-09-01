import sys
input = sys.stdin.readline

n, q = map(int, input().split())

numbers = list(map(int, input().split()))
numbers.sort()

sums = []
sum = 0

for i in range(n):
    sum += numbers[i]
    sums.append(sum)

answers = []

for i in range(q):
    l, r = map(int, input().split())
    if l == 1:
        answers.append(sums[r - 1])
    else:
        answers.append(sums[r - 1] - sums[l - 2])

for answer in answers:
    print(answer)