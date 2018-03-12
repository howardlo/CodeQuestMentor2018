# Howard: 25 min

def fibonacci(iterations):
    left = 0
    right = 1
    new_right = 0
    for i in range(iterations - 1):
        # print ("\tleft:", left, " | right: ", right)
        new_right = left + right
        left = right
        right = new_right
    return left

lines = list(open('Prob04.in.txt'))

n = int(lines[0])
# print (n)

for i in range(1, n + 1):
    iterations = int(lines[i])
    f = fibonacci(iterations)
    print ( "fibonacci: ", iterations, " | ", f)

