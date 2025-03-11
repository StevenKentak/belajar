package com.caketux.javafundamental.basic;

import com.caketux.javafundamental.kendaraan.*;
import  com.caketux.javafundamental.musik.piano;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello caketux!");

		piano.bunyi();
		Mobil.TampikanJumlahBan();
		Bus.TampikanJumlahBan();
		Sepedah.TampikanJumlahBan();

		Date today = new Date();
		System.out.println("Hari ini = " + today);
		Date tomorrow = DateUtils.addDays(today,1);
		System.out.println("Besok = " + tomorrow);
	}
}
