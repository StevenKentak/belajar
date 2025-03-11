package com.caketux.javafundamental.inheritance;

public class Main {
    public static void main(String[] args) {
    Hewan hewan = new Hewan(); // akan memanggil constructor Hewan

    System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object));
    System.out.println("Apakah hewan IS-A Hewan -> " + (hewan instanceof Hewan));
    System.out.println("Apakah hewan IS-A Kucing -> " + (hewan instanceof Kucing));
    
    System.out.println("--------------------------------------------");

    Kucing kucing = new Kucing(); // akan memanggil constructor Kucing
    System.out.println("Apakah hewan IS-A Objek -> " + (kucing instanceof Object));
    System.out.println("Apakah hewan IS-A Hewan -> " + (kucing instanceof Hewan));
    System.out.println("Apakah hewan IS-A Kucing -> " + (kucing instanceof Kucing));
    
    System.out.println("--------------------------------------------");

    kucing.makan(); // kucing memanggil method makan
    hewan.makan();  // hewan memanggil method makan
    kucing.makan("daging ikan");

    System.out.println("--------------------------------------------");

    Kucing meow = new Kucing("Ocicat", "tropis");
    Kucing puss = new Kucing("Ocicat", "subtropis");
    Kucing popo = new Kucing("Anggora", "subtropis");

    System.out.println(meow.toString());
    System.out.println(puss.toString());
    System.out.println(popo.toString());

    System.out.println("meow equals puss ? " + meow.equals(puss));
    System.out.println("meow equals popo ? " + meow.equals(popo));

    System.out.println("--------------------------------------------");

    Object o = new Kucing(); // Kucing adalah Objek
    Hewan h = new Kucing(); // Kucing adalah Hewan
    Kucing k = new Kucing(); // Kucing adalah Kucing

    // o.makan(); akan error, karena method makan() tidak ada di class Object
    h.makan();
    k.makan();

    Object object = k; // bisa langsung di assign
    Hewan hewankucing = k; // bisa langsung di assign

    // object.makan(); -> error, karena method makan() tidak ada di class Object
    hewankucing.makan();

    Kucing kucingku = (Kucing) h; // tidak bisa langsung diassign, perlu casting
    kucingku.makan();

    Hewan harimau = new Hewan();
    Kucing anggora = (Kucing) harimau; // compile OK tetapi runtime error ClassCastException

    }   
}
