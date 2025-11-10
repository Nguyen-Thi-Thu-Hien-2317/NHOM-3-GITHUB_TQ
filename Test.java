public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng Sach
        SachTuan6 sach1 = new SachTuan6("S001", "Lap trinh Java", "Ts.Nguyen Tan Thuan", 2022, 150);
        SachTuan6 sach2 = new SachTuan6("S002", "Co so du lieu II", "Ths.Nguyen Thi Thu Quyen", 2022, 100);
        SachTuan6 sach3 = new SachTuan6();
        sach3.setMaSach("S003");
        sach3.setTieuDe("Thiet ke web");
        sach3.setTacGia("Ths.Tran Buu Dung");
        sach3.setNamXuatBan(2022);
        sach3.setSoLuong(120);

        // Tạo sách kế thừa từ Sach
        SachGiaoTrinhTuan6 gt1 = new SachGiaoTrinhTuan6("GT01", "Lap trinh C", "Ts.Hoang Thi My Le", 2023, 150, "Lap trinh", "Dai hoc");
        SachTieuThuyetTuan6 tt1 = new SachTieuThuyetTuan6("TT01", "Harry Potter", "J.K.Rowling", 2007, 800, "Phieu luu", true);

        // Tạo đối tượng QuanLySach để quản lý
        QuanLySachTuan6 ql = new QuanLySachTuan6();

        // Thêm sách vào danh sách quản lý
        ql.themSach(sach1);
        ql.themSach(sach2);
        ql.themSach(sach3);
        ql.themSach(gt1);
        ql.themSach(tt1);

        // Hiển thị toàn bộ danh sách
        System.out.println("---- DANH SACH SACH HIEN CO ----");
        ql.hienThiTatCa();

        // Tìm sách
        System.out.println("---- TIM SACH MA GT01 ----");
        SachTuan6 ketQua = ql.timSach("GT01");
        if (ketQua != null) {
            System.out.println(ketQua);
        }
        // Cập nhật số lượng
        System.out.println("---- CAP NHAT SO LUONG CHO SACH TT01 ----");
        ql.capNhatSoLuong("TT01", 25);
        //Hiển thị toàn bộ danh sách sau khi cập nhật
        System.out.println("---- DANH SACH TAT CA CAC LOAI SACH SAU KHI CAP NHAT ----");
        ql.hienThiTatCa();
        // Xóa sách
        System.out.println("---- XOA SACH MA S003 ----");
        ql.xoaSach("S003");
        ql.hienThiTatCa();
    }
}
