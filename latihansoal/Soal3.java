package latihansoal;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka pertama : ");
        int angka1 = input.nextInt();
        System.out.println("Masukkan angka kedua : ");
        int angka2 = input.nextInt();

        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        System.out.println("5.Modulus");
        System.out.println("Pilih operasi yang ingin digunakan:");
        int hasil = input.nextInt();

        if (hasil == 1) {
            System.out.println(angka1 + angka2);
        } else if (hasil == 2) {
            System.out.println(angka1 - angka2);
        } else if (hasil == 3) {
            System.out.println(angka1 * angka2);
        } else if (hasil == 4) {
            System.out.println(angka1 / angka2);
        } else if (hasil == 5) {
            System.out.println(angka1 % angka2);
        } else {
            System.exit(0);
        }
    }
}

