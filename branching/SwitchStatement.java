package branching;

import  java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(Source:System.in);

        System.out.println("Masukkan nomor hari (1 - 7) : ");
        int nomorHari = input.nextInt();

        String namaHari = "";

        switch (nomorHari){
            case 1:
                namaHari = "Minggu";
                break;


        }
    }

}
