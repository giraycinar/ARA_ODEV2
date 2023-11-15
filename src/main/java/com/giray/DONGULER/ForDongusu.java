package com.giray.DONGULER;

import java.util.Scanner;

public class ForDongusu {
    public static void main(String[] args) {
        /**
         * Java i�erisinde kolay bir tan�mlama ve kontrol alt�nda d�ng� kurabilece�imiz bir yap�d�r.
         * Belirleyece�imiz ko�ul do�ru oldu�u s�rece kodu d�nd�rmeye devam eder.
         * Ko�ul sa�lanmad��� taktirde d�ng�den ��kar.
         * Genellikle, ka� kere d�nece�i belli olmayan, ko�ulun bir girdiye g�re denetlendi�i durumlarda
         * While ya da do-while d�ng�s� kullan�l�rken, diziler gibi,
         * tekrar say�s� belirli olan durumlarda ise for d�ng�s� kullan�lmas� tercih edilir.
         */

        /**
         * Kullan�c�dan de�er al�p fakt�riyelini hesaplayal�m.
         * Bu tarz ka� kez d�nece�i belli sorular i�in for kullanmak daha uygundur.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Fakt�riyelini hesaplamak istedi�iniz say�y� girin: ");
        int sayi = scanner.nextInt();


        long faktoriyel = 1;

        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }

        System.out.println(sayi + "! = " + faktoriyel);
    }
}
