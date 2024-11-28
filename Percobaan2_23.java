import java.util.Scanner;
public class Percobaan2_23 {

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            System.out.print("1");
            return 1;
        } else {
            System.out.printf("%dx", x);
            return (x * hitungPangkat(x, y-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();

        System.out.print("Deret perhitungannya: ");
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.printf(" = %d", hasil);
    }
}