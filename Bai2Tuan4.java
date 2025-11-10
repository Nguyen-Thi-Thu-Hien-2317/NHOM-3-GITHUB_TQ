import java.util.Scanner;

public class Baitap2Tuan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so  a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap so b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap so c: ");
        double c = scanner.nextDouble();

        double minNumber = a;

        if (b < minNumber) {
            minNumber = b;
        }
        if (c < minNumber) {
            minNumber = c;
        }

        System.out.println("So nho nhat trong ba so la: " + minNumber);
        scanner.close();
    }
}