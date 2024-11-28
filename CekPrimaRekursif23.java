import java.util.Scanner;
public class CekPrimaRekursif23 {

    static int cekPrimaRekursif(int n, int i) {
        if (i == n) {
            return 1;  
        }
        if (n % i == 0) {
            return 0;  
        }
        return cekPrimaRekursif(n, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan n: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println(n + " bukan bilangan prima.");
        } else {
            int hasil = cekPrimaRekursif(n, 2); 
            if (hasil == 1) {
                System.out.println(n + " adalah bilangan prima.");
            } else {
                System.out.println(n + " bukan bilangan prima.");
            }
        }
    }
}
