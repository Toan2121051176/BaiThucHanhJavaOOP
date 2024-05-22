package baithuchanhchuong4;
import java.util.LinkedList;
import java.util.Scanner;

public class slide42 {
public class Date {
public static void main(String[] args)
 {
	 Scanner scanner new Scanner(System.in);
LinkedList<String> linkedList = new LinkedList<>();
linkedList.add("Tháng 1");
linkedList.add("Tháng 2");
linkedList.add("Tháng 3");
linkedList.add("Tháng 4");
linkedList.add("Tháng 5"); 
linkedList.add("Tháng 6");
linkedList.add("Tháng 7");
linkedList.add("Tháng 8");
linkedList.add("Tháng 9");
linkedList.add("Tháng 18");
linkedList.add("Tháng 11");
linkedList.add("Tháng 12");

System.out.println("Nhập vào chỉ số của phân tử cần lấy: ");

int index scanner.nextInt();

if ((index < 0) || (index > (linkedList.size()-1)))
	( System.out.println("Chỉ số cần lấy phải lớn hơn ở và nhỏ hơn (linkedList.size()-1));

} else {
String node linkedList.get(index);

System.out.println("Phân từ có chỉ số index trong linkedlist là node);"{
	String firstNode => LinkedList.getFirst()
	String lastNode linkedList.getLast()
	System.out.println(\"\\nPhân từ đầu tiên trong danh sách là firstNode : Phân từ cuối cùng trong danh sách là \"lastNode);
  }
