package Session6.LearnOOP.QuanLyKhachSanDIY;

public class KhachHang {
    private String name;
    private int age;
    private String gender;
    private String numberPhone;

    public int rating;

    public KhachHang(String name, int age, String gender, String numberPhone, int rating) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.numberPhone = numberPhone;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
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
