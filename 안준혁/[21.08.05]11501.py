import sys
input = sys.stdin.readline

T = int(input())
moneys = []

for _ in range(T):
    N = int(input())
    stocks = list(map(int, input().split()))
    sell = 0
    money = 0
    count = 0
    while stocks:
        now = stocks.pop()
        if now > sell:
            money += sell * count
            count = 0
            sell = now
        else:
            money -= now
            count += 1
    money += sell * count
    moneys.append(money)

for money in moneys:
    print(money)