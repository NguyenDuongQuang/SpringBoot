package com.example.demospringboot.viewmodel;

import com.example.demospringboot.entity.HoaDon;
import com.example.demospringboot.entity.KhachHang;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HoaDonVM {
    private String Ma;
    private Date NgayTao;
    private Date NgayThanhToan;
    private Date NgayShip;
    private Date NgayNhan;
    private  int TinhTrang;
    private String TenNguoiNhan;
    private String DiaChi;
    private String Sdt;

    public void loadFormDoMainModel(HoaDon domain){
        this.setDiaChi(domain.getDiaChi());
        this.setMa(domain.getMa());
        this.setSdt(domain.getSdt());
        this.setTenNguoiNhan(domain.getTenNguoiNhan());
        this.setTinhTrang(domain.getTinhTrang());
        this.setNgayNhan(domain.getNgayNhan());
        this.setNgayTao(domain.getNgayTao());
        this.setNgayShip(domain.getNgayShip());
        this.setNgayThanhToan(domain.getNgayThanhToan());
        this.setSdt(domain.getSdt());
    }
}
