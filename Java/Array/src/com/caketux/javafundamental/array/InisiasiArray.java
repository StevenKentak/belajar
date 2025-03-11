package com.caketux.javafundamental.array;

public class InisiasiArray {

	public static void main(String[] args) {

		int[] arrInt = new int[6];
		arrInt[0] = 1;
		arrInt[1] = 2;
		arrInt[2] = 3;
		arrInt[3] = 4;
		arrInt[4] = 5;
		arrInt[5] = 6;


		System.out.println(arrInt[0]);
		System.out.println(arrInt[1]);
		System.out.println(arrInt[2]);
		System.out.println(arrInt[3]);
		System.out.println(arrInt[4]);
		System.out.println(arrInt[5]);
		System.out.println("go");

		// Coba perulangan

		int[] arayInt = new int[100];

		// Inisialisasi dan menampilkan arayInt dari elemen ke 1 sampai 100
		for (int x = 0; x < arayInt.length; x++) {
			arayInt[x] = x + 1;
			System.out.println(arayInt[x]);
		}
	}
}
