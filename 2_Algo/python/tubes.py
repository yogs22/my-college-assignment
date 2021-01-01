import csv
import os

csv_filename = 'damages.csv'

def clear_screen():
    os.system('cls' if os.name == 'nt' else 'clear')

def show_menu():
    clear_screen()
    print("=== SISTEM PERAWATAN BANGUNAN HOTEL ===")
    print("[1] Lihat Daftar Perawatan")
    print("[2] Buat Perawatan Baru")
    print("[3] Perawatan Diperbaiki")
    print("[4] Cari Perawatan")
    print("[0] Keluar")
    print("---------------------------------------")
    selected_menu = input("Pilih menu> ")

    if(selected_menu == "1"):
        show_damage()
    elif(selected_menu == "2"):
        create_damage()
    elif(selected_menu == "3"):
        done_damage()
    elif(selected_menu == "4"):
        search_damage()
    elif(selected_menu == "0"):
        exit()
    else:
        print("Kamu memilih menu yang salah!")
        back_to_menu()

def back_to_menu():
    print("\n")
    input("Tekan Enter untuk kembali...")
    show_menu()

def show_damage():
    clear_screen()
    damages = []
    with open(csv_filename) as csv_file:
        csv_reader = csv.reader(csv_file, delimiter=",")
        for row in csv_reader:
            damages.append(row)

    if (len(damages) > 0):
        labels = damages.pop(0)
        print(f"{labels[0]} \t {labels[1]} \t\t {labels[2]} \t\t\t {labels[3]}")
        print("-"*80)
        for data in damages:
            print(f'{data[0]} \t {data[1]} \t {data[2]} \t {data[3]}')
    else:
        print("Tidak ada data!")
    back_to_menu()

def create_damage():
    clear_screen()
    damages = []
    with open(csv_filename) as csv_file:
        csv_reader = csv.reader(csv_file, delimiter=",")
        for row in csv_reader:
            damages.append(row)

    with open(csv_filename, mode='a') as csv_file:
        fieldnames = ['ID', 'HOTEL', 'DESKRIPSI', 'STATUS']
        writer = csv.DictWriter(csv_file, fieldnames=fieldnames)

        hotel = input("Nama Hotel: ")
        description = input("Deskripsi Perawatan: ")

        writer.writerow({'ID': len(damages), 'HOTEL': hotel, 'DESKRIPSI': description, 'STATUS': 'Rusak'})
        print("Berhasil disimpan!")

    back_to_menu()

def search_damage():
    clear_screen()
    damages = []

    with open(csv_filename, mode="r") as csv_file:
        csv_reader = csv.DictReader(csv_file)
        for row in csv_reader:
            damages.append(row)

    no = input("Cari berdasrakan ID> ")

    data_found = []

    # mencari damage
    indeks = 0
    for data in damages:
        if (data['ID'] == no):
            data_found = damages[indeks]

        indeks = indeks + 1

    if len(data_found) > 0:
        print("DATA DITEMUKAN: ")
        print(f"Hotel: {data_found['HOTEL']}")
        print(f"Deskripsi: {data_found['DESKRIPSI']}")
        print(f"Status: {data_found['STATUS']}")
    else:
        print("Tidak ada data ditemukan")
    back_to_menu()

def done_damage():
    clear_screen()
    damages = []

    with open(csv_filename, mode="r") as csv_file:
        csv_reader = csv.DictReader(csv_file)
        for row in csv_reader:
            damages.append(row)

    print("ID \t HOTEL \t\t DESKRIPSI \t\t\t STATUS")
    print("-" * 80)

    for data in damages:
        print(f"{data['ID']} \t {data['HOTEL']} \t {data['DESKRIPSI']} \t {data['STATUS']}")

    print("-" * 80)
    no = input("Masukkan ID> ")

    # mencari damage dan mengubah datanya
    # dengan data yang baru
    indeks = 0
    for data in damages:
        if (data['ID'] == no):
        	damages[indeks]['STATUS'] = 'Diperbaiki'
        indeks = indeks + 1

    with open(csv_filename, mode="w") as csv_file:
        fieldnames = ['ID', 'HOTEL', 'DESKRIPSI', 'STATUS']
        writer = csv.DictWriter(csv_file, fieldnames=fieldnames)
        writer.writeheader()
        for new_data in damages:
            writer.writerow({'ID': new_data['ID'], 'HOTEL': new_data['HOTEL'], 'DESKRIPSI': new_data['DESKRIPSI'], 'STATUS': new_data['STATUS']})

    print("Data Perawatan telah diperbaiki")
    back_to_menu()

if __name__ == "__main__":
    while True:
        show_menu()
