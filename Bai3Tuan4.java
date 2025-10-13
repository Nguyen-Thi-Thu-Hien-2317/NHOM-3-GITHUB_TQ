import java.util.Scanner;
public class Bai3Tuan4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double so1, so2, ketQua;
        int luaChon;
        char tiepTuc;
        do 
        {
            System.out.print("Nhap so thu nhat: ");
            so1 = sc.nextDouble();
            System.out.print("Nhap so thu hai: ");
            so2 = sc.nextDouble();
            System.out.println("\nChon phep tinh:");
            System.out.println("1. Cong");
            System.out.println("2. Tru");
            System.out.println("3. Nhan");
            System.out.println("4. Chia");
            System.out.print("Nhap lua chon (1-4): ");
            luaChon = sc.nextInt();
            switch (luaChon) 
            {
                case 1:
                    ketQua = so1 + so2;
                    System.out.println("Ket qua = " + ketQua);
                    break;
                case 2:
                    ketQua = so1 - so2;
                    System.out.println("Ket qua = " + ketQua);
                    break;
                case 3:
                    ketQua = so1 * so2;
                    System.out.println("Ket qua = " + ketQua);
                    break;
                case 4:
                    if (so2 != 0) 
                    {
                        ketQua = so1 / so2;
                        System.out.println("Ket qua = " + ketQua);
                    } 
                    else 
                    {
                        System.out.println("Khong the chia cho 0!");
                    }
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
            System.out.print("\nBan co muon tinh tiep khong? (y/n): ");
            tiepTuc = sc.next().charAt(0);
        } 
        while (tiepTuc == 'y' || tiepTuc == 'Y');
        System.out.println("Chuong trinh ket thuc.");
        sc.close();
    }
}