package baithuchanh1701;
import java.util.Scanner;
public class bai6 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên dương: ");
        int n = scanner.nextInt();
        int giaiThua = 1;
        
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }
        
        System.out.println("Giai thừa của " + n + " là: " + giaiThua);
    }
}
