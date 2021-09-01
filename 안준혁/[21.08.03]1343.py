board = input()

word = ""

answer = ""

for alphabet in board:
    if alphabet == '.':
        if len(word) != 0:
            length = len(word)
            if length % 2 == 1:
                answer = "-1"
                word = ""
                break
            else:
                a = int(length / 4)
                for _ in range(a):
                    answer += 'AAAA'
                if length % 4 == 2:
                    answer += 'BB'
        answer += '.'
        word = ""
    else:
        word += alphabet

if len(word) != 0:
    length = len(word)
    if length % 2 == 1:
        answer = "-1"
    else:
        a = int(length / 4)
        for _ in range(a):
            answer += 'AAAA'
        if length % 4 == 2:
            answer += 'BB'

print(answer)
