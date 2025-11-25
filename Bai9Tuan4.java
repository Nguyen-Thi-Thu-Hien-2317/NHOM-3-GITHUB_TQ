import java.util.ArrayList;
import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> danhSachSo = new ArrayList<>();

        System.out.print("Nhap so luong phan tu ban muon them vao danh sach: ");
        int soLuong = scanner.nextInt();

        System.out.println("Hay nhap cac so nguyen:");
        for (int i = 0; i < soLuong; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            int so = scanner.nextInt();
            danhSachSo.add(so);
        }

        System.out.println("\nDanh sach so nguyen ban da nhap la:");
        System.out.println(danhSachSo);

        System.out.println("\nIn tung phan tu cua danh sach:");
        for (int so : danhSachSo) {
            System.out.println(so);
        }
        scanner.close();
    }
}