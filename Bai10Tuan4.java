import java.util.ArrayList;
import java.util.Scanner;
public class Bai10Tuan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> danhSach = new ArrayList<>();
        // Nhap danh sach ban dau
        System.out.print("Nhap so luong phan tu ban dau: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int x = sc.nextInt();
            danhSach.add(x);
        }
        System.out.println("\nDanh sach ban dau: " + danhSach);
        // Them phan tu
        System.out.print("\nNhap phan tu muon them: ");
        int giaTriThem = sc.nextInt();
        System.out.print("Nhap vi tri muon them (0 -> " + danhSach.size() + "): ");
        int viTriThem = sc.nextInt();
        if (viTriThem >= 0 && viTriThem <= danhSach.size()) {
            danhSach.add(viTriThem, giaTriThem);
            System.out.println("Danh sach sau khi them: " + danhSach);
        } else {
            System.out.println("Vi tri them khong hop le!");
        }
        // Xoa phan tu
        System.out.print("\nNhap vi tri muon xoa (0 -> " + (danhSach.size() - 1) + "): ");
        int viTriXoa = sc.nextInt();
        if (viTriXoa >= 0 && viTriXoa < danhSach.size()) {
            danhSach.remove(viTriXoa);
            System.out.println("Danh sach sau khi xoa: " + danhSach);
        } else {
            System.out.println("Vi tri xoa khong hop le!");
        }
        sc.close();
    }
}
