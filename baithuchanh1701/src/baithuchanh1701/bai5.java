package baithuchanh1701;
import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        
        while (tong <= 100) {
            System.out.print("Nhập vào một số nguyên: ");
            int so = sc.nextInt();
            tong += so;
        }
        
        System.out.print("Tổng các số đã nhập là: " + tong);
    }
}
