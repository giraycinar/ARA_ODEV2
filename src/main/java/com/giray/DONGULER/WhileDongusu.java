package com.giray.DONGULER;

import java.util.Scanner;

public class WhileDongusu {
    public static void main(String[] args) {

        /**
         * While döngülerinde tekrar sayýsý, döngü içerisinde oluþturduðumuz
         * þart boolean türünde true olduðu sürece devam eder.
         * Bu true deðer false döndüðü anda döngüden çýkýlýr ve program döngünün bittiði yerden
         * çalýþmaya devam eder.
         *
         */

        /**
         * Sayýnýn kendisi hariç bölenlerinin toplamýný bulan bir uygulama yapalým.
         * Belirli koþul aradýðýmýz için while döngüsü ile yaptýk.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayý girin: ");
        int sayi = scanner.nextInt();


        int bolen = 1;
        int toplam = 0;

        while (bolen <= sayi / 2) {
            if (sayi % bolen == 0) {
                System.out.println(sayi + " sayýsýnýn tam böleni: " + bolen);
                toplam += bolen;
            }
            bolen++;
        }

        System.out.println(sayi + " sayýsýnýn tam bölenlerinin toplamý: " + toplam);

    }
}
