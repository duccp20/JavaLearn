package Session5.baitap.QuanLyCanBo;

public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien(String name, int age, String gender, String address, String congViec) {
        super(name, age, gender, address);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    @Override
    public String toString() {
        return "Nhân viên || Họ và tên: " + this.getName() + " | Tuổi: " + this.getAge() +" | Giới tính: " + this.getGender() +" | Địa chỉ: " + this.getAddress() + " | Công việc: " + this.getCongViec();
    }
}
