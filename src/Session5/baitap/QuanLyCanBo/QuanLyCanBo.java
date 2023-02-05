package Session5.baitap.QuanLyCanBo;

import java.util.LinkedList;


public class QuanLyCanBo {
    private LinkedList<CanBo> listCanBo = new LinkedList<>();

    public QuanLyCanBo (){}

    public LinkedList<CanBo> getListCanBo() {
        return listCanBo;
    }

    public void setListCanBo(LinkedList<CanBo> listCanBo) {
        this.listCanBo = listCanBo;
    }

    public void addCanBo(CanBo canBo) {
        listCanBo.add(canBo);
    }

    public void findByName(String name) {
        for (CanBo cb : listCanBo) {
            if (cb.getName().equals(name)) {
                System.out.println(cb.toString());
            }
        }
    }

    public void displayAll() {
        for (CanBo cb : listCanBo) {
            System.out.println(cb.toString());
        }
    }

}