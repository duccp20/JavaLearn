package Session6.LearnOOP.BaiTap.QuanLyTuyenSinh;

public class ThiSinhKhoiC extends ThiSinh{
    private static final String[] subjects = {"Văn", "Sử", "Địa"};
    public ThiSinhKhoiC(int id, String name, String address, int priorityArea) {
        super(id, name, address, priorityArea);
    }

    @Override
    public String[] getSubjects() {
        return subjects;
    }
}
