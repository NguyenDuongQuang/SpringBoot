package com.example.demospringboot.viewmodel;

import com.example.demospringboot.entity.CuaHang;
import jakarta.validation.constraints.NotBlank;

public class CuaHangVM {
    @NotBlank
    private String Ma;
    @NotBlank
    private String Ten ;
    @NotBlank
    private String  DiaChi;
    @NotBlank
    private String  ThanhPho;
    @NotBlank
    private String  QuocGia;
    

    public CuaHangVM() {
    }

    public CuaHangVM(String ma, String ten, String diaChi, String thanhPho, String quocGia) {
        Ma = ma;
        Ten = ten;
        DiaChi = diaChi;
        ThanhPho = thanhPho;
        QuocGia = quocGia;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String ma) {
        Ma = ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getThanhPho() {
        return ThanhPho;
    }

    public void setThanhPho(String thanhPho) {
        ThanhPho = thanhPho;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String quocGia) {
        QuocGia = quocGia;
    }
    public void loadFromDomainModel(CuaHang domain)
    {
        this.setTen( domain.getTen() );
        this.setMa( domain.getMa() );
        this.setDiaChi( domain.getDiaChi() );
        this.setThanhPho( domain.getThanhPho() );
        this.setQuocGia( domain.getQuocGia() );
    }

}
