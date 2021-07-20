def makepal(s2):
    result=""
    s3=s2[:]
    

    for i in range(len(s2)):
        if s2[i]!=0:
            for j in range(int(s2[i]/2)):  
                result+=chr(i+65)
                s2[i]=s2[i]-1
                continue
   
    for i in range(len(s2)):
        
        if s3[i]%2==1:
           
            result+=chr(i+65)
            s2[i]=s2[i]-1
           
    for i in range(len(s2)-1,-1,-1):
        while True:
            if s2[i]==0:
                break
            else:
                result+=chr(i+65)
                s2[i]=s2[i]-1
                continue
    return result   



def pal(s1):
    c1=[0]*26

    for i in range(len(s1)):
        pos=ord(s1[i])-ord('A')
        c1[pos]=c1[pos]+1
    
    odd = len(list((filter(lambda x : x%2 == 1, c1))))
    
    if odd<=1 and len(s1)>=1:
        return makepal(c1)
    else:
        return "I'm Sorry Hansoo"
   
name=input()
print(pal(name))


