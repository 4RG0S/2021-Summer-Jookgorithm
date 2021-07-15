#DFS

from _collections import deque

#입력을 계속 받도록 설계
while True:
    w, h = map(int, input().split())
    #0,0을 입력하면 그만하기
    if w == 0 and h == 0:
        break
    #입력받은 섬을 map 형식 list로 저장한다.
    land = [list(map(int, input().split())) for _ in range(h)]

    #상 우상 우 우하 하 좌하 좌 좌상 (8방향 탐색)
    dx = [-1, -1, 0, 1, 1, 1, 0, -1]
    dy = [0, 1, 1, 1, 0, -1, -1, -1]

    q = deque()
    cnt = 0
    for i in range(h):
        for j in range(w):
            #육지인 곳을 먼저 찾기
            if land[i][j] == 1:
                #visited => 2
                q.append((i,j))
                land[i][j] = 2

                while q:
                    #현재 위치를 꺼내기
                    cx, cy = q.popleft()
                    #8방향 탐색
                    for k in range(8):
                        nx = cx + dx[k]
                        ny = cy + dy[k]
                        #전체 배열 범위 안에 있으면서
                        if 0 <= nx < h and 0 <= ny < w:
                            #육지이면 값을 2로 바꿔주고 q에 삽입
                            if land[nx][ny] == 1:
                                q.append((nx, ny))
                                land[nx][ny] = 2
                else:
                    cnt += 1
    print(cnt)