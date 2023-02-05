package Session6.LearnOOP.BaiTap.QuanLyTuyenSinh;

public class ThiSinhKhoiB extends ThiSinh{
    private static final String[] subjects = {"Toán", "Hóa", "Sinh"};
    public ThiSinhKhoiB(int id, String name, String address, int priorityArea) {
        super(id, name, address, priorityArea);
    }

    @Override
    public String[] getSubjects() {
        return subjects;
    }
}
