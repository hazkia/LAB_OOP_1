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
public class Ascending {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a,b,c,d;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Angka Pertama : ");
        a = input.nextInt();
        System.out.print("Masukan Angka Kedua : ");
        b = input.nextInt();
        System.out.print("Masukan Angka Ketiga : ");
        c = input.nextInt();
 
        if (a > b){
            d = a;
            a = b;
            b = d;
        }
        else if (a > c){
            d = a;
            a = c;
            c = d;
        }
        if (b > c){
            d = b;
            b = c;
            c = d;                       
        }
        System.out.println ("Hasil Pengurutan Angka");
        System.out.println(a+" | "+b+" | "+c);
        
        
    }
    
}
