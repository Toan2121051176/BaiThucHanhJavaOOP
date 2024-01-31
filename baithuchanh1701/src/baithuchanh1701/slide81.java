package baithuchanh1701;
import java.util.Scanner;

public class slide81 {
public static void main(String[] args) {
int n, m;
Scanner scanner = new Scanner(System.in);
System.out.print("Nhập vào số dòng của mã trận:");
m = scanner.nextInt();
System.out.print("Nhập vào số cột của mã trận:");
n = scanner.nextInt();
int A[][] = new int[m][n];
System.out.print("Nhập vào các phần tử của mã trận:");
for (int i = 0; i<m; i++) {
for (int j = 0; j<n;j++) {
A[i][j] = scanner.nextInt();
}
}
int max = A[0][0];
for (int i = 0;i<m;i++) {
for(int j = 0; j<n;j++) {
if (max <A[i][j]) {
max = A[i][j];
}
}
}
System.out.print("Phần tử lớn nhất trong mã trận = " + max);
}
}
