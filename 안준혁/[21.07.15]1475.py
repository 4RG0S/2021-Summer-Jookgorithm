n = input()

set = [0]*10

answer = 0

for number in n:
    if set[int(number)] == 0:
        if int(number) == 6:
            if set[9] == 0:
                for i in range(10):
                    set[i] += 1
                answer += 1
                set[int(number)] -= 1
            else:
                set[9] -= 1
        elif int(number) == 9:
            if set[6] == 0:
                for i in range(10):
                    set[i] += 1
                answer += 1
                set[int(number)] -= 1
            else:
                set[6] -= 1
        else:
            for i in range(10):
                set[i] += 1
            answer += 1
            set[int(number)] -= 1
    else:
        set[int(number)] -= 1
print(answer)