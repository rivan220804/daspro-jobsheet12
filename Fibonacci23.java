import java.util.Scanner;
public class Fibonacci23 {

    static int hitungMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        }
        return hitungMarmut(bulan - 1) + hitungMarmut(bulan - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan bulan ke-12 untuk mengetahui jumlah pasangan marmut: ");
        int bulan = 12;
        int jumlahMarmut = hitungMarmut(bulan);
        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah: " + jumlahMarmut);
    }
}
