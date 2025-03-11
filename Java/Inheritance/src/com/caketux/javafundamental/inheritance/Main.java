package com.caketux.javafundamental.inheritance;

public class Main {
    public static void main(String[] args) {
    Hewan hewanku = new Hewan(); // akan memanggil constructor Hewan

    System.out.println("Apakah hewan IS-A Objek -> " + (hewanku instanceof Object));
    System.out.println("Apakah hewan IS-A Hewan -> " + (hewanku instanceof Hewan));
    System.out.println("Apakah hewan IS-A Kucing -> " + (hewanku instanceof Kucing));
    
    System.out.println("--------------------------------------------");

    Kucing kucingku = new Kucing(); // akan memanggil constructor Kucing
    System.out.println("Apakah hewan IS-A Objek -> " + (hewanku instanceof Object));
    System.out.println("Apakah hewan IS-A Hewan -> " + (hewanku instanceof Hewan));
    System.out.println("Apakah hewan IS-A Kucing -> " + (hewanku instanceof Kucing));
    }   
}
