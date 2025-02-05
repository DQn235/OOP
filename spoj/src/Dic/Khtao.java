class khoi tạo từ điển

package de4;

import java.util.ArrayList;

public class KhoiTao {
    ArrayList<Word> list;
    
    public KhoiTao() {
        list = new ArrayList<>();
        
        list.add(new Word(1, "one", "một"));
        list.add(new Word(2, "two", "hai"));
        list.add(new Word(3, "three", "ba"));
        list.add(new Word(4, "four", "bốn"));
        list.add(new Word(5, "five", "năm"));
        list.add(new Word(6, "six", "sáu"));
        list.add(new Word(7, "seven", "bảy"));
        list.add(new Word(8, "eight", "tám"));
        list.add(new Word(9, "nine", "chín"));
        list.add(new Word(10, "ten", "mười"));
        list.add(new Word(11, "eleven", "mười một"));
        list.add(new Word(12, "twelve", "mười hai"));
    }

    public KhoiTao(ArrayList<Word> list) {
        this.list = list;
    }

    public ArrayList<Word> getTuDien() {
        return list;
    }

    public void setTuDien(ArrayList<Word> list) {
        this.list = list;
    }
    
}
