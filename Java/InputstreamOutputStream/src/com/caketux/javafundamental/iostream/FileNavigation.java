package com.caketux.javafundamental.iostream;

import java.io.File;

public class FileNavigation {
    public static void main(String[] args) {
        // Contoh 1
        /**String dirname = "/java/latihan1";
        File file = new File(dirname);

        // Buat directory
        file.mkdirs(); **/

        // Contoh 2
        String dirname = "/java/latihan2";
        File file = null;
        String[] paths;

        try {
            // Instansiasi objek File
            file = new File(dirname);

            //Ambil list files dan masukkan ke stringg paths
            paths = file.list();

            // Tampilkan semua path yang ada
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
