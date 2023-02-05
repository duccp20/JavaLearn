package Session6.LearnOOP.BaiTap.QuanLyTuyenSinh;

import java.util.ArrayList;
import java.util.Arrays;


public class TuyenSinh {
    private ArrayList<ThiSinh> listThiSinh;

    public TuyenSinh() {
        this.listThiSinh = new ArrayList<ThiSinh>();
    }

    public ArrayList<ThiSinh> getListThiSinh() {
        return listThiSinh;
    }

    public void setListThiSinh(ArrayList<ThiSinh> listThiSinh) {
        this.listThiSinh = listThiSinh;
    }

    public void add(ThiSinh ts) {
        listThiSinh.add(ts);
    }

    public ThiSinh searchByID(int id) {
        for (ThiSinh c : listThiSinh) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public void display(int id) {
        ThiSinh thiSinh = searchByID(id);
        if (thiSinh != null) {
            System.out.println("Thông tin thí sinh:");
            System.out.println("Số báo danh: " + thiSinh.getId());
            System.out.println("Tên: " + thiSinh.getName());
            System.out.println("Địa chỉ: " + thiSinh.getAddress());
            System.out.println("Khu vực ưu tiên: " + thiSinh.getPriorityArea());

            if (thiSinh instanceof ThiSinhKhoiA) {
                System.out.println("Môn khối A : " + Arrays.toString(((ThiSinhKhoiA) thiSinh).getSubjects()));
            } else if (thiSinh instanceof ThiSinhKhoiB) {
                System.out.println("Môn khối B: " + Arrays.toString(((ThiSinhKhoiB) thiSinh).getSubjects()));
            } else if (thiSinh instanceof ThiSinhKhoiC) {
                System.out.println("Môn khối C: " + Arrays.toString(((ThiSinhKhoiC) thiSinh).getSubjects()));
            }
        }
    }

}
