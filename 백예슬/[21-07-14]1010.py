
import math
num=int(input())


for _ in range(num):
    a,b=map(int,input().split())
    result=math.factorial(b)//(math.factorial(a)*math.factorial(b-a))
    print(result)

