package com.giray.DONGULER;

import java.util.Scanner;

public class DoWhileDongusu {
    public static void main(String[] args) {

        /**
         * Do-While döngüsünün While döngüsünden tek farký;
         * Döngü koduna 1 kez kesinlikle girmesi ve sonra verilen koþulu kontrol etmesidir.
         * O halde Do-While döngüsünün en az 1 kere çalýþacaðýný söyleyebiliriz.
         *
         */

        /**
         * Kullanýcýdan bir sayý isteyip alýnan sayýnýn asal olup olmadýðýný
         * do-while döngüsü ile tasarlayalým.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayý girin: ");
        int sayi = scanner.nextInt();

        int bolen = 2;
        boolean asal = true;

        do {
            if (sayi % bolen == 0) {
                asal = false;
                break;
                //eðer koþul saðlanýrsa döngüden çýkar.Buda bize hýz, süre bakýmýndan kolaylýk saðlar.
            }
            bolen++;
        } while (bolen <= sayi / 2);

        if (asal && sayi > 1) {
            System.out.println(sayi + " sayýsý bir asal sayýdýr.");
        } else {
            System.out.println(sayi + " sayýsý bir asal sayý deðildir.");
        }
    }
}
