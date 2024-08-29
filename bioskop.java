package pabass.Looping.tugas;

import java.util.Scanner;

public class bioskop {
    public static void main(String[] args) {
        String testis;
        @SuppressWarnings("resource")
        Scanner beli = new Scanner(System.in);
        Boolean lanjut = true;

        while (lanjut) {
            double tiket1 = 35000;
            double tiket2 = 40000;
            double tiket3 = 45000;

            System.out.println("PILIH TIKET FILM YANG ANDA INGINKAN");
            System.out.println("|1.FILM 1\t|");
            System.out.println("|2.FILM 2\t|");
            System.out.println("|3.FILM 3\t|");
            System.out.println("-----------------");
            System.out.print("Pilih film (1/2/3): ");
            int pilih = beli.nextInt();
            if (pilih == 1) {
                testis = "film1";
            } else if (pilih == 2) {
                testis = "film2";
            } else if (pilih == 3) {
                testis = "film3";
            } else {
                System.out.println("pilihan tidak terdaftar");
                continue;
            }

            System.out.println("Tiket yang ingin anda beli\t: " + testis);
            System.out.print("Berapa tiket\t\t\t: ");
            int jumlah = beli.nextInt();

            double hargaTotal = 0;
            switch (pilih) {
                case 1:
                    hargaTotal = jumlah * tiket1;
                    break;
                case 2:
                    hargaTotal = jumlah * tiket2;
                    break;
                case 3:
                    hargaTotal = jumlah * tiket3;
                    break;
                default:
                    System.out.println("Input tidak valid");
                    break;
            }
            double diskon = 0;
            double besarDiskon = 0;
            if (jumlah > 2) {
                diskon = 0.05;
                besarDiskon = hargaTotal * diskon;
                hargaTotal -= besarDiskon;
            }
            System.out.println("Rincian pembayaran");
            System.out.println("========================================");
            System.out.println("|1. Judul Film\t\t: " + testis);
            System.out.println("|2. Jumlah Tiket\t: " + jumlah + " tiket");
            System.out.println("|3. Jumlah diskon\t: Rp." + besarDiskon);
            System.out.println("|4. Total pembayaran\t: Rp." + hargaTotal);
            System.out.println("==========================================");
            System.out.println("Masukkan uang pembayaran: ");
            // System.out.println("Apakah anda ingin membeli lagi (y/n)? ");
            double jawab = beli.nextDouble();
            System.out.print("Kembalian: ");
            System.out.println(jawab - hargaTotal);

            // if (jawab.equalsIgnoreCase("n")) {
            // lanjut = false;
            // System.out.println("Terimakasih telah bertransaksi");
            // }
        }
    }
}