package Session6.LearnOOP.BaiTap.QuanLyTuyenSinh;

public abstract class ThiSinh {
    private int id;
    private String name;
    private String address;
    private int priorityArea;

    public ThiSinh(int id, String name, String address, int priorityArea) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.priorityArea = priorityArea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriorityArea() {
        return priorityArea;
    }

    public void setPriorityArea(int priorityArea) {
        this.priorityArea = priorityArea;
    }

    public abstract String[] getSubjects();
}
