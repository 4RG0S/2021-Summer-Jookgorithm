
a=int(input())
num=list(map(int,input().split()))
num.sort()
mid= a/2

num2=[]
for j in range(a):
    if abs(j-mid)<=1:
        
        num2.append(num[j])

def minus(s):
    mins=[]
    minus=0
    for i in range(len(s)):
        for j in range(len(s)):
            minus+=abs(s[i]-s[j])
        
        mins.append(minus)
    return mins.index(min(mins))
print(num2[minus(num2)])