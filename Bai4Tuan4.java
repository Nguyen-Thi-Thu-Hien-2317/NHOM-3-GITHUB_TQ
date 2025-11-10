import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen duong n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Vui long nhap mot so nguyen duong.");
        } else {
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("Tong cac so tu 1 den " + n + " la: " + sum);
        }
        scanner.close();
    }
}