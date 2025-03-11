package com.caketux.javafundamental.function;

public class InputFunction {

	public static void main(String[] args) {
		// memanggil funcion
		hitungLuas(7, 6.5);
	}

	public static void hitungLuas(double panjang, double lebar) {
		double luas;
				luas = panjang * lebar;
		System.out.println(luas);
	}
}
