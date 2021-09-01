def Main():
    #N: 아이스크림 종류 수
    #M: 섞어 먹으면 안되는 조합 개수
    N, M = map(int, input().split())
    cnt = 0

    if N < 3:
        #입력이 잘못 들어왔을 경우
        print(cnt)
    else:
        #dictionary
        unmixed = {i: [] for i in range(1, N+1)}
        for _ in range(M):
            i, j = map(int, input().split())
            unmixed[i].append(j)
            unmixed[j].append(i)
        for i in range(1, N+1):
            for j in range(i+1, N+1):
                # 해당 숫자가 unmixed에 있으면
                if j in unmixed[i]:
                    continue
                for k in range(j+1, N+1):
                    if k in unmixed[i] or k in unmixed[j]:
                        continue
                    cnt += 1
        return cnt

print(Main())

"""
* 첫 번째 생각
   N, M = input().split()
   no = []
   ice = []
   result = []

   for x in range(int(N)):
       ice.append(x+1)

   #모든 수열 구하기
   result = combinations(ice, 3)

   for x in range(int(M)):
       #이 입력 받은 값이 같이 있는 것을 골라서 없애기
       v1, v2 = input().split()
       for i in range(len(list(result))):
           for index in range(3):
               if list(result)[i][index] == int(v1):
                   #첫 번째 원소와 같다면 두 번째 원소가 있는지 찾기
                   print("#아니 이건 무슨 문제야")

   print(list(result))
   #return len(result)

"""