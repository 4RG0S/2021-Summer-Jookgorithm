n=int(input())

dp=[0]*(n+1)
for i in range(0,n+1):
    if i<=1:
        dp[i]=0
        continue
    else:
        dp[i]=dp[i-1]+1
        if i%2==0:
            dp[i]=min(dp[i//2]+1,dp[i])
        if i%3==0:
            dp[i]=min(dp[i//3]+1,dp[i])
        
print(dp[n])

        