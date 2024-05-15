package baithuchanhchuong4;
import java.util.LinkedList;

public class slide39 {

	public class Linked {

	public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();

	// Add objects to list

	list.add("Java");

	list.add("C++"); list.add("PHP");

	list.add("Java");

	System.out.println("vì dụ sử dụng phương thức addAll()");

	System.out.println("--

	
	LinkedList<String> list = new LinkedList<String>();

	listA.addAll(list);

	System.out.print("lista:");

	showList(listA);
	System.out.println("\nví dụ sử dụng phương thức retainAll()");

	System.out.println("--
	LinkedList<String> list = new LinkedList<String>();

	listB.add("Java");

	listA.retainAll(listB);

	System.out.print("listA:");

	showList(listA);

	System.out.println("\nví dụ sử dụng phương thức removeAll()"); System.out.println("----- -----");

	xóa những phần từ thuộc listB khỏi list

	list.removeAll(listB);

	System.out.print("list:");

	showlist(list);

	}

	public static void showList(LinkedList<String> list) { 

	} System.out.println();

	}

}
