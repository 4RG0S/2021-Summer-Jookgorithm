
a,b,c=map(int,input().split())
d=1
e=a%b
for i in range(c-1):
    e=(e*10)%b
    
    
print((e*10)//b)
        


