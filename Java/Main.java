package latihanbab8;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String x;
        do{
        Scanner in = new Scanner(System.in);
        System.out.println("---------");
        System.out.println("Cek Angka");
        System.out.println("---------");
        System.out.print("Masukkan Angka : ");
        double angka = in.nextDouble();
        Class a = new Class();
         if ((angka % 2 != -1) && (angka % 2 != 0) && (angka % 2 != 1)){
             a.doble();
         }
         else{
             a.integer();
         }
         System.out.print("Ingin memasukan lagi ?(y/n)");
         x=in.next();
        }while(x.equalsIgnoreCase("Y"));
    }
}
