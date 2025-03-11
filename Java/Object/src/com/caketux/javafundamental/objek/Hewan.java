package com.caketux.javafundamental.objek;

public class Hewan {
	String nama;
	int berat;
	int jumlahKaki;

	// ini merupakan konstruktor dari kelas hewan. konstruktor adalah method yang pertama kali dijalankan ketika object diciptakan.
	public Hewan(String namaHewan) {
		nama = namaHewan;
	}
	public void beratHewan(int beratHewan) {
		berat = beratHewan;
	}
	public void jumlahKakiHewan(int jumlahKakiHewan) {
		jumlahKaki = jumlahKakiHewan;

	}

	public void cetakHewan() {
		System.out.println("Nama hewan : " + nama);
		System.out.println("Berat hewan : " + berat + "Kg");
		System.out.println("Jumlah kaki : " + jumlahKaki);
	}
}
