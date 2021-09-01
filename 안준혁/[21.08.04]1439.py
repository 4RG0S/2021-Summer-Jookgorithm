S = input()

past = ""
zero = 0
one = 0
for alphabet in S:
    if len(past) == 0:
        past = alphabet
    else:
        if alphabet != past:
            if past == "0":
                zero += 1
            else:
                one += 1
            past = alphabet

if past == "0":
    zero += 1
else:
    one += 1

if zero < one:
    print(zero)
else:
    print(one)
