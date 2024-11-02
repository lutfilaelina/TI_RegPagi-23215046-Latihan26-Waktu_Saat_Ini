/*
 * @author 
 * NAMA     : Lutfi Laeli Nur Afiyah
 * KELAS    : Teknik Informatika
 * NIM      : 23215046
 * Deskripsi Program : Waktu Saat Ini
 */ 

package Pertemuan6;
import java.text.SimpleDateFormat; //Library untuk memformat tanggal dan waktu
import java.util.Date; //Library untuk mengambil waktu saat ini 

public class Latihan26 {
    public static void main(String[] args) { 
        
        // Penjelasan (1)
        SimpleDateFormat formatTanggal = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");

        // Penjelasan (2)
        String waktuSekarang = formatTanggal.format(new Date());

        //Penjelasan (3)
        System.out.println("Hari ini adalah hari : " + waktuSekarang); 
    }
}

/* PENJELASAN
   (1) Library SimpleDateFormat digunakan untuk membuat format tanggal dan waktu dalam pola khusus
       sesuai dengan kebutuhan yang diinginkan soal. Saya menggunakan pola "EEEE, dd MMM yyyy HH:mm:ss", 
       yang mana "EEEE" menunjukkan nama hari, "dd MMM yyyy" adalah hari-bulan-tahun, dan "HH:mm:ss" untuk
       menampilkan waktu dalam format 24-jam. 
   (2) Objek SimpleDateFormat yang dideklarasikan tadi digunakan untuk mengkonversi tanggal
       dan waktu sekarang (new Date()) menjadi string yang terformat. Hal ini memungkinkan program untuk 
       menampilkan waktu sesuai pola yang telah ditentukan dalam formatTanggal.
   (3) Setelah waktu terformat diperoleh, saya mencetaknya menggunakan System.out.println() untuk 
       menunjukkan waktu saat ini kepada user.
*/
