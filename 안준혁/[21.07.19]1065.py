n = int(input())

count = 0

for i in range(1, n+1):
    if i < 100:
        count += 1
    elif 100 < i < 1000:
        first = i % 10
        second = int(i / 10) % 10
        third = int(i / 100)
        comp1 = first - second
        comp2 = second - third
        if comp1 == comp2:
            count += 1

print(count)