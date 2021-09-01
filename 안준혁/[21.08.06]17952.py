n = int(input())

score = 0
stack = []

nowT = 0
nowA = 0
A = 0
T = 0

for _ in range(n):
    userInput = input()
    if userInput == '0':
        nowT -= 1
    else:
        comp, A, T = map(int, userInput.split())
        if nowT > 0:
            stack.append([nowA, nowT])
        nowA = A
        nowT = T - 1
    if nowT == 0:
        score += nowA
        if len(stack) != 0:
            now = stack.pop()
            nowA = now[0]
            nowT = now[1]

print(score)