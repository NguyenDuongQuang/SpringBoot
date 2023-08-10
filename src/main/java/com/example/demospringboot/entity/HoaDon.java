package com.example.demospringboot.entity;

import com.example.demospringboot.viewmodel.HoaDonVM;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "HoaDon")
@Getter
@Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
public class HoaDon {
    @Id
    @GeneratedValue(strategy =  GenerationType.UUID)
    @Column(name = "Id")
    private UUID Id;
    @Column(name = "Ma")
    private String Ma;
    @Column(name = "NgayTao")
    private Date NgayTao;
    @Column(name = "NgayThanhToan")
    private Date NgayThanhToan;
    @Column(name = "NgayShip")
    private Date NgayShip;
    @Column(name = "NgayNhan")
    private Date NgayNhan;
    @Column(name = "TinhTrang")
    private  int TinhTrang;
    @Column(name = "TenNguoiNhan")
    private String TenNguoiNhan;
    @Column(name = "DiaChi")
    private String DiaChi;
    @Column(name = "Sdt")
    private String Sdt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdKH" , referencedColumnName = "Id")
    private  KhachHang khachHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdNV" , referencedColumnName = "Id")
    private NhanVien nhanVien;
    public void loadFormViewModel(HoaDonVM vm){
        this.setDiaChi(vm.getDiaChi());
        this.setMa(vm.getMa());
        this.setSdt(vm.getSdt());
        this.setTenNguoiNhan(vm.getTenNguoiNhan());
        this.setTinhTrang(vm.getTinhTrang());
        this.setNgayNhan(vm.getNgayNhan());
        this.setNgayTao(vm.getNgayTao());
        this.setNgayShip(vm.getNgayShip());
        this.setNgayThanhToan(vm.getNgayThanhToan());
        this.setSdt(vm.getSdt());
    }

}
