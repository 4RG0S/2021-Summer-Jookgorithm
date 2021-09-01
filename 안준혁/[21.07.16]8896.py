import sys

n = int(input())

answer = []

for _ in range(n):
    numberOfRobot = int(input())
    robots = dict()
    for i in range(numberOfRobot):
        robots[i+1] = sys.stdin.readline().strip()
    for i in range(len(robots[1])):
        rock = False
        scissor = False
        paper = False
        decision = False
        for robot in robots.values():
            if robot[i] == 'R':
                rock = True
                if scissor and paper:
                    break
            elif robot[i] == 'S':
                scissor = True
                if rock and paper:
                    break
            else:
                paper = True
                if rock and scissor:
                    break
        if rock and scissor and paper:
            continue
        remove = []
        if rock and scissor:
            for index in robots:
                if robots[index][i] == 'S':
                    remove.append(index)
        elif scissor and paper:
            for index in robots:
                if robots[index][i] == 'P':
                    remove.append(index)
        elif rock and paper:
            for index in robots:
                if robots[index][i] == 'R':
                    remove.append(index)
        for index in remove:
            del robots[index]
        if len(robots) == 1:
            decision = True
            for p in robots:
                print(p)
            break
    if not decision:
        print(0)
