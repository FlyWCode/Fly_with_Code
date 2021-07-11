s1, s2, s3 = input().split(' ')
dict = {}
result = {}
for i in range(81):
    dict[i] = 0
    result[i] = 0
for i in range(1, int(s1)+1):
    for j in range(1, int(s2)+1):
        for k in range(1, int(s3)+1):
            num = i + j + k
            dict[num] += 1

maxKey = 0
maxValue = 0
for i in range(1, 81):
    if dict[i] > maxValue:
        maxValue = dict[i]
        maxKey = i
    elif dict[i] == maxValue:
        if i < maxKey:
            maxKey = i
            maxValue = dict[i]
print(maxKey)

