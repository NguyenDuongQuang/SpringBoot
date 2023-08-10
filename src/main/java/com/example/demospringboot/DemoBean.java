package com.example.demospringboot;

import com.example.demospringboot.viewmodel.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class DemoBean {
    @Bean("ch_vm1")  // Bean Cua Hang
    public CuaHangVM getCHVM1(){

        CuaHangVM vm = new CuaHangVM();
        vm.setTen("Cua hang 01");
        vm.setThanhPho("HCM");
        vm.setQuocGia("VN");
        return vm;
    }

    @Bean("nv_vm1") // Bean Nhan Vien
    public NhanVienVM getNhanVienVM1(){
        NhanVienVM vm = new NhanVienVM();
        vm.setTen("NhanVien001");
        vm.setHo("A");
        vm.setSdt("098888888");
        vm.setDiaChi("HCM");
        vm.setGioiTinh("Nam");
        vm.setTenDem("Bung");
        vm.setMa("NV001");
        vm.setNgaySinh("3-3-2003");
        return  vm ;
    }
    @Bean("cv_vm1") // Bean CHuc Vu
    public ChucVuVM getChucVuVM1(){
        ChucVuVM vm = new ChucVuVM();
        vm.setTen("Nhan Vien 01");
        vm.setMa("CV01");
        return  vm;
    }
    @Bean("ms_vm1") // Bean Mau Sac
    public MauSacVM getMauSacVM1(){
        MauSacVM msvn = new MauSacVM();
        msvn.setTen("Mau Do");
        msvn.setMa("MS001");
        return  msvn ;
    }
    @Bean("kh_vm1")
    public KhachHangVM getKhachHangVM(){
       KhachHangVM khvm = new KhachHangVM();
        khvm.setMa("KhachHang001");
        khvm.setDiaChi("Yên Thái");
        khvm.setHo("Nguyễn");
        khvm.setTen("Thành");
        khvm.setTenDem("Đăng");
        khvm.setNgaySinh("3-3-2003");
        khvm.setQuocGia("VN");
        khvm.setThanhPho("HN");
        khvm.setMatKhau("abc123");
        khvm.setSdt("0999999999");
    return khvm;
    }

    @Bean("nsx_vm1")
    public NSXVM getNSXVM(){
        NSXVM nsxvm = new NSXVM();
        nsxvm.setMa("NSX001");
        nsxvm.setTen("TOYOTA");
        return nsxvm;
    }
    @Bean("dsp_vm1")
    public DongSPVM getDSPVM(){
        DongSPVM dspvm = new DongSPVM();
        dspvm.setTen("OTO");
        dspvm.setMa("DSP001");
        return dspvm;
    }
    @Bean("hd_vm1")
    public HoaDonVM getHoaDonVM(){
        HoaDonVM hdvm = new HoaDonVM();
        hdvm.setMa("HD01");
        hdvm.setNgayTao(new Date(1-7-2003));
        hdvm.setNgayThanhToan(new Date(1-7-2003));
        hdvm.setNgayShip(new Date(1-7-2003));
        hdvm.setNgayNhan(new Date(1-9-2003));
        hdvm.setTinhTrang(1);
        hdvm.setTenNguoiNhan("Khanh Phong ");
        hdvm.setDiaChi("HA nOI");
        hdvm.setSdt("0383349871");
    return hdvm;
    }

    @Bean("sp_vm1")
    public SanPhamVM getSPVM(){
        SanPhamVM spvm = new SanPhamVM();
        spvm.setTen("OTO");
        spvm.setMa("DSP001");
        return spvm;
    }
}
