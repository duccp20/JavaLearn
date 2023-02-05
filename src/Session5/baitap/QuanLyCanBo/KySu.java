package Session5.baitap.QuanLyCanBo;

public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu(String name, int age, String gender, String address, String nganhDaoTao) {
        super(name, age, gender, address);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "Kỹ sư || Họ và tên: " + this.getName() + " | Tuổi: " + this.getAge() +" | Giới tính: " + this.getGender() +" | Địa chỉ: " + this.getAddress() + " | Ngành đào tạo: " + this.nganhDaoTao;
    }
}
