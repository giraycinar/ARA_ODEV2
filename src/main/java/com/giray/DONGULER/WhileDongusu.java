package com.giray.DONGULER;

import java.util.Scanner;

public class WhileDongusu {
    public static void main(String[] args) {

        /**
         * While d�ng�lerinde tekrar say�s�, d�ng� i�erisinde olu�turdu�umuz
         * �art boolean t�r�nde true oldu�u s�rece devam eder.
         * Bu true de�er false d�nd��� anda d�ng�den ��k�l�r ve program d�ng�n�n bitti�i yerden
         * �al��maya devam eder.
         *
         */

        /**
         * Say�n�n kendisi hari� b�lenlerinin toplam�n� bulan bir uygulama yapal�m.
         * Belirli ko�ul arad���m�z i�in while d�ng�s� ile yapt�k.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir say� girin: ");
        int sayi = scanner.nextInt();


        int bolen = 1;
        int toplam = 0;

        while (bolen <= sayi / 2) {
            if (sayi % bolen == 0) {
                System.out.println(sayi + " say�s�n�n tam b�leni: " + bolen);
                toplam += bolen;
            }
            bolen++;
        }

        System.out.println(sayi + " say�s�n�n tam b�lenlerinin toplam�: " + toplam);

    }
}
