package com.example.demospringboot.entity;

import com.example.demospringboot.viewmodel.NhanVienVM;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "NhanVien")
public class NhanVien {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "TenDem")
    private String tenDem;

    @Column(name = "Ho")
    private String ho;

    @Column(name = "GioiTinh")
    private String gioiTinh;

    @Column(name = "NgaySinh")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private String ngaySinh;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "Sdt")
    private String sdt;

    @Column(name = "MatKhau")
    private String matKhau;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdCH", referencedColumnName = "id")
    private CuaHang cuaHang;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "IdCV", referencedColumnName = "id")
    private ChucVu chucVu;

    public void loadFormViewModel(NhanVienVM vm) {
        this.setMa(vm.getMa());
        this.setTen(vm.getTen());
        this.setTenDem(vm.getTenDem());
        this.setHo(vm.getHo());
        this.setGioiTinh(vm.getGioiTinh());
        this.setNgaySinh(vm.getNgaySinh());
        this.setDiaChi(vm.getDiaChi());
        this.setSdt(vm.getSdt());
        this.setMatKhau(vm.getMatKhau());
        this.setCuaHang(vm.getDanhSachCH());
        this.setChucVu(vm.getDanhSachCV());
    }

}
