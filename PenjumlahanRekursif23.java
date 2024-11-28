import java.util.Scanner;
public class PenjumlahanRekursif23 {

    static int penjumlahanRekursif(int f) {
        if (f == 0) {
            return 0;
        } else {
            return f + penjumlahanRekursif(f - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan f: ");
        int f = sc.nextInt();

        int hasil = penjumlahanRekursif(f);
        System.out.println("Penjumlahan dari 1 sampai " + f + " adalah: " + hasil);
    }
}
