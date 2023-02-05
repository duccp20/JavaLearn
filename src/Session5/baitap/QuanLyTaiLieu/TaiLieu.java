package Session5.baitap.QuanLyTaiLieu;

public abstract class TaiLieu {
    private String id;
    private String publisher;
    private int numRelease;

    public TaiLieu(String id, String publisher, int numRelease) {
        this.id = id;
        this.publisher = publisher;
        this.numRelease = numRelease;
    }

    public String getCode() {
        return id;
    }

    public void setCode(String id) {
        this.id = id;
    }

    public String getNamePublicCompany() {
        return publisher;
    }

    public void setNamePublicCompany(String publisher) {
        this.publisher = publisher;
    }

    public int getQuantityPublic() {
        return numRelease;
    }

    public void setQuantityPublic(int numRelease) {
        this.numRelease = numRelease;
    }

    @Override
    public abstract String toString();

}
