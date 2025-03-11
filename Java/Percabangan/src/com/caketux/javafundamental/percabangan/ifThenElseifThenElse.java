package com.caketux.javafundamental.percabangan;

public class ifThenElseifThenElse {

	public static void main(String[] args) {

		int nilaiUjian = 80;
		String indeksPrestasi;

		// Kode yang bisa dijalankan. Tergantung dari nilai variabel integer nilaiUjian
		if (nilaiUjian >= 90){
			indeksPrestasi = "A";
		} else if (nilaiUjian >= 80) {
			indeksPrestasi = "B";
		} else if (nilaiUjian >= 70) {
			indeksPrestasi = "C";
		} else if (nilaiUjian >= 60) {
			indeksPrestasi = "D";
		} else{
			indeksPrestasi = "F";
		}
		System.out.println("nilai ujian akhir anda adalah " + indeksPrestasi);
	}
}
