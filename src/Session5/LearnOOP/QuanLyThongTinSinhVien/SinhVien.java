package Session5.LearnOOP.QuanLyThongTinSinhVien;

public class SinhVien {
//    Viết một lớp quản lý thông tin sinh viên với các thuộc tính
//    như tên, tuổi, điểm và các phương thức như nhập thông tin,
//    hiển thị thông tin và tính điểm trung bình.
    private String name;
    private int age;
    private double[] point;

    public SinhVien(String name, int age, double[] point) {
        this.name = name;
        this.age = age;
        this.point = point ;
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


    public void setPoint(double[] point) {
        this.point = point;
    }

    public double[] getPoint() {
        return point;
    }

    public void pointOutPut() {
        System.out.println(this.name + " " + this.age + " " + this.tinhDiemTrungBinh());
    }

    public double tinhDiemTrungBinh() {
        double sum = 0;
        double avg;
        for (Double e: point) {
            sum += e;
        }
        avg = (float) sum / point.length;
        return avg;
    }
}
