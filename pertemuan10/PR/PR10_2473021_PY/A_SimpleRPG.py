"""
Pertemuan 10
[PR]  program simple RPG

@author 2473021-Febrianus Leona Putra
@version 02 Desember 2024

"""
import random

subjek = [
    ["Pahlawan", 100],
    ["Monster", 90]
]
damage_pahlawan = []
damage_monster = []

while subjek[0][1] > 0 and subjek[1][1] > 0:
    
    damage = random.randint(5, 24)
    while damage in damage_pahlawan:
        damage = random.randint(5, 24)
    damage_pahlawan.append(damage)
    subjek[1][1] -= damage
    print(f"{subjek[0][0]} menyerang {subjek[1][0]} dan menyebabkan {damage} damage.")
    print(f"HP {subjek[0][0]}: {subjek[0][1]}")
    print(f"HP {subjek[1][0]}: {max(0, subjek[1][1])}\n")    
    
    if subjek[1][1] <= 0:
        break
    
    damage = random.randint(5, 24)
    while damage in damage_monster:
        damage = random.randint(5, 24)
    damage_monster.append(damage)
    subjek[0][1] -= damage
    print(f"{subjek[1][0]} menyerang {subjek[0][0]} dan menyebabkan {damage} damage.")
    print(f"HP {subjek[0][0]}: {max(0, subjek[0][1])}")
    print(f"HP {subjek[1][0]}: {subjek[1][1]}\n")

if subjek[0][1] > 0:
    print("Pahlawan menang!")
else:
    print("Pahlawan kalah!")
