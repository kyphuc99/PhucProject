public class SinhVien {
    //thuộc tính (giống với biến)
    private String hoTen;
    private double diem;

    //4.1 contructor mặc định
    //khởi tạo các giá trị mặc định
    //ngay khi đối tượng được tạo ra
    //Alt + ins (constructor)

    public SinhVien() {
        hoTen="No name";
        diem=0.0;
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    //4.2 constructor có đối số
    public SinhVien(String hoTen){
        this.hoTen = hoTen;
    }

    //phương thức (các hàm)
    //phương thức ko có kiểu trả về
    public void hienThiThongTin(){
        System.out.println(hoTen +" : "+ diem);
    }
}
