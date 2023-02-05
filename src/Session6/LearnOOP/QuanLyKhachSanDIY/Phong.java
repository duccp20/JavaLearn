package Session6.LearnOOP.QuanLyKhachSanDIY;

import java.util.LinkedList;

public class Phong {
    private String Id;
    private String roomType;
    private Double price;
    private boolean booked;

    public Phong() {}
    public Phong(String id, String roomType, Double price) {
        Id = id;
        this.roomType = roomType;
        this.price = price;
        this.booked = false;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isHasbooked() {
        return booked;
    }

    public void setHasbooked(boolean booked) {
        this.booked = booked;
    }



}

