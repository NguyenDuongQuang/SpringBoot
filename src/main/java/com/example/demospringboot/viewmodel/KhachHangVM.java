package com.example.demospringboot.viewmodel;

import com.example.demospringboot.entity.KhachHang;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class KhachHangVM {
    @NotBlank(message = "Chưa nhập mã")
    private String ma;

    @NotBlank(message = "Chưa nhập tên")
    private String ten;

    @NotBlank(message = "Chưa nhập tên đệm")
    private String tenDem;

    @NotBlank(message = "Chưa nhập họ")
    private String ho;

    @NotBlank(message = "Chưa nhập ngày sinh")
    private String ngaySinh;

    @NotBlank(message = "Chưa nhập sđt")
    private String sdt;

    @NotBlank(message = "Chưa nhập địa chỉ")
    private String diaChi;

    private String thanhPho;
    @NotBlank(message = "Chưa Chọn Quốc Gia")
    private String quocGia;

    @NotBlank(message = "Chưa nhập mật khẩu")
    private String matKhau;

    public void loadFormVDomainModel(KhachHang vm) {
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
