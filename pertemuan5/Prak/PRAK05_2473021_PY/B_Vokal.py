"""
Pertemuan 05
[PRAKTIKUM] program yang dapat menghitung jumlah huruf vokal dan tanda spasi dari inputan sebuah kalimat

@author 2473021-Febrianus Leona Putra
@version 15 Oktober 2024

"""
kalimat = input("Masukkan Kalimat : ")

a=0
hi=0
u=0
e=0
o=0
sps=0
for i in range(len(kalimat)):
    if(kalimat[i]=='a' or kalimat[i]=='A'):
        a += 1
    elif(kalimat[i]=='i' or kalimat[i]=='I'):
        hi += 1
    elif(kalimat[i]=='u' or kalimat[i]=='U'):
        u += 1
    elif(kalimat[i]=='e' or kalimat[i]=='E'):
        e += 1
    elif(kalimat[i]=='o' or kalimat[i]=='O'):
        o += 1
    elif(kalimat[i]==' '):
        sps+=1

print("===========================================================")
print("Kalimat : " , kalimat)
print("-----------------------------------------------------------")
print("Huruf Vokal |   a/A\ti/I\tu/U\te/E\to/O\tSps")
print("Jumlah      |    " , a , "\t " , hi , "\t " , u , "\t " , e , "\t " , o , "\t " , sps)