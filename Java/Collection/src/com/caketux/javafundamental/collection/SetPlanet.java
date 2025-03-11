package com.caketux.javafundamental.collection;

import java.util.*;

public class SetPlanet {

	public static void main(String[] args) {

		// Menggunakan HashSet
		Set<String> planets = new HashSet<>();
		// method add() untuk menambahkan object ke List
		planets.add("Venus");
		planets.add("Mercurius");
		planets.add("Jupiter");
		planets.add("Earth"); // Menambahkan object "earth" beberapa kali
		planets.add("Earth");
		planets.add("Earth");
		planets.add("Mars"); // objek lainnya masuh bisa terus ditambahkan ke List

		// method size() untuk mendapatkan ukuran Set
		System.out.println("Set planets awal: (size = " + planets.size() + ")");
		for (String planet : planets) {
			System.out.println("\t " + planet);
		}

		planets.remove("Venus"); // method remove() untuk mengeluarkan objek dari Set

		System.out.println("Set planets akhir: (size = " + planets.size() + ")");
		for (Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
			// loopung menggunakan Iterator
			System.out.println("\t " + iterator.next());
		}
	}
}
