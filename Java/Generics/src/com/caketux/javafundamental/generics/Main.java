package com.caketux.javafundamental.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /** Perhatikan kode untuk loop masing-masing List.
         * Untuk List lo perlu dilakukan type-casting sedangkan untuk
         * List<Planet> lp tidak perlu. Dalam kasus ini terlihat penggunaan
         * Generics membuat kode lebih sederhana seperti yang sudah
         * di bahas di paragraf awal. Dari kode di atas tidak ada
         * compile-error tetapi saat kita jalankan akan terjadi runtime-error.
         * Sebabnya, dalam List lo ada objek yang tidak bisa di-cast
         * ke Planet.Perhatikan kode untuk loop masing-masing List.
         * Untuk List lo perlu dilakukan type-casting sedangkan untuk
         * List<Planet> lp tidak perlu. Dalam kasus ini terlihat penggunaan
         * Generics membuat kode lebih sederhana seperti yang sudah di bahas
         * di paragraf awal. Dari kode di atas tidak ada compile-error
         * tetapi saat kita jalankan akan terjadi runtime-error. Sebabnya,
         * dalam List lo ada objek yang tidak bisa di-cast ke Planet. **/

        // List lo = new ArrayList<>(); // list tanpa type-parameter
        // lo.add("lo - String 1"); // Lo menampung objek String
        // lo.add(new Planet("Mercury", 0.06)); // lo menampung objek Planet

        // for(Object o : lo){
        //     Planet p = (Planet) o; // perlu type-casting dari Object ke Planet
        //     p.print();
        // }

        // List<Planet> lp = new ArrayList<>(); // List dengan type-parameter Planet
        // lp.add(new Planet("Mercury", 0.06)); // lp menampung objek Planet
        // // lp.add("lp - String 1"); // baris ini compile-error, lp tidak diijinkan menampung objek String
        // lp.add(new Planet("Venus", 0.82));

        // for(Planet p : lp){
        //     p.print();
        // }

        List<String> ls = new ArrayList<>();
        ls.add("String1");
        ls.add("String2");

        print(ls); //Baris ini Valid

        Collection<Planet> cp = new ArrayList<>();
        cp.add(new Planet("Mercury", 0.06));
        cp.add(new Planet("Venus", 0.82));

        print(cp); //Baris ini valid
        
    }

    public static void print(Collection<?> collection) { // perubahan ada di baris ini
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}