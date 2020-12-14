def calculator(option, value1, value2):
    return {
        1: value1 + value2,
        2: value1 - value2,
        3: value1 * value2,
        4: value1 / value2
    }.get(option, "Pilihan tidak ditemukan")

# CODE BY YOGI PRASETYAWAN 191110236

print("Pilih salah satu opsi")
print("----------------------")
print("1. Penjumlahan")
print("2. Pengurangan")
print("3. Perkalian")
print("4. Pembagian")
print("")

option = int(input("Pilih opsi : "))
value1 = int(input("Masukkan nilai 1 : "))
value2 = int(input("Masukkan nilai 2 : "))

print("Hasil : ", calculator(option, value1, value2))
