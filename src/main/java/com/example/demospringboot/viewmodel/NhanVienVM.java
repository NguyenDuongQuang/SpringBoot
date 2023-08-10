package com.example.demospringboot.viewmodel;


import com.example.demospringboot.entity.ChucVu;
import com.example.demospringboot.entity.CuaHang;
import com.example.demospringboot.entity.NSX;
import com.example.demospringboot.entity.NhanVien;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NhanVienVM {
  @NotBlank(message = "Không được để trống mã!")
  private String ma;

  @NotBlank(message = "Không được để trống tên!")
  private String ten;

  @NotBlank(message = "Không được để trống tên đệm!")
  private String tenDem;

  @NotBlank(message = "Không được để trống họ!")
  private String ho;

  @NotBlank(message = "Không được để trống giới tính!")
  private String gioiTinh;

  @NotBlank(message = "Không được để trống ngày sinh!")
  private String ngaySinh;

  @NotBlank(message = "Không được để trống địa chỉ!")
  private String diaChi;

  @NotBlank(message = "Không được để trống SĐT!")
  private String sdt;

  @NotBlank(message = "Không được để trống mật khẩu!")
  private String matKhau;

  private CuaHang danhSachCH;

  private ChucVu danhSachCV;

  public void loadFormDomainModel(NhanVien domain) {
    this.setMa(domain.getMa());
    this.setTen(domain.getTen());
    this.setTenDem(domain.getTenDem());
    this.setHo(domain.getHo());
    this.setGioiTinh(domain.getGioiTinh());
    this.setNgaySinh(domain.getNgaySinh());
    this.setDiaChi(domain.getDiaChi());
    this.setSdt(domain.getSdt());
    this.setMatKhau(domain.getMatKhau());
    this.setDanhSachCH(domain.getCuaHang());
    this.setDanhSachCV(domain.getChucVu());
  }

}
