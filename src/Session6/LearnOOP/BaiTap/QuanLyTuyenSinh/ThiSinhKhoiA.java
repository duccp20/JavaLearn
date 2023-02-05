package Session6.LearnOOP.BaiTap.QuanLyTuyenSinh;

public class ThiSinhKhoiA extends ThiSinh{
    private static final String[] subjects = {"Toán", "Lý", "Hóa"};
    public ThiSinhKhoiA(int id, String name, String address, int priorityArea) {
        super(id, name, address, priorityArea);
    }


    @Override
    public String[] getSubjects() {
        return subjects;
    }
}
