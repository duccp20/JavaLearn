package Session6.LearnOOP.QuanLyKhachSan;

//import java.util.String;

import java.util.Date;

public class DatPhong {
    private Date startString;
    private Date endString;
    private String room;
    private String khachHang;

    public DatPhong(Date startString, Date endString, String room, String khachHang) {
        this.startString = startString;
        this.endString = endString;
        this.room = room;
        this.khachHang = khachHang;
    }

    public Date getStartString() {
        return startString;
    }

    public void setStartString(Date startString) {
        this.startString = startString;
    }

    public Date getEndString() {
        return endString;
    }

    public void setEndString(Date endString) {
        this.endString = endString;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(String khachHang) {
        this.khachHang = khachHang;
    }


}
