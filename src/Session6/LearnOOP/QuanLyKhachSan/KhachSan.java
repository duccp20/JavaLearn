package Session6.LearnOOP.QuanLyKhachSan;

import java.util.LinkedList;

public class KhachSan {
    private String name;
    private String address;
    private double numStar;
    private int numRoom;
    private LinkedList<Phong> listPhong = new LinkedList<>();
    public KhachSan(String name, String address, double numStar, int numRoom) {
        this.name = name;
        this.address = address;
        this.numStar = numStar;
        this.numRoom = numRoom;
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

    public double getNumStar() {
        return numStar;
    }

    public void setNumStar(int numStar) {
        this.numStar = numStar;
    }

    public int getNumRooml() {
        return numRoom;
    }

    public void setNumRooml(int numRooml) {
        this.numRoom = numRooml;
    }

    public void addRoom(Phong phong) {
        this.listPhong.add(phong);
    }


}
