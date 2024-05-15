package baithuchanhchuong4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class slide88 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> newHs= new HashMap<>();
		newHs.put("BG", "Bac Giang");
		newHs.put("TB","Thai Binh");
		newHs.put("TH","Thanh Hoa");
		newHs.put("DN","Dong nai");
		newHs.put("NA","nghe an");
        newHs.put("HN", "Ha Noi");
        newHs.put("HCM","Ho Chi Minh");
        newHs.put("DN","Da Nang");
		Set<Map.Entry<String,String>> setnewHs = newHs.entrySet();
		System.out.println(" cac entry co trong map la:");
		System.out.println(setnewHs);
		System.out.println("Nhap key can tim:");
		String key = sc.nextLine();
		System.out.println(key +":"+newHs.get(key));
	}
}
