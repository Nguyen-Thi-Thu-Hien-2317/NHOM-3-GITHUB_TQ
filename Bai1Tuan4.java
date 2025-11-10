package JAVA.T4_hdt;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen: ");
        int so = sc.nextInt();

        if (so > 0) {
            System.out.println(so + " la so duong");
        } else if (so < 0) {
            System.out.println(so + " la so am");
        } else {
            System.out.println("So vua nhap la 0");
        }

        sc.close();
    }
}
