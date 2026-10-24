# Aplikasi Penghitung Kata & Karakter (Java Swing)

Aplikasi desktop sederhana berbasis **Java Swing** yang dirancang untuk menghitung jumlah kata dan karakter dari teks yang dimasukkan pengguna secara *real-time*.

---

## 🛠️ Komponen GUI yang Digunakan

Sesuai dengan ketentuan tugas, aplikasi ini mengimplementasikan elemen-elemen GUI sebagai berikut:

### 1. Top Level Container
* **`JFrame`** (`AplikasiPenghitungKata`): Berfungsi sebagai jendela utama (window) aplikasi yang menampung seluruh komponen antarmuka pengguna[cite: 1].

### 2. Intermediate Component
* **`JPanel`** (`panelBawah`): Wadah sekunder yang digunakan untuk mengelompokkan tombol aksi dan label status di bagian bawah jendela[cite: 1].
* **`JScrollPane`** (`scrollPane`): Wadah pembungkus untuk `JTextArea` agar teks yang panjang dapat digulir (memiliki fitur *scroll*) secara otomatis[cite: 1].

### 3. Atomic Component
* **`JTextArea`** (`textArea`): Komponen tempat pengguna mengetik atau memasukkan teks[cite: 1].
* **`JButton`** (`btnHitung` & `btnRiset`): Tombol interaktif untuk memicu perhitungan manual dan mereset teks[cite: 1].
* **`JLabel`** (`labelStatus`): Komponen teks untuk menampilkan hasil statistik jumlah kata dan karakter[cite: 1].

### 4. Layout Manager
* **`BorderLayout`**: Mengatur tata letak komponen utama pada `JFrame` (menempatkan `JScrollPane` di bagian `CENTER` dan `JPanel` di bagian `SOUTH`)[cite: 1].
* **`FlowLayout`**: Mengatur tata letak komponen di dalam `JPanel` agar tersusun rapi secara horizontal di tengah[cite: 1].

### 5. Event Handling (2 Interface)
Aplikasi ini menggunakan dua interface penanganan kejadian (*event handling*) yang berbeda:
1. **`ActionListener`**: Menangani aksi klik pada tombol `Hitung` dan `Reset`[cite: 1].
2. **`KeyListener` / `KeyAdapter`**: Mendeteksi aktivitas pengetikan pada keyboard (`keyReleased`) secara *real-time* sehingga jumlah kata dan karakter langsung terbarui saat pengguna mengetik[cite: 1].

---

## 📸 Screenshot Aplikasi

<img width="976" height="688" alt="image" src="https://github.com/user-attachments/assets/e76d41a9-6c66-47fc-9666-e9a413aacb59" />
<img width="980" height="690" alt="image" src="https://github.com/user-attachments/assets/b9bf4e28-b338-4bdf-bc4b-1fd83555a572" />


## 🚀 Cara Menjalankan Program

1. Pastikan komputer Anda telah terinstal **Java Development Kit (JDK)**.
2. Unduh atau *clone* repository ini.
3. Kompilasi file Java melalui terminal/command prompt dan tools compiler lainnya.
