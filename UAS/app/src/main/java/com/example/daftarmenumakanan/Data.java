package com.example.daftarmenumakanan;

public class Data {
    private String nim;
    private String nama;
    private String key;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void getNim(String trim) {
    }

    public String toPrint() {
        return this.nim+" "+nama;
    }
}
