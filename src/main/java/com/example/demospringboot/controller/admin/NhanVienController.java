package com.example.demospringboot.controller.admin;

import com.example.demospringboot.entity.*;

import com.example.demospringboot.repositories.ChucVuRepository;
import com.example.demospringboot.repositories.CuaHangRepository;
import com.example.demospringboot.viewmodel.NhanVienVM;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.example.demospringboot.repositories.NhanVienRepository;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("admin/nhanvien")
public class NhanVienController {

    @Autowired
    private NhanVienVM nhanVienVM;

    @Autowired
    private NhanVienRepository nhanVienRepo;

    @Autowired
    private CuaHangRepository cuaHangRepo;

    @Autowired
    private ChucVuRepository chucVuRepo;

    @Autowired
    HttpSession  session ;
    @GetMapping("index")
    private String index(Model model , @RequestParam(name = "page" , defaultValue = "0") Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo , 5);
        Page<NhanVien> NVPage = this.nhanVienRepo.findAll(pageable);
        model.addAttribute("DanhSachNV" , NVPage);

//        if(session.getAttribute("username") == null){
//            return  "redirect:/login";
//        }

        return "admin/nhanvien/index";
    }
//    public String getFormIndexHD(Model model , @RequestParam(name = "page" , defaultValue = "0") Integer pageNo){
//        Pageable pageable = PageRequest.of(pageNo , 5);
//        Page<CuaHang> hoaDonPage = chRepo.findAll(pageable);
//        model.addAttribute("data" , hoaDonPage);
//        return "admin/cuahang/index";
//    }
    @GetMapping("create")
    private String create(Model model) {
        List<CuaHang> cuaHangs = (List<CuaHang>) cuaHangRepo.findAll();
        List<ChucVu> chucVus = (List<ChucVu>) chucVuRepo.findAll();
        model.addAttribute("data", nhanVienVM);
        model.addAttribute("danhSachCH", cuaHangs);
        model.addAttribute("danhSachCV", chucVus);
        model.addAttribute("action", "/admin/nhanvien/store");
        return "admin/nhanvien/create";
    }

    @PostMapping("store")
    private String store(
            @Valid @ModelAttribute("data") NhanVienVM nhanVienVM,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            return "admin/nhanvien/create";
        }
        NhanVien nhanVien = new NhanVien();
        nhanVien.loadFormViewModel(nhanVienVM);

        this.nhanVienRepo.save(nhanVien);
        return "redirect:/admin/nhanvien/index";
    }

    @GetMapping("delete/{id}")
    private String delete(@PathVariable("id") NhanVien nhanVien) {
        this.nhanVienRepo.delete(nhanVien);
        return "redirect:/admin/nhanvien/index";
    }

    @GetMapping("edit/{id}")
    private String edit(@PathVariable("id") NhanVien nhanVien, Model model) {
        List<CuaHang> cuaHangs = (List<CuaHang>) cuaHangRepo.findAll();
        List<ChucVu> chucVus = (List<ChucVu>) chucVuRepo.findAll();
        model.addAttribute("danhSachCH", cuaHangs);
        model.addAttribute("danhSachCV", chucVus);
        nhanVienVM.loadFormDomainModel(nhanVien);
        model.addAttribute("data", nhanVienVM);
        model.addAttribute("action", "/admin/nhanvien/update/" + nhanVien.getId());
        return "admin/nhanvien/create";
    }

    @PostMapping("update/{id}")
    public String update(
            @PathVariable("id") NhanVien oldvalue,
            Model model,
            @Valid @ModelAttribute("data") NhanVienVM newvalue,
            BindingResult result
    ) {
        if (result.hasErrors()) {
            model.addAttribute("data", newvalue);
            model.addAttribute("action", "/admin/nhanvien/update/" + oldvalue.getId());
            return "admin/nhanvien/create";
        }
        oldvalue.loadFormViewModel(newvalue);
        this.nhanVienRepo.save(oldvalue);
        return "redirect:/admin/nhanvien/index";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") UUID id, Model model) {
        NhanVien hd = nhanVienRepo.findById(UUID.fromString(id.toString())).orElse(null);

        model.addAttribute("nv", hd);

        return "/admin/nhanvien/detail";
    }
}
