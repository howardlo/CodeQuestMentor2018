# Howard: 25 min

lines = list(open('Prob02.in.txt'))

n = int(lines[0])
# print (n)

for i in range(n):
    s = lines[i+1]
    # print (s, end='')
    (left, right) = s.split(" ")
    m = int(right)
    # print (m, end='')
    arr = list(s)
    for j in range(len(arr)):
        if( j != m):
            print (arr[j], end='')

    print ();
