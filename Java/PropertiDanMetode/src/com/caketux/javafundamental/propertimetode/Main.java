package com.caketux.javafundamental.propertimetode;

public class Main {
	public static void main(String[] args) {

		// tambahkan 1 argumen dengan nilai int 2
		// nilai tersebut adalah nilai yang digunakan untuk inisiasi variabel umur
		Hewan kucing = new Hewan(2);
		kucing.makan();
		kucing.jalan();
		kucing.lari();

		// Contoh penggunaan fungsi getUmur
		System.out.println("Umurnya adalah " + kucing.getUmur());

		// Perhitungan index massa tubuh (BMI)
		// berat(Kg) / ( tinggi(M) * tinggi(M) )
		double bmi = kucing.getBerat() / ((kucing.getTinggi() *0.01) * (kucing.getTinggi() * 0.01));
		System.out.println("Index massa tubuhnya adalah " + bmi);
	}
}
