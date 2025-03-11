package com.caketux.javafundamental.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListPlanet {

	public static void main(String[] args) {

		// deklarasi Array
		String[] heroes = new String[2];
		heroes[0] = "Katarina";
		heroes[1] = "Akali";

		// Menggunakan ArrayList
		List<String> planets = new ArrayList<>();
		planets.add("Earth"); // method add() untuk menambahkan object ke List
		planets.add("Venus");
		planets.add("Mercurius");
		planets.add("Jupiter"); // objek lainnya masuh bisa terus ditambahkan ke List

		System.out.println("List planets awal : ");
		for (int i = 0; i <planets.size(); i++){ // method size() untuk mendapatkan ukuran List
			// method get() untuk melihat isi List pada index i
			System.out.println("\t index-"+ i +" = " + planets.get(i));
		}
		planets.remove("Venus"); // method remove() untuk mengeluarkan object dari list

		System.out.println("List planet Akhir:");
		for (int i = 0; i < planets.size(); i++){
			System.out.println("\t index-" + i +" = " + planets.get(i));
		}
	}
}
