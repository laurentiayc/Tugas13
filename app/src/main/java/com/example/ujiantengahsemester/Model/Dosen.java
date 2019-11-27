package com.example.ujiantengahsemester.Model;
import com.google.gson.annotations.SerializedName;

public class Dosen {
    @SerializedName  ("id")
    private String id;
    @SerializedName("nidn")
    private String nidn;
    @SerializedName("namaDosen")
    private String namaDosen;
    @SerializedName("gelar")
    private String gelar;
    @SerializedName("email")
    private String email;
    @SerializedName("alamat")
    private String alamat;
    @SerializedName("foto")
    private String foto;

    public Dosen(String id,String nidn, String namaDosen, String gelar, String email, String alamat, String foto) {
        this.nidn = nidn;
        this.namaDosen = namaDosen;
        this.gelar = gelar;
        this.email = email;
        this.alamat = alamat;
        this.foto = foto;
        this.id = id;
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
//public class Dosen {
//    private String namaDosen;
//    private String nidn;
//    private String gelar;
//    private String emailDsn;
//    private String alamatDsn;
//    private int fotoDsn;
//
//    public Dosen(String namaDosen, String nidn, String gelar, String emailDsn, String alamatDsn, int fotoDsn) {
//        this.nidn = nidn;
//        this.namaDosen = namaDosen;
//        this.gelar = gelar;
//        this.emailDsn = emailDsn;
//        this.alamatDsn = alamatDsn;
//        this.fotoDsn = fotoDsn;
//    }
//
//    public String getNamaDosen() {
//        return namaDosen;
//    }
//
//    public void setNamaDosen(String namaDosen) {
//        this.namaDosen = namaDosen;
//    }
//
//    public String getNidn() {
//        return nidn;
//    }
//
//    public void setNidn(String nidn) {
//        this.nidn = nidn;
//    }
//
//    public String getGelar() {
//        return gelar;
//    }
//
//    public void setGelar(String gelar) {
//        this.gelar = gelar;
//    }
//
//    public String getEmailDsn() {
//        return emailDsn;
//    }
//
//    public void setEmailDsn(String emailDsn) {
//        this.emailDsn = emailDsn;
//    }
//
//    public String getAlamatDsn() {
//        return alamatDsn;
//    }
//
//    public void setAlamatDsn(String alamatDsn) {
//        this.alamatDsn = alamatDsn;
//    }
//
//    public int getFotoDsn() {
//        return fotoDsn;
//    }
//
//    public void setFotoDsn(int fotoDsn) {
//        this.fotoDsn = fotoDsn;
//    }
}
