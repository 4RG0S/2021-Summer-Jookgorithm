n = int(input())


def gcd(x, y):
    while y > 0:
        rem = x % y
        x = y
        y = rem
    return x


for _ in range(n):
    a, b = map(int, input().split())
    print(int(a * b / gcd(a, b)))
