/**
 * Nama                 : Khaerul Adzkia Alamsyah
 * Nim                  : 23176005
 * Prodi                : Sistem Informasi / Semester 3
 * Mata Kuliah          : PBO 1 / Pertemuan 6 / Latihan 26 - Waktu Saat Ini
 * Deskripsi Program    : Menampilkan tanggal dan waktu saat ini dalam format Bahasa Indonesia
                          Program menggunakan SimpleDateFormat untuk mengatur format tampilan
                          waktu dan Date untuk mendapatkan waktu saat ini.
 * @author
 **/
package pertemuan.pkg6;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class Latihan26 {
    public static void main(String[] args) {
        // Mengatur format waktu dalam Bahasa Indonesia
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", new Locale("id", "ID"));
        Date date = new Date();

        // Menampilkan waktu saat ini
        System.out.println("Hari ini adalah hari : " + formatter.format(date));
    }
}

    

