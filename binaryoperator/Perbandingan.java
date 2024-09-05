package binaryoperator;

public class Perbandingan {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        boolean hasilSamaDengan = (a = b);
        System.out.println("a = b: " + hasilSamaDengan);

        boolean hasilLebihBesarDari = (a > b);
        System.out.println("a > b: " + hasilLebihBesarDari);

        boolean hasilLebihKecilDari = (a < b);
        System.out.println("a < b: " + hasilLebihKecilDari);

        boolean hasilLebihBesarSamaDengan = (a >= b);
        System.out.println("a >= b: " + hasilLebihBesarSamaDengan);

        boolean hasilLebihKecilSamaDengan = (a <= b);
        System.out.println("a < b: " + hasilLebihKecilSamaDengan);
    }
}

