package com.caketux.javafundamental.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Program penjumlahan sederhana");
		System.out.println("Masukkan angka pertama : ");
		int value = scanner.nextInt();
		System.out.println("Masukkan angka kedua : ");
		int anotherValue = scanner.nextInt();
		int result = value + anotherValue;
		System.out.println("Hasilnya adalah : " + result);
	}
}
