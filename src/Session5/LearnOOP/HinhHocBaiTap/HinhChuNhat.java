package Session5.LearnOOP.HinhHocBaiTap;

public class HinhChuNhat extends HinhHoc {
    private double width;
    private double height;

    public HinhChuNhat(double area, double perimeter, double width, double height) {
        super(area, perimeter);
        this.width = width;
        this.height = height;
    }

    public HinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void chuVi() {
        this.perimeter = (width + height) * 2;
        System.out.println(this.perimeter);
    }

    @Override
    public void dienTich() {
        this.area = width * height;
        System.out.println(this.area);
    }
}
