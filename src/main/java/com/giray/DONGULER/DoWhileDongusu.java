package com.giray.DONGULER;

import java.util.Scanner;

public class DoWhileDongusu {
    public static void main(String[] args) {

        /**
         * Do-While d�ng�s�n�n While d�ng�s�nden tek fark�;
         * D�ng� koduna 1 kez kesinlikle girmesi ve sonra verilen ko�ulu kontrol etmesidir.
         * O halde Do-While d�ng�s�n�n en az 1 kere �al��aca��n� s�yleyebiliriz.
         *
         */

        /**
         * Kullan�c�dan bir say� isteyip al�nan say�n�n asal olup olmad���n�
         * do-while d�ng�s� ile tasarlayal�m.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir say� girin: ");
        int sayi = scanner.nextInt();

        int bolen = 2;
        boolean asal = true;

        do {
            if (sayi % bolen == 0) {
                asal = false;
                break;
                //e�er ko�ul sa�lan�rsa d�ng�den ��kar.Buda bize h�z, s�re bak�m�ndan kolayl�k sa�lar.
            }
            bolen++;
        } while (bolen <= sayi / 2);

        if (asal && sayi > 1) {
            System.out.println(sayi + " say�s� bir asal say�d�r.");
        } else {
            System.out.println(sayi + " say�s� bir asal say� de�ildir.");
        }
    }
}
