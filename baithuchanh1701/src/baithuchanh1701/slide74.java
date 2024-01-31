package baithuchanh1701;
import java.util.Scanner;

public class slide74 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        int A[] = new int[n];
        System.out.print("Nhập vào các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ":");
            A[i] = scanner.nextInt();
        }

        int Tong = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                Tong += A[i];
            }
        }

        System.out.print("Tổng: " + Tong);
    }
}
