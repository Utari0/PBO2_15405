package week3;
import java.util.Scanner;
import java.util.Random;

class Tebakangka 
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("=================");
        System.out.println("    TEBAK ANGKA    ");
        System.out.println("=================");

        int angka = r.nextInt(100) + 1; // mengeluarkan angka acak 1 sampai 100
        int tebakan;

        do 
        {
            System.out.print("Masukkan Angka: ");
            tebakan = s.nextInt();
            if (!cekAngka(tebakan, angka)) 
            { // memanggil fungsi cek angka
                statusAngka(tebakan, angka); // memanggil fungsi status angka
            }
        } 
        while (tebakan != angka);

        System.out.println("Tebakan Kamu Benar!");
    }

    // fungsi untengeuk cek apakah tebakan sama dengan angka acak
    public static boolean cekAngka(int tebakan, int angka) 
    {
        return tebakan == angka;
    }

    // fungsi untuk memberikan status tebakan (terlalu besar/terlalu kecil)
    public static void statusAngka(int tebakan, int angka) 
    {
        if (tebakan < angka) 
        {
            System.out.println("Angka Terlalu Kecil");
        } else 
        {
            System.out.println("Angka Terlalu Besar");
        }
        System.out.println("Coba Lagi");
    }
}