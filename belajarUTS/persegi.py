import random

print("N: ")
N = int(input("N: "))

for i in range(1, N + 1):
    for j in range(1, N + 1):
        if (i == 1 or j == 1 or i == N or j == N):
            print(" * ", end="")
        else:
            isi = random.randint(0, 9)
            print("", isi, "", end="")
    print()

