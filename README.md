PENDAHULUAN
Aplikasi Perpustakaan Sistem Informasi dibuat untuk mempermudah pihak admin untuk 
mengelola data buku SI, skripsi mahasiswa SI, serta peminjaman buku. Lalu dapat 
mempermudah mahasiswa SI untuk meminjam buku. 
Sehingga saya membuat aplikasi sederhana perpustakaan Sistem Informasi. Proses 
pembuatan aplikasi ini dihubungkan dengan database dan menghubungkannya di netbeans 
menggunakan persistence. Pada aplikasi ini terdapat fitur CRUD , report, searching, dan 
kategori. Serta aplikasi ini dibuat dengan UI yang menarik. 
PERANCANGAN dan DESAIN GUI 
Di dalam aplikasi perpustakaan ini terdapat 3 GUI utama. Yaitu GUI buku, GUI skripsi, 
dan GUI peminjaman serta pengembalian. Untuk memudahkan jalannya aplikasi, sebelum 
mengoding harus ditambahkan collection ke dalam library. Ada commons collection 4.4, 1.9.4, 
2.1, 1.2, 3.2, dan ada jcalendar 1.4 (opsional). Tipe data ini saya menggunakan String semua 
kecuali pada tanggal menggunkan date. 
Selanjutnya mari kita bahas pada kelas pertama yaitu GUI skripsi. Pada database 
membuat table skripsi yang berisi field id skripsi, judul skripsi, nama penulis, dan tahun skripsi. 
Di dalam GUI skripsi terdapat beberapa fitur untuk melakukan CRUD, searching by filter, dan 
report. 
Kelas selanjutnya yaitu GUI buku. Pada database membuat table untuk buku yang berisi id buku, 
judul buku, sub judul, penulis, penerbit, tahun terbit, dan halaman buku. Fitur dalam gui buku ini 
bisa melakukan CRUD, searching by filter, report, dan pilihan kategori. 
Fitur kategori ini berisi beberapa pilihan genre buku. Caranya adalah dengan membuat table 
kategori pada database yang berisi field nomer kategori dan jenis. lalu nomer kategori di foreign 
key pada table buku. Lalu di netbeans dibuatlah GUI khusus untuk kategori. Pada gui kategori 
hanya bisa menambahkan jenis dan nomer kategori saja. 
Lalu pada GUI buku bagian tampil, dibuat source code kategori untuk menjalankan kategori. 
Kelas selanjutnya yaitu GUI peminjaman dan pengembalian. Pada GUI ini terdapat field nim, 
nama, isbn, judul buku, kategori, tanggal peminjaman dan pengembalian, Angkatan, dan status. 
Fitur pada GUI ini lebih lengkap disbanding GUI sebelumnya. Tentunya bisa melakukan CRUD, 
searching by filter, dan report. 
Fitur pada GUI peminjaman dan pengembalian 
1) Combo box status. Hanya perlu menambahkan combo box dan diisi pada properties. Lalu 
di set dan get pada source code. 
2) Field isbn, judul buku, dan kategori. Ketiga field ini sudah ada pada data buku. Sehingga 
disini saya memanggil ketiga field tersebut. Pada database isbn buku di foreign key pada 
table peminjaman. Membuat frame baru dengan nama ListBuku yang berisi table isbn, 
judul buku, dan kategori. Hal ini bertujuan untuk mengambil suatu data dari data buku. 
Pada source code list buku ditambahkan set visible untuk menampilkan GUI list buku ini. 
Kembali ke GUI peminjaman, bagian atas source code, membuat deklarasi metode 
bernama setIsbnDanJudulBuku dengan nama variable book. 
Pada field isbn, judul buku, dan kategori menggunakan events key typed dan pada 
propertiesnya dinonaktifkan bagian editable. 
3) Fitur tanggal peminjaman dan pengembalian
Memasukkaan library calendar pada tools, maka di design bagian palette akan muncul 
otomatis calender. Lalu pilih jdate chooser. Pada source code peminjaman, menambahkan 
code berikut yang bertujuan untuk mengubah objek Date menjadi string dengan format 
tertentu. Dan untuk menyimpan serta menampilkan tanggal. 
4) Fitur laporan perbulan. Saya pisahkan laporan perbulan dengan laporan yang lain, 
membuat button baru dan frame baru. Dalam frame ini menggunakan combo box yang 
berisi bulan dan tahun. Serta button untuk mencetak dan Kembali pada tampilan GUI 
peminjaman. 
5) Fitur laporan peminjaman terbanyak. Fitur ini menggunakan button baru. Dalam button 
tersebut source code nya sama dengan searching dan ditambahkan source code untuk 
menemukan buku dengan isbn yang paling sering dipinjam. 
6) Fitur agar bisa ke GUI yang lain. Saya membuat GUI dashboard. Menggunakan events 
mouse click. Di dalam events mouse click menggunakan source code set visible untuk 
beralih ke GUI yang diinginkan. 
HASIL REPORT
1) Report skripsi berdasarkan pencarian filter pada tahun skripsi. 
2) Report pada buku berdasarka pencarian dengan filter kategori genre buku
3) Report pada peminjaman dan pengembalian berdasarkan pencarian filter nama
4) Report peminjaman dan pengembalian dengan output laporan bulanan 
5) Laporan dengan peminjaman buku terbanyak berdasarkan ISBN 
6) report berdasarkan Angkata
