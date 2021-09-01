row = []
col = [[] for _ in range(5)]
diagonalOne = []
diagonalTwo = []

for i in range(5):
    line = list(map(int, input().split()))
    row.append(line)
    for j in range(5):
        col[j].append(line[j])
        if i == j:
            diagonalOne.append(line[j])
        if i == 4 - j:
            diagonalTwo.append(line[j])

count = 0

colCount = [1] * 5
rowCount = [1] * 5
diagonalCount = [1, 1]

for i in range(5):
    line = list(map(int, input().split()))
    for j in range(5):
        for k in range(5):
            if line[k] in row[j]:
                row[j].remove(line[k])
            if line[k] in col[j]:
                col[j].remove(line[k])
            if line[k] in diagonalOne:
                diagonalOne.remove(line[k])
            if line[k] in diagonalTwo:
                diagonalTwo.remove(line[k])
            if not len(row[j]) and rowCount[j]:
                rowCount[j] = 0
                count += 1
            if not len(col[j]) and colCount[j]:
                colCount[j] = 0
                count += 1
            if diagonalCount[0] and not len(diagonalOne):
                count += 1
                diagonalCount[0] = 0
            if diagonalCount[1] and not len(diagonalTwo):
                count += 1
                diagonalCount[1] = 0
            if count >= 3:
                print(i*5+k+1)
                exit()
