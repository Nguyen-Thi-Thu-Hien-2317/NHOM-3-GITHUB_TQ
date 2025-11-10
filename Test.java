import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach ql = new QuanLySach();
        int chon;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Nhap sach giao trinh");
            System.out.println("2. Nhap sach tieu thuyet");
            System.out.println("3. Hien thi toan bo sach");
            System.out.println("4. Tim kiem theo ma sach");
            System.out.println("5. Cap nhat thong tin sach");
            System.out.println("6. Xoa sach theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1: {
                    System.out.print("Nhap so luong sach giao trinh: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("\n--- Nhap sach giao trinh thu " + (i + 1) + " ---");
                        System.out.print("Ma sach: ");
                        String ma = sc.nextLine();
                        System.out.print("Tua de: ");
                        String td = sc.nextLine();
                        System.out.print("Tac gia: ");
                        String tg = sc.nextLine();
                        System.out.print("Nam XB: ");
                        int nam = sc.nextInt();
                        System.out.print("So luong: ");
                        int sl = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Mon hoc: ");
                        String mh = sc.nextLine();
                        System.out.print("Cap do: ");
                        String cd = sc.nextLine();

                        ql.themSach(new SachGiaoTrinh(ma, td, tg, nam, sl, mh, cd));
                    }
                    break;
                }

                case 2: {
                    System.out.print("Nhap so luong sach tieu thuyet: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("\n--- Nhap tieu thuyet thu " + (i + 1) + " ---");
                        System.out.print("Ma sach: ");
                        String ma = sc.nextLine();
                        System.out.print("Tua de: ");
                        String td = sc.nextLine();
                        System.out.print("Tac gia: ");
                        String tg = sc.nextLine();
                        System.out.print("Nam XB: ");
                        int nam = sc.nextInt();
                        System.out.print("So luong: ");
                        int sl = sc.nextInt();
                        sc.nextLine();
                        System.out.print("The loai: ");
                        String tl = sc.nextLine();
                        System.out.print("Co phai series khong (true/false): ");
                        boolean sr = sc.nextBoolean();
                        sc.nextLine();

                        ql.themSach(new SachTieuThuyet(ma, td, tg, nam, sl, tl, sr));
                    }
                    break;
                }

                case 3:
                    ql.hienThiTatCa();
                    break;

                case 4: {
                    System.out.print("Nhap ma sach can tim: ");
                    String ma = sc.nextLine();
                    Sach kq = ql.timKiem(ma);
                    if (kq != null)
                        System.out.println("Tim thay: " + kq.toString());
                    else
                        System.out.println("Khong tim thay sach!");
                    break;
                }

                case 5: {
                    System.out.print("Nhap ma sach can cap nhat: ");
                    String ma = sc.nextLine();
                    Sach cu = ql.timKiem(ma);
                    if (cu == null) {
                        System.out.println("Khong tim thay sach de cap nhat!");
                    } else {
                        System.out.println("Nhap thong tin moi:");
                        System.out.print("Tua de: ");
                        String td = sc.nextLine();
                        System.out.print("Tac gia: ");
                        String tg = sc.nextLine();
                        System.out.print("Nam XB: ");
                        int nam = sc.nextInt();
                        System.out.print("So luong: ");
                        int sl = sc.nextInt();
                        sc.nextLine();
                        if (cu instanceof SachGiaoTrinh) {
                            System.out.print("Mon hoc: ");
                            String mh = sc.nextLine();
                            System.out.print("Cap do: ");
                            String cd = sc.nextLine();
                            ql.capNhat(ma, new SachGiaoTrinh(ma, td, tg, nam, sl, mh, cd));
                        } else {
                            System.out.print("The loai: ");
                            String tl = sc.nextLine();
                            System.out.print("Series (true/false): ");
                            boolean sr = sc.nextBoolean();
                            sc.nextLine();
                            ql.capNhat(ma, new SachTieuThuyet(ma, td, tg, nam, sl, tl, sr));
                        }
                        System.out.println("Da cap nhat thanh cong!");
                    }
                    break;
                }

                case 6: {
                    System.out.print("Nhap ma sach can xoa: ");
                    String ma = sc.nextLine();
                    if (ql.xoaSach(ma))
                        System.out.println("Da xoa thanh cong!");
                    else
                        System.out.println("Khong tim thay ma sach!");
                    break;
                }

                case 0:
                    System.out.println("Thoat chuong trinh. Tam biet!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);
        sc.close();
    }
}