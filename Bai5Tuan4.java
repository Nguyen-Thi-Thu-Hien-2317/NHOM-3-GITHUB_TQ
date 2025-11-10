import java.util.Scanner;

public class Bai5Tuan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen: ");
        int n = scanner.nextInt();

        if (laSoNguyenTo(n))
            System.out.println(n + " la so nguyen to.");
        else
            System.out.println(n + " khong phai la so nguyen to.");

        scanner.close();
    }

    public static boolean laSoNguyenTo(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }
}