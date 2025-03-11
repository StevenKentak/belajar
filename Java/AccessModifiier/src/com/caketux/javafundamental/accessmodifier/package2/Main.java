package com.caketux.javafundamental.accessmodifier.package2;

import com.caketux.javafundamental.accessmodifier.package1.KelasA;

public class Main {
	public static void main(String[] args) {

		// kode ini pasti akan mengalami kompile error karena tidak bisa mengakses modifier private
		//KelasA kelasA = new kelasA();

		//System.out.println(kelasA.functionB());

		//System.out.println(kelasA.memberB);
		//System.out.println(kelasA.memberC);

		KelasB kelasB = new KelasB();
		kelasB.methodC();
	}
}
