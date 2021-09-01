
s = input()

stack = []

mul = 0
answer = 0

for i in len(s):
    bracket = s[i]
    if bracket == '(':
        stack.append(bracket)
        if i != 0:
            if s[i - 1] == ')' or s[i - 1] == ']':
                mul = 0
        if len(stack) == 0:
            mul = 0
    elif bracket == '[':
        stack.append(bracket)
        if len(stack) == 0:
            mul = 0
    elif bracket == ']':
        if len(stack) == 0:
            answer = 0
            break
        else:
            now = stack.pop()
            if now != '[':
                answer = 0
                break
            else:
                if mul != 0:
                    mul *= 3
                else:
                    answer += mul
                    mul = 3
    elif bracket == ')':
        if len(stack) == 0:
            answer = 0
            break
        else:
            now = stack.pop()
            if now != '(':
                answer = 0
                break
            else:
                if mul != 0:
                    mul *= 2
                else:
                    answer += mul
                    mul = 2
    print(mul)
answer += mul

print(answer)