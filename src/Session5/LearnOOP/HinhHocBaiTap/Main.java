package Session5.LearnOOP.HinhHocBaiTap;

public class Main {
    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron(4);
        System.out.println("Chu vi hình tròn: ");
        hinhTron.chuVi();
        System.out.println("Diện tích hình tròn: ");
        hinhTron.dienTich();
        HinhChuNhat hinhChuNhat = new HinhChuNhat(5,4);
        System.out.println("Chu vi hình chữ nhật: ");
        hinhChuNhat.chuVi();
        System.out.println("Diện tích hình chữ nhật: ");
        hinhChuNhat.dienTich();
    }
}
