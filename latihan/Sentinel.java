package latihan;

import java.util.Scanner;
public class Sentinel {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int angka, jumlah=0, counter=0;
        double rata=0;

        do {
        System.out.println("Masukkan integer positif (-1 untuk berhenti): ");
        angka = sc.nextInt();
        if (angka >=0) {
            jumlah += angka;
            ++counter;
            }
        } while (angka != -1) ;
        rata = jumlah / counter;
        System.out.printf("Jumlah dari angka %d adalah %d\n", counter, jumlah);
        System.out.printf("Rata-rata dari %d adalah %.3f\n", counter, rata);;
        
    }   
}

