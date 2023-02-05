package Session6.LearnOOP.QuanLyKhachSanDIY;


import java.util.Date;

public class DatPhong {
    private String room;
    private Date startDate;
    private Date endDate;
    private String khachHang;

    public DatPhong(String room, Date startDate, Date endDate, String khachHang) {
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        this.khachHang = khachHang;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(String khachHang) {
        this.khachHang = khachHang;
    }
}
