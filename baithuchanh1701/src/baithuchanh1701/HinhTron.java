package baithuchanh1701;
import java.util.Scanner;

public class HinhTron {
    final float PI = 3.14f;
    float r, cv, S;

    void NhapBankinh() {
        System.out.print("Nhập Bán kính =");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
    }

    public void tinhChuvi() {
        cv = 2 * r * PI;
    }

    public void tinhDientich() {
        S = PI * r * r;
    }

    public void inChuvi() {
        System.out.print("Chu vi =" + cv);
    }

    public void inDientich() {
        System.out.print("Dien Tich = " + S);
    }
}

