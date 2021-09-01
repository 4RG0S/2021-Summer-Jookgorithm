n = int(input())
a = input()
list1 = a.split(' ')
for i in range(0,n):
    list1[i] = int(list1[i])
num = 0
count = 0
for i in range(0,n):
    for j in range(1,list1[i]+1):
        if list1[i]%j==0:
            num+=1
    if num == 2:
        count+=1
    num =0
print(count)