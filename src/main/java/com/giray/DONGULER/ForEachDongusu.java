package com.giray.DONGULER;

public class ForEachDongusu {
    public static void main(String[] args) {
        /**
         * Foreach yap�s� diziler �zerinde yineleme yapmay� kolayla�t�rmaktad�r.
         * Foreach yaln�zca diziler ve nesneler i�in kullan�labilir.
         * Farkl� veri t�r�nde veya ilklendirilmemi� bir de�i�ken ile kullanmak istedi�imizde hata verir.
         */
        // String tipinde bir dizi olu�tural�m
        String[] arabalar = {"Volvo", "Audi", "Ford", "Mercedes", "BMW"};


        for (String meyve : arabalar) {
            System.out.println(meyve);
        }
    }
}
