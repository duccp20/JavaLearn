package Session6.LearnOOP.QuanLyKhachSanDIY;

import java.util.Arrays;
import java.util.LinkedList;

public class KhachSan {
    private String name;
    private String address;
    private double numStar;
    private LinkedList<Phong> numRoom;

    public KhachSan() {
    }

    public KhachSan(String name, String address, double numStar) {
        this.name = name;
        this.address = address;
        this.numStar = numStar;
        this.numRoom = new LinkedList<Phong>();
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

    public LinkedList<Phong> getListRoomHasBook(LinkedList<Phong> list) {
        LinkedList<Phong> listRoomHasBooked = new LinkedList<>();
        for (Phong phong : list) {
            if (!phong.isHasbooked()) {
                listRoomHasBooked.add(phong);
            }
        }
        return listRoomHasBooked;
    }

    public void getIdRoomHasBooked(LinkedList<Phong> list) {
        LinkedList<Phong> roomHasBooked = getListRoomHasBook(list);
        for (Phong phong : roomHasBooked) {
            System.out.print("|| " + phong.getId() + " || ");
        }
    }

    public void setStateRoom(LinkedList<Phong> list, String id) {
        for (Phong ph : list) {
            if (ph.getId().equals(id)) {
                ph.setHasbooked(true);
            }
        }
    }

    public void setStateRoomById(LinkedList<Phong> list, String id) {
        for (Phong ph : list) {
            if (ph.getId().equals(id)) {
                if (ph.isHasbooked()) {
                    System.out.println("Phòng đã được đặt!!");
                } else {
                    System.out.println("Phòng còn trống!!");
                }
            }
        }
    }

    public double tinhRating(LinkedList<KhachHang> list) {
        int sum = 0;
        for (KhachHang kh: list ) {
            sum += kh.getRating();
        }
        double avg = (float) sum / list.size();
        return  avg;
    }
}