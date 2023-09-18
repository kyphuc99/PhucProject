public class bai30_OOP1 {
    public static void main(String[] args) {
        //khởi t ạo đối tượng thuộc class sinhvien
        /*SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien("Phúc");
        sv3.hienThiThongTin();
        SinhVien sv4 = new SinhVien("Phúc", 10);
        sv4.hienThiThongTin();*/
        int x = 1;
        int i;

        for (i = 0; i < 3; i = i + 2) {
            x = x + 1;
        }

        System.out.print(x);
        System.out.print(i);
    }

}
