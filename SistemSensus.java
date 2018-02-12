import java.util.Scanner;

/**
 * @author Template Author: Ichlasul Affan dan Arga Ghulam Ahmad
 * Template ini digunakan untuk Tutorial 02 DDP2 Semester Genap 2017/2018.
 * Anda sangat disarankan untuk menggunakan template ini.
 * Namun Anda diperbolehkan untuk menambahkan hal lain berdasarkan kreativitas Anda
 * selama tidak bertentangan dengan ketentuan soal.
 *
 * Cara penggunaan template ini adalah:
 * 1. Isi bagian kosong yang ditandai dengan komentar dengan kata TODO
 * 2. Ganti titik-titik yang ada pada template agar program dapat berjalan dengan baik.
 *
 * Code Author (Mahasiswa):
 * @author Hermawan Wibisana Arifin, NPM 1706043405, Kelas DDP2-B, GitLab Account:@drogon.str
 */

public class SistemSensus {
	public static void main(String[] args) {
		// Buat input scanner baru
		Scanner input = new Scanner(System.in);


		// TODO Bagian ini digunakan untuk soal Tutorial "Sensus Daerah Kumuh"
		// User Interface untuk meminta masukan
		System.out.print("PROGRAM PENCETAK DATA SENSUS\n" +
				"--------------------\n" +
				"Nama Kepala Keluarga   : ");
		String nama = input.nextLine();
		System.out.print("Alamat Rumah           : ");
		String alamat = input.nextLine();
		System.out.print("Panjang Tubuh (cm)     : ");
		short panjang = Short.parseShort(input.nextLine());				//Mengubah short menjadi string
		System.out.print("Lebar Tubuh (cm)       : ");
		short lebar = Short.parseShort(input.nextLine());
		System.out.print("Tinggi Tubuh (cm)      : ");
		short tinggi = Short.parseShort(input.nextLine());
		System.out.print("Berat Tubuh (kg)       : ");
		float berat = Float.parseFloat(input.nextLine());
		System.out.print("Jumlah Anggota Keluarga: ");
		byte keluarga = Byte.parseByte(input.nextLine());				//Mengubah integer menjadi string
		System.out.print("Tanggal Lahir          : ");
		String tanggalLahir = input.nextLine();
		System.out.print("Catatan Tambahan       : ");
		String catatan = input.nextLine();
		System.out.print("Jumlah Cetakan Data    : ");
		byte jumlahCetakan = Byte.parseByte(input.nextLine());


		// TODO Bagian ini digunakan untuk soal Tutorial "Sensus Daerah Kumuh"
		// TODO Hitung rasio berat per volume (rumus lihat soal)
		double rasio = (berat)/(panjang*lebar*tinggi);
		int jumlahc = catatan.length();									//Membuat variabel yang berisi len dari catatan

		for (int i = 1; i<=jumlahCetakan; i++) {						//Membuat loop
			// TODO Minta masukan terkait nama penerima hasil cetak data
			System.out.print("Pencetakan " + i + " dari " + jumlahCetakan + " untuk: ");
			String tambahaninput = input.nextLine();
			String tambahan = tambahaninput.toUpperCase(); // Lakukan baca input lalu langsung jadikan uppercase
			if (jumlahc>0) {											//Menciptakan suatu kondisi
				System.out.print("DATA SIAP DICETAK UNTUK " + tambahan + "\n--------------------" + "\n" + nama + "-" + alamat + 
			"\nLahir pada tanggal" + tanggalLahir + "\nRasio Berat Per Volume		=" + rasio + "kg/m^3" + "\nCatatan:" + catatan +"\n");
			}
			else {
				System.out.print("DATA SIAP DICETAK UNTUK " + tambahan + "\n--------------------" + "\n" + nama + "-" + alamat + 
			"\nLahir pada tanggal " + tanggalLahir + "\nRasio Berat Per Volume:" + rasio + "kg/m^3" + "\nCatatan:" + "Tidak ada catatan tambahan" + "\n");
			}
			

			
		}


		// TODO Bagian ini digunakan untuk soal bonus "Rekomendasi Apartemen"
		// TODO Hitung nomor keluarga dari parameter yang telah disediakan (rumus lihat soal)



		// TODO Gabungkan hasil perhitungan sesuai format sehingga membentuk nomor keluarga
		/*String nomorKeluarga = "";

		// TODO Hitung anggaran makanan per tahun (rumus lihat soal)
		... anggaran = (...) (...);

		// TODO Hitung umur dari tanggalLahir (rumus lihat soal)
		... tahunLahir = .....; // lihat hint jika bingung
		... umur = (...) (...);

		// TODO Lakukan proses menentukan apartemen (kriteria lihat soal)





		// TODO Cetak rekomendasi (ganti string kosong agar keluaran sesuai)
		String rekomendasi = "";
		.....;*/

		input.close();
	}
}