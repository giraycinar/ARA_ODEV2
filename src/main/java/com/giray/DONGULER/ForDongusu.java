package com.giray.DONGULER;

import java.util.Scanner;

public class ForDongusu {
    public static void main(String[] args) {
        /**
         * Java içerisinde kolay bir tanýmlama ve kontrol altýnda döngü kurabileceðimiz bir yapýdýr.
         * Belirleyeceðimiz koþul doðru olduðu sürece kodu döndürmeye devam eder.
         * Koþul saðlanmadýðý taktirde döngüden çýkar.
         * Genellikle, kaç kere döneceði belli olmayan, koþulun bir girdiye göre denetlendiði durumlarda
         * While ya da do-while döngüsü kullanýlýrken, diziler gibi,
         * tekrar sayýsý belirli olan durumlarda ise for döngüsü kullanýlmasý tercih edilir.
         */

        /**
         * Kullanýcýdan deðer alýp faktöriyelini hesaplayalým.
         * Bu tarz kaç kez döneceði belli sorular için for kullanmak daha uygundur.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriyelini hesaplamak istediðiniz sayýyý girin: ");
        int sayi = scanner.nextInt();


        long faktoriyel = 1;

        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }

        System.out.println(sayi + "! = " + faktoriyel);
    }
}
