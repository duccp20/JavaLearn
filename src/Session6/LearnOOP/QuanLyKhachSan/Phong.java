package Session6.LearnOOP.QuanLyKhachSan;

public class Phong {
    private String Id;
    private String roomType;
    private  Double price;
    private boolean hasbooked ;

    public Phong(String id, String roomType, Double price) {
        Id = id;
        this.roomType = roomType;
        this.price = price;
        this.hasbooked = false;
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
        return hasbooked;
    }

    public void setHasbooked(boolean hasbooked) {
        this.hasbooked = hasbooked;
    }
}
