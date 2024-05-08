package person;

import java.util.Scanner;

public class arrmy {
	public String HoTen;
	public int age;
	public float Diem;
	public String Que;

	public arrmy(String Que) {
		Que = Que;
	}

	public arrmy() {
		HoTen = "Chu Toàn";
		age = 21;
		Diem = 2.5f;
		Que = "HÀ Nội";

	}

	public void nhapTN()

	{
		System.out.print("Họ tên");
		Scanner sc = new Scanner(System.in);
		HoTen = sc.nextLine();
		System.out.println("Tuổi");
		age = sc.nextInt();
		System.out.print("Điểm");
		Diem = sc.nextFloat();
		System.out.println("quê");
		Que = sc.nextLine();
	}

	public void inthongtin() {
		System.out.println("Thông tin học sinh" + HoTen + "Tuổi" + age + "Điểm" + Diem + "Quê" + Que);
	}

	public void inthongtin(String FullName) {
		HoTen = FullName;

	}
	public static void main(String[] args) {
		arrmy ht = new arrmy();
		ht.nhapTN();
		ht.inthongtin();
		ht.inthongtin("Chu Thế Toàn");
	}

}
