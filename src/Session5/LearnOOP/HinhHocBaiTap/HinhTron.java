package Session5.LearnOOP.HinhHocBaiTap;

public class HinhTron extends HinhHoc {
    private double banKinh;

    public HinhTron(double area, double perimeter, double banKinh) {
        super(area, perimeter);
        this.banKinh = banKinh;
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }


    @Override
    public void chuVi() {
        this.perimeter = (2 * banKinh) * Math.PI;
        System.out.println(this.perimeter);
    }

    @Override
    public void dienTich() {
        this.area = Math.PI * Math.pow(banKinh, 2);
        System.out.println(this.area);
    }
}
