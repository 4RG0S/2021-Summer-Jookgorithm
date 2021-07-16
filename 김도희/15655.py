from itertools import combinations

n, m = map(int, input().split())
nums = list(map(int, input().split()))
#정렬 먼저
nums = sorted(nums)

for i in list(combinations(nums, m)):
    for j in i:
        print(j, end=' ')
    print()