package com.caketux.javafundamental.excptioon;

import java.io.FileReader;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
        // Mencoba membaca berkas latihan.txt
        File file = new File ("D://latihan.txt");
        FileReader fr = new FileReader(file);
        // Jika berhasil maka tampilkan pesan 
        System.out.println("read file berhasil");
        }catch (Exception e) {
            // Jika terjadi masalah maka tampilkan pesan
            System.out.println(e.getMessage());
        }
    }
}
