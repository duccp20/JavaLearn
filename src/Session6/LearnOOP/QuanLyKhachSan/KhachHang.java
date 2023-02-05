package Session6.LearnOOP.QuanLyKhachSan;

public class KhachHang {
    private String name;
    private int age;
    private String gender;
    private String numberPhone;

    public KhachHang(String name, int age, String gender, String numberPhone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
}
