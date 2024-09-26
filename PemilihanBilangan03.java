import java.util.Scanner;
public class PemilihanBilangan03 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();
      
        String hasil = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println(angka + " adalah " + hasil);
    } 
}
