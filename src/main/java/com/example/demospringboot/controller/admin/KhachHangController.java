package com.example.demospringboot.controller.admin;

import com.example.demospringboot.entity.*;
import com.example.demospringboot.repositories.KhachHangRepository;
import jakarta.validation.Valid;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.example.demospringboot.viewmodel.KhachHangVM;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("admin/khachhang")
public class KhachHangController {
  @Autowired
  private KhachHangRepository khachHangRepo;

  @Autowired
  private KhachHangVM kh;

  @GetMapping("index")
  public String index(Model model, @RequestParam(name = "page" , defaultValue = "0") Integer pageNo) {
    List<KhachHang> khachHangs = (List<KhachHang>) this.khachHangRepo.findAll();
    Pageable pageable = PageRequest.of(pageNo , 5);
    Page<KhachHang> KHPage = this.khachHangRepo.findAll(pageable);
    model.addAttribute("danhSachKH" , KHPage);
    model.addAttribute("danhSachKH", khachHangs);
    return "admin/khachhang/index";
  }

  @GetMapping("create")
  public String create(Model model) {
    model.addAttribute("data", kh);
    model.addAttribute("action", "/admin/khachhang/store");
    return "admin/khachhang/create";
  }

  @PostMapping("store")
  public String store(
          @Valid @ModelAttribute("data") KhachHangVM khachHangVM,
          BindingResult result
  ) {
    if (result.hasErrors()) {
      return "admin/khachhang/create";
    } else {
      KhachHang khachHang = new KhachHang();
      khachHang.loadFormViewModel(khachHangVM);
      this.khachHangRepo.save(khachHang);
      return "redirect:/admin/khachhang/index";
    }
  }

  @GetMapping("edit/{id}")
  public String edit(@PathVariable("id") KhachHang khachHang, Model model) {
    kh.loadFormVDomainModel(khachHang);
    model.addAttribute("data", kh);
    model.addAttribute("action", "/admin/khachhang/update/" + khachHang.getId());
    return "admin/khachhang/create";
  }

  @GetMapping("delete/{id}")
  public String delete(@PathVariable("id")UUID id) {
    this.khachHangRepo.deleteById(id);
    return "redirect:/admin/khachang/index";
  }

  @PostMapping("edit/{id}")
  public String update(
          Model model,
          @PathVariable("id") KhachHang oldValue,
          @Valid @ModelAttribute("data") KhachHangVM newValue,
          BindingResult result
  ) {
    if (result.hasErrors()) {
      model.addAttribute("data", newValue);
      model.addAttribute("action", "/admin/khachhang/update/" + oldValue.getId());
      return "admin/khachhang/create";
    }
    oldValue.loadFormViewModel(newValue);
    this.khachHangRepo.save(oldValue);
    return "redirect:/admin/khachhang/index";

  }
  @GetMapping("/detail/{id}")
  public String detail(@PathVariable("id") UUID id, Model model) {
    KhachHang kh = khachHangRepo.findById(UUID.fromString(id.toString())).orElse(null);

    model.addAttribute("kh", kh);

    return "/admin/khachang/detail";
  }

}
