package com.giray.DONGULER;

public class ForEachDongusu {
    public static void main(String[] args) {
        /**
         * Foreach yapýsý diziler üzerinde yineleme yapmayý kolaylaþtýrmaktadýr.
         * Foreach yalnýzca diziler ve nesneler için kullanýlabilir.
         * Farklý veri türünde veya ilklendirilmemiþ bir deðiþken ile kullanmak istediðimizde hata verir.
         */
        // String tipinde bir dizi oluþturalým
        String[] arabalar = {"Volvo", "Audi", "Ford", "Mercedes", "BMW"};


        for (String meyve : arabalar) {
            System.out.println(meyve);
        }
    }
}
