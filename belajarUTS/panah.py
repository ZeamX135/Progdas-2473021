n = int(input("N= "))

for i in range(1, n + 1):
    for j in range(1, n + 1):
        if(i==n or j==n or i==j):
            print(" * ",end="")
        else:
            print(" | ",end="")
    print()