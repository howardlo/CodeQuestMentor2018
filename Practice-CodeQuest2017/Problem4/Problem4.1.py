# Howard: 6.5 min

def fibonacci(a, b, iterations, max_iterations):
    # print ("\ta:", a, " | b: ", b)
    if( iterations + 1 > max_iterations): return a;
    return fibonacci(b, a + b, iterations + 1, max_iterations)

lines = list(open('Prob04.in.txt'))

n = int(lines[0])
# print (n)

for i in range(1, n + 1):
    iterations = int(lines[i])
    f = fibonacci(0, 1, 1, iterations)
    print ( "fibonacci: ", iterations, " | ", f)

