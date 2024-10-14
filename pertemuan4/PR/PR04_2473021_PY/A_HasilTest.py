"""
Pertemuan 04
[PRAKTIKUM] program yang dapat memeriksa kebenaran input data dari nilai test

@author 2473021-Febrianus Leona Putra
@version 14 Oktober 2024

"""
import random

min1 = int(input("Masukkan nilai minimal test 1: "))
max1 = int(input("Masukkan nilai maksimal test 1: "))
min2 = int(input("Masukkan nilai minimal test 2: "))
max2 = int(input("Masukkan nilai maksimal test 2: "))
print("===============================\n")

hasil1 = hasil2 = hasil3 = hasil4 = hasil5 = 0
status1 = status2 = status3 = status4 = status5 = ""

test1 = random.randint(1, 3)
nilai1 = int(input("Masukkan nilai untuk Test",test1,": "))
if test1 == 1:
    if min1 <= nilai1 <= max1:
        hasil1 = max1 - nilai1
        status1 = "result is",hasil1,"from maximum value"
    else:
        status1 = "result invalid"
elif test1 == 2:
    if min2 <= nilai1 <= max2:
        hasil1 = max2 - nilai1
        status1 = "result is",hasil1,"from maximum value"
    else:
        status1 = "result invalid"
else:
    status1 = "not test 1 or 2"

test2 = random.randint(1, 3)
nilai2 = int(input("Masukkan nilai untuk Test",test2,": "))
if test2 == 1:
    if min1 <= nilai2 <= max1:
        hasil2 = max1 - nilai2
        status2 = "result is",hasil2,"from maximum value"
    else:
        status2 = "result invalid"
elif test2 == 2:
    if min2 <= nilai2 <= max2:
        hasil2 = max2 - nilai2
        status2 = "result is",hasil2,"from maximum value"
    else:
        status2 = "result invalid"
else:
    status2 = "not test 1 or 2"

test3 = random.randint(1, 3)
nilai3 = int(input("Masukkan nilai untuk Test",test3,": "))
if test3 == 1:
    if min1 <= nilai3 <= max1:
        hasil3 = max1 - nilai3
        status3 = "result is",hasil3,"from maximum value"
    else:
        status3 = "result invalid"
elif test3 == 2:
    if min2 <= nilai3 <= max2:
        hasil3 = max2 - nilai3
        status3 = "result is",hasil3,"from maximum value"
    else:
        status3 = "result invalid"
else:
    status3 = "not test 1 or 2"

test4 = random.randint(1, 3)
nilai4 = int(input("Masukkan nilai untuk Test",test4,": "))
if test4 == 1:
    if min1 <= nilai4 <= max1:
        hasil4 = max1 - nilai4
        status4 = "result is",hasil4,"from maximum value"
    else:
        status4 = "result invalid"
elif test4 == 2:
    if min2 <= nilai4 <= max2:
        hasil4 = max2 - nilai4
        status4 = "result is",hasil4,"from maximum value"
    else:
        status4 = "result invalid"
else:
    status4 = "not test 1 or 2"

test5 = random.randint(1, 3)
nilai5 = int(input(f"Masukkan nilai untuk Test {test5}: "))
if test5 == 1:
    if min1 <= nilai5 <= max1:
        hasil5 = max1 - nilai5
        status5 = f"result is {hasil5} from maximum value"
    else:
        status5 = "result invalid"
elif test5 == 2:
    if min2 <= nilai5 <= max2:
        hasil5 = max2 - nilai5
        status5 = f"result is {hasil5} from maximum value"
    else:
        status5 = "result invalid"
else:
    status5 = "not test 1 or 2"

print("===============================\n")
print("========= Hasil Test ==========")
print("Test    || Result       || Test Status")
print(f"{test1}       || {nilai1}            || {status1}")
print(f"{test2}       || {nilai2}            || {status2}")
print(f"{test3}       || {nilai3}            || {status3}")
print(f"{test4}       || {nilai4}            || {status4}")
print(f"{test5}       || {nilai5}            || {status5}")
