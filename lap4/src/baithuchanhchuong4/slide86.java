package baithuchanhchuong4;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class slide86 {
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            HashMap<String,String> newHs= new HashMap<>();
            newHs.put("HN", "Ha Noi");
            newHs.put("HCM","Ho Chi Minh");
            newHs.put("DN","Da Nang");
            Set<Map.Entry<String,String>> SetnewHs = newHs.entrySet();
            System.out.println(" cac entry co trong map la:");
            System.out.println(SetnewHs);
        
    }
    }
