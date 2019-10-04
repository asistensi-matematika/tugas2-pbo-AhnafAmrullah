package pbo_asis_soal_a;
import java.util.Scanner;
public class TesBilanganKomplek {
 
    public static void main(String [] args){
    
    System.out.print("Masukkan Bilangan Riil 1\t\t= ");
    Scanner Riil1 = new Scanner(System.in);
    double R1 = Riil1.nextDouble();
    
    System.out.print("Masukkan Bilangan Imajiner 1\t\t= ");
    Scanner Imajiner1 = new Scanner(System.in);
    double I1 = Imajiner1.nextDouble();
    
    System.out.print("Masukkan Bilangan Riil 2\t\t= ");
    Scanner Riil2 = new Scanner(System.in);
    double R2 = Riil2.nextDouble();
    
    System.out.print("Masukkan Bilangan Imajiner 2\t\t= ");
    Scanner Imajiner2 = new Scanner(System.in);
    double I2 = Imajiner2.nextDouble();
    
    BilanganKomplek BK1   = new BilanganKomplek(R1, I1);
    BilanganKomplek BK2   = new BilanganKomplek(R2, I2);
    System.out.println("Bilangan Komplek 1\t\t\t= "+ BK1 + "\nBilangan Komplek 2\t\t\t= "+ BK2);
    System.out.println("Perkalian Bilangan Komplek 1 dan 2\t= " + BK1.multiply(BK2));   
    }
}