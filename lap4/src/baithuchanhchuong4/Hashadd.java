package baithuchanhchuong4;
import java.util.HashSet;
import java.util.Scanner;
public class HashAdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> hashSetInteger = new HashSet<>();

        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);
        System.out.println("Các phần tử trong hashSetInteger: ");
        System.out.println(hashSetInteger);
        System.out.println("Nhập phần tử cần thêm: ");

        int number = scanner.nextInt();
        if (!hashSetInteger.contains(number)) {
            hashSetInteger.add(number);
            System.out.println("Thêm thành công!");
            System.out.println("Các phần tử trong hashSetInteger sau khi thêm: ");
            System.out.println(hashSetInteger);
        } else {
            System.out.println("Phần tử " + number + " đã tồn tại!");
        }
    }
}



