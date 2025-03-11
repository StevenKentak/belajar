public class Sting {
	public static void main(String[] args) {
		// Membuat String dari array character
		char[] caketuxChars = {'c', 'a', 'k', 'e', 't', 'u', 'k'};
		String caketuxString = new String(caketuxChars);
		System.out.println(caketuxString);

		// Mengetahui Panjang String
		String caketux = "Miftakhus Surur";
		int length = caketux.length(); // Method length() Digunakan untuk mengetahui panjang atau jumlah karakter dalam string.

		// Mengambil karakter dari sebuah String
		String mipt = "Miftakhus Surur";
		char result = mipt.charAt(5); // Method charAt(int index) Digunakan untuk mengambil sebuah karakter berdasarkan indeks tertentu.
		System.out.println(result);
	}
}
