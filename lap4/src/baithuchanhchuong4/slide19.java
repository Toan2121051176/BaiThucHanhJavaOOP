package lap4;

import java.util.ArrayList;

import java.util.ListIterator;

public class slide19 {
	public static void main(String[] agrs) {
		ArrayList<Float> arrListFloat = new ArrayList<Float>();
		arrListFloat.add(0.7f);
		arrListFloat.add(0.9f);
		arrListFloat.add(1.02f);
		arrListFloat.add(9.12f);
		Iterator<Float> iterator = arrListFloat.iterator();
		System.out.print("Cac phan tu co trong arrListFloat la :");
		While (iterator.hasNext()){
			System.out.print(iterator.next() + "\t");
		}
	}

}
