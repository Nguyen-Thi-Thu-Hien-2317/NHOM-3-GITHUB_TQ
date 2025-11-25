import java.util.Scanner;
public class Bai4Tuan3
{
    public static void main(String[] args) 
    {
        // Khai báo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        // Nhập thông tin từ người dùng
        System.out.print("Nhap so tien gui ban dau (VND): ");
        double soTienGoc = scanner.nextDouble();
        System.out.print("Nhap lai suat hang nam (%): ");
        double laiSuatNam = scanner.nextDouble();
        System.out.print("Nhap so thang gui: ");
        int soThangGui = scanner.nextInt();
        // Đóng đối tượng Scanner để tránh rò rỉ bộ nhớ
        scanner.close();
        // Chuyển đổi lãi suất từ % sang số thập phân
        double laiSuatThapPhan = laiSuatNam / 100.0;
        // Chuyển đổi số tháng gửi sang số năm
        double soNamGui = soThangGui / 12.0;
        // Tính số tiền lãi
        // Công thức: Tiền lãi = Tiền gốc * Lãi suất hàng năm * Số năm
        double soTienLai = soTienGoc * laiSuatThapPhan * soNamGui;
        // Tính tổng số tiền cuối kỳ (gốc + lãi)
        double tongTienCuoiKy = soTienGoc + soTienLai;
        // In kết quả ra màn hình
        System.out.println("----------------------------------------");
        System.out.println("Ket qua tinh toan:");
        System.out.printf("So tien lai: %.2f VND\n", soTienLai);
        System.out.printf("Tong so tien cuoi ky: %.2f VND\n", tongTienCuoiKy);
        System.out.println("----------------------------------------");
    }
}