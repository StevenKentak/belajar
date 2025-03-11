package com.caketux.javafundamental.accessmodifier.package3;

public class Perhitungan {
	// bisa di akses ke kelas main karena bernilai satic
	public static int nilai = 0;

	protected static int getNilai(){
		return nilai;
	}

	Perhitungan() {
		nilai++;
	}
}
