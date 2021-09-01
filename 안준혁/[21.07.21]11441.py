import sys
input = sys.stdin.readline

n, m = map(int, input().split())
numbers = list(map(int, input().split()))
sumNumbers = []
sum = 0

for i in range(n):
    sum += numbers[i]
    sumNumbers.append(sum)

answers = []

for i in range(m):
    a, b = map(int, input().split())
    if a == 1:
        answer = sumNumbers[b-1]
    else:
        answer = sumNumbers[b-1] - sumNumbers[a-2]
    answers.append(answer)

for answer in answers:
    print(answer)