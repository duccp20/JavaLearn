package Session5.LearnOOP.HinhHocBaiTap;

public class HinhHoc {
    //Viết một lớp định nghĩa một hình học (ví dụ: hình tròn, hình chữ nhật)
    // và các phương thức tính diện tích và chu vi.
    protected double area;
    protected double perimeter;

    public HinhHoc(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public HinhHoc() {
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void chuVi() {}
    public void dienTich() {}
}




