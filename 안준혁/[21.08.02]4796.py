import sys
input = sys.stdin.readline
answers = []

while True:
    answer = 0
    L, P, V = map(int, input().split())
    if L == 0 and P == 0 and V == 0:
        break
    answer += L * int(V / P)
    if (V - P * int(V / P)) > L:
        answer += L
    else:
        answer += V - P * int(V / P)
    answers.append(answer)

index = 1

for answer in answers:
    print("Case " + str(index) +": " + str(answer))
    index += 1
