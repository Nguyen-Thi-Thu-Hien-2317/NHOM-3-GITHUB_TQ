import java.util.Scanner; 
public class Bai2Tuan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Vui long nhap thong tin ca nhan cua ban ---");
        System.out.print("Nhap Ten cua ban: ");
        String ten = scanner.nextLine(); 
        System.out.print("Nhap Tuoi : ");
        int tuoi = scanner.nextInt(); 
        System.out.print("Nhap Chieu cao: ");
        double chieuCao = scanner.nextDouble(); 
        System.out.print("Ban co thich lap trinh khong (true/false)?: ");
        boolean thichLapTrinh = scanner.nextBoolean(); 
        System.out.print("Nhap mot ky tu dai dien : ");
        scanner.nextLine();
        char kyTuDaiDien = scanner.nextLine().charAt(0); 
        scanner.close();
        System.out.println("\n--- THÔNG TIN CÁ NHÂN ĐÃ LƯU ---");
        System.out.println("Ten: " + ten);
        System.out.println("Tuoi: " + tuoi + " tuổi");
        System.out.println("Chieu cao : " + chieuCao + " m");
        System.out.println("Thich lap trinh : " + thichLapTrinh);
        System.out.println("Ký tự đại diện : " + kyTuDaiDien);
    }
}