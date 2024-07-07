# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `OjekOnline`, `OjekPro`, dan `OjekBeraksi` adalah contoh dari class.

```bash
public class OjekOnline {
    ...
}

public class OjekPro extends OjekOnline {
    ...
}

public class OjekBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `ojek[i] = new OjekPro (nama, id, tujuan);` adalah contoh pembuatan object.

```bash
ojek[i] = new OjekPro (nama, id, tujuan);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`,`id` dan `tujuan` adalah contoh atribut.

```bash
String nama;
String id;
String tujuan;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `OjekOnline` dan `OjekPro`.

```bash
public OjekOnline(String nama, String id, String tujuan) {
        this.nama = nama;
        this.id = id;
        this.tujuan = tujuan;
}

public OjekPro (String nama, String id, String tujuan){
        super (nama, id, tujuan);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setId` dan `setTujuan` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
    }

public void setId(String id) {
        this.id = id;
    }
public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getId` dan `getgetTujuan`  adalah contoh method accessor.

```bash
    public String getNama() {
        return nama;
    }

 public String getId() {
        return id;
    }
 public String getId() {
        return id;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `id` dan `tujuan` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
protected String nama;
protected String id;
protected String tujuan;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `OjekPro` mewarisi `OjekOnline` dengan sintaks `extends`.

```bash
public class OjekPro extends OjekOnline {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `String info()` di `OjekOnline` merupakan overloading method `info()` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `info()` di `OjekOnline`.

```bash
public String info() {
        return super.info()+
                "\nPerusahaan = "+getPerusahaan()+
                "\nCode Ojek = "+getCode()+
                "\nAnggota Ojek = "+getAnggotaOjek();

@Override
    public String info() {
        return super.info()+
                "\nPerusahaan = "+getPerusahaan()+
                "\nCode Ojek = "+getCode()+
                "\nAnggota Ojek = "+getAnggotaOjek();
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getPerusahaan` dan seleksi `switch` dalam method `getCode`.

```bash
public String getPerusahaan(){
        String kodePt = getId().substring(0, 2);
        if (kodePt.equals("22")){
            return "PT. Ojek Asia";    
        }else{
            return "PT. Lain";
        }
    }

public String getCode(){
        String codeOjek = getId().substring(2, 4);

        return switch (codeOjek) {
            case "31" -> "Gojek";
            case "32" -> "Grab";
            case "33" -> "maxim";
            default -> "Ojek Lain";
        };
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<ojek.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner (System.in);       
        OjekPro[] ojek = new OjekPro[2];
        for(int i=0; i<ojek.length; i++){
            System.out.print("Masukkan Nama Ojek "+(i+1)+": ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan ID "+(i+1)+":");
            String id = scanner.nextLine();
            System.out.print("Masukkan Tujuan "+(i+1)+":");
            String tujuan = scanner.nextLine();
            scanner.nextLine();
            System.out.println("--------------------------"); 
            
        }

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
ojek[i] = new OjekPro (nama, id, tujuan);
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (NumberFormatException e){
        System.out.println("Kesalahan Format Nomor ="+e.getMessage());
}catch (StringIndexOutOfBoundsException e){
        System.out.println("Kesalahan format Id ="+e.getMessage());
}catch (Exception e){
        System.out.println("Kesalahan Error ="+e.getMessage());
    }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Edya Rosadi
NPM: 2110010001
