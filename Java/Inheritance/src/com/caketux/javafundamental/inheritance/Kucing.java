package com.caketux.javafundamental.inheritance;

public class Kucing extends Hewan {

    public Kucing() {
        super(); // super() digunakan untuk memanggil constructor dari parent class.
        System.out.println("construct Kucing");
    }
}
