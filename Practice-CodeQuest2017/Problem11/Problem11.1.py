# Howard: 

lowers = "abcdefghijklmnopqrstuvwxyz"
uppers = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

def reverse(word):
    n = len(word)
    non_letter_map = []
    for i in range(0, n - 1):
        c = word[i]
        # print("c: " + c + " | " + str(letters.find(c)))
        if( letters.find(c) < 0):
            non_letter_map.append(1)
        else:
            non_letter_map.append(0)

    upper_case_map = []
    for i in range(0, n - 1):
        c = word[i]
        # print("c: " + c + " | " + str(uppers.find(c)))
        if( uppers.find(c) > -1):
            upper_case_map.append(1)
        else:
            upper_case_map.append(0)

    for i in range(0, n - 1):
        print(non_letter_map[i], end='')
    print()

    for i in range(0, n - 1):
        print(upper_case_map[i], end='')
    print()

    for i in range(0, n - 1):
        c = word[n-i-1]
        print (c, end='')
    print()

    for i in range(0, n - 1):
        c = word[i]
        print (c, end='')
        new_word = [i]
    print()


lines = list(open('Prob11.in.txt'))

n = int(lines[0])
print (n)

n = 1
for i in range(1, n + 1):
    l = lines[i]

    new_line = []
    words = l.split()
    for j in range(0, len(words) - 1):
        print (words[j])
        new_word = reverse(words[j])
        new_line.append(new_word)

    print ( l)
    print ( new_line)
    # print ( "i: ", i, " | ", l)

