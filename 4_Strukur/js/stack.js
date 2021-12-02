// YOGI PRASETYAWAN - 191110236
const Stack = (function() {
    const atas = new WeakMap();

    return class {
        constructor() {
            atas.set(this, [])
        }
        masuk(element) {
            atas.get(this).push(element)
        }
        keluar() {
            return atas.get(this).pop()
        }
        intip() {
            return atas.get(this)[atas.get(this).length - 1]
        }
        apakahKosong() {
            return atas.get(this).length === 0
        }
        ukuran() {
            return atas.get(this).length
        }
        hapus() {
            atas.set(this, [])
        }
    }
})()

const next = new Stack()

console.log("\Testing tumpukan...")

console.log("\n========================================\n")

console.log("Memasukkan 5, 6, dan 7 ke tumpukan...")
next.masuk(5)
next.masuk(6)
next.masuk(7)

console.log("Item teratas adalah: " + next.intip())
console.log("Tumpukan yang kosong adalah: " + next.apakahKosong())
console.log("Jumlah item dalam tumpukan adalah: " + next.ukuran())

console.log("\n========================================\n")

console.log("Menghapus item teratas di tumpukan...")
let x = next.keluar()
console.log("Item terhapus paling atas: " + x)

console.log("Item teratas terbaru adalah: " + next.intip())
console.log("Ukuran tumpukan terbaru adalah: " + next.ukuran())

console.log("\n========================================\n")

console.log("Menghapus tumpukan...")
next.hapus()
console.log("Tumpukan dikosongkan: " + next.apakahKosong())

console.log("\n========================================\n")

console.log("Memasukkan 8 ke tumpukan...")
next.masuk(8)
console.log("Item teratas adalah: " + next.intip())

console.log("\n========================================\n")

console.log("Selesai melakukan testing tumpukan!\n")
