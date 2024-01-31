package baithuchanh1701;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int n, soDu, tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Vào số nguyên dương bất kỳ:");
        n = sc.nextInt();
        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            tong += soDu;
        }
        System.out.print("Tổng các chữ số =" + tong);
    }
}