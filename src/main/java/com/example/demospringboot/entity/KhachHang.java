package com.example.demospringboot.entity;

import com.example.demospringboot.viewmodel.KhachHangVM;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.UUID;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "KhachHang")
public class KhachHang {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "Ma")
    private String Ma;

    @Column(name = "Ten")
    private String Ten;

    @Column(name = "TenDem")
    private String TenDem;

    @Column(name = "Ho")
    private String Ho;

    @Column(name = "NgaySinh")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private String NgaySinh;

    @Column(name = "Sdt")
    private String Sdt;

    @Column(name = "DiaChi")
    private String DiaChi;

    @Column(name = "ThanhPho")
    private String ThanhPho;

    @Column(name = "QuocGia")
    private String QuocGia;

    @Column(name = "MatKhau")
    private String MatKhau;

    public void loadFormViewModel(KhachHangVM vm) {
        this.setMa(vm.getMa());
        this.setTen(vm.getTen());
        this.setTenDem(vm.getTenDem());
        this.setHo(vm.getHo());
        this.setNgaySinh(vm.getNgaySinh());
        this.setSdt(vm.getSdt());
        this.setDiaChi(vm.getDiaChi());
        this.setThanhPho(vm.getThanhPho());
        this.setQuocGia(vm.getQuocGia());
        this.setMatKhau(vm.getMatKhau());
    }
}
