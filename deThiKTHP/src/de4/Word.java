package de4;

public class Word {

    protected int id;
    protected String en, vn;

    public Word() {
    }

    public Word(int id, String en, String vn) {
        this.id = id;
        this.en = en;
        this.vn = vn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    public void hienThi() {
        System.out.printf("\n ID: %d", id);
        System.out.printf("\n En: %2s", en);
        System.out.printf("\n Vn: %2s", vn);
    }

//    @Override
//    public String toString() {
//        return id + " - " + en + " - " + vn;
//    }
}
