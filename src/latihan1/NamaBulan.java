/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author hazkia
 */
import java.util.Scanner;
public class NamaBulan {

    public static void main (String [] denny){
        Scanner input = new Scanner (System.in);
        
        int bulan;
        
            System.out.print("Masukan Urutan Bulan : ");
            bulan = input.nextInt();
        
        switch (bulan){
            case 1:
                System.out.println("Bulan Januari");
                break;
            case 2:
                System.out.println("bulan Februari");
                break;
            case 3:
                System.out.println("Bulan Maret");
                break;
            case 4:
                System.out.println("Bulan April");
                break;
            case 5:
                System.out.println("Bulan Mei");
                break;
            case 6:
                System.out.println("Bulan Juni");
                break;
            case 7:
                System.out.println("Bulan Juli");
                break;
            case 8:
                System.out.println("Bulan Agustus");
                break;
            case 9:
                System.out.println("Bulan September");
                break;
            case 10:
                System.out.println("Bulan Oktober");
                break;
            case 11:
                System.out.println("Bulan November");
                break;
            case 12:
                System.out.println("Bulan Desember");
                break;
                
            default:
                System.out.println("Hasil tidak diketahui");
             
        }
    }
}
           
