package Session5.baitap.QuanLyCanBo;

public class CongNhan extends CanBo{
    private int rank;

    public CongNhan(String name, int age, String gender, String address, int rank) {
        super(name, age, gender, address);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Công nhân || Họ và tên: " + this.getName() + " | Tuổi: " + this.getAge() +" | Giới tính: " + this.getGender() +" | Địa chỉ: " + this.getAddress() + " | Thứ bậc: " + this.getRank();
    }
}
