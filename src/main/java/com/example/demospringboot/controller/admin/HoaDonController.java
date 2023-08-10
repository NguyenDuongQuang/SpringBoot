package com.example.demospringboot.controller.admin;

import com.example.demospringboot.entity.HoaDon;
import com.example.demospringboot.entity.KhachHang;
import com.example.demospringboot.entity.MauSac;
import com.example.demospringboot.entity.NhanVien;
import com.example.demospringboot.repositories.ChucVuRepository;
import com.example.demospringboot.repositories.HoaDonRepository;
import com.example.demospringboot.repositories.KhachHangRepository;
import com.example.demospringboot.repositories.NhanVienRepository;
import com.example.demospringboot.viewmodel.HoaDonVM;
import com.example.demospringboot.viewmodel.MauSacVM;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("admin/hoadon")
public class HoaDonController {
    @Autowired
    private HoaDonRepository hsRepo;
    @Autowired
    private KhachHangRepository khRepo;
    @Autowired
    private NhanVienRepository nvRepo;

    @Autowired
    @Qualifier("hd_vm1")
    private HoaDonVM hdvm ;

    @GetMapping("index") // findAllData và phân trang
    public String getFormIndexHD(Model model , @RequestParam(name = "page" , defaultValue = "0") Integer pageNo){
        Pageable pageable = PageRequest.of(pageNo , 5);
        Page<HoaDon> hoaDonPage = hsRepo.findAll(pageable);
        model.addAttribute("data" , hoaDonPage);
        return "admin/hoadon/index";
    }
    @GetMapping("/create")
    public String getFormCreate(Model model){
        Iterable<KhachHang> listKH = this.khRepo.findAll();
        List<HoaDon> listNV = this.hsRepo.findAll();
        model.addAttribute("listKH" , listKH);
        model.addAttribute("listNV" , listNV);
        return "admin/hoadon/create";
    }


    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") UUID id, Model model) {
        HoaDon hd = hsRepo.findById(UUID.fromString(id.toString())).orElse(null);

        model.addAttribute("hoaDon", hd);

        return "/admin/hoadon/detail";
    }
    @PostMapping("update/{id}")
    public String getUpdateMauSac(@PathVariable("id") HoaDon oldValue , Model model,
                                  @Valid @ModelAttribute("data") HoaDonVM newValue,
                                  BindingResult result){
        if (result.hasErrors()){
            model.addAttribute("data" , newValue);
            model.addAttribute("action" , "/admin/hoadon/update/"+oldValue.getId());

            return "admin/hoadon/edit";
        }
        oldValue.loadFormViewModel(newValue);
        this.hsRepo.save(oldValue);
        return "redirect:/admin/hoadon/index";

    }
    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id")HoaDon hoaDon , Model model){
        hdvm.loadFormDoMainModel(hoaDon);
        model.addAttribute("data" , hdvm);
        model.addAttribute("action" , "/admin/hoadon/update/" + hoaDon.getId());
        return "admin/hoadon/edit";
    }
    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id")UUID id) {
        this.hsRepo.deleteById(id);
        return "redirect:/admin/hoadon/index";
    }

}
