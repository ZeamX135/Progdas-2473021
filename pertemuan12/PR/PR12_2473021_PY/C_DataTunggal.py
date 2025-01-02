"""
Pertemuan 12
[PR] Program yang meminta data tunggal berupa array dan dipisahkan dengan menggunakan spasi.

@author 2473021-Febrianus Leona Putra
@version 15 Desember 2024

"""
import math
from collections import Counter
def hitung_statistik(data):
    n = len(data)
    
    mean = sum(data) / n
    
    data_sorted = sorted(data)
    if n % 2 == 0:
        median = (data_sorted[n // 2 - 1] + data_sorted[n // 2]) / 2
    else:
        median = data_sorted[n // 2]
    
    counter = Counter(data)
    max_count = max(counter.values())
    modus = sorted([k for k, v in counter.items() if v == max_count])
    
    data_range = max(data) - min(data)
    
    variance = sum((x - mean) ** 2 for x in data) / n
    
    std_dev = math.sqrt(variance)
    
    return round(mean, 2), round(median, 2), [round(m, 2) for m in modus], round(data_range, 2), round(variance, 2), round(std_dev, 2)
input_data = input("Input bilangan (pisahkan dengan spasi): ")
data = list(map(int, input_data.split()))
mean, median, modus, data_range, variance, std_dev = hitung_statistik(data)
print(f"Mean: {mean:.2f}")
print(f"Median: {median:.2f}")
print(f"Modus (terurut): {modus}")
print(f"Range: {data_range:.2f}")
print(f"Variance: {variance:.2f}")
print(f"Standard deviation: {std_dev:.2f}")
