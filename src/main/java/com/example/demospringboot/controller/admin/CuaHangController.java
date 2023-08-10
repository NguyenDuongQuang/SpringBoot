package com.example.demospringboot.controller.admin;

import com.example.demospringboot.entity.ChucVu;
import com.example.demospringboot.entity.CuaHang;
import jakarta.validation.Valid;
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
import com.example.demospringboot.repositories.CuaHangRepository;
import com.example.demospringboot.viewmodel.CuaHangVM;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Controller
    @RequestMapping("admin/cuahang")
    public class CuaHangController {
    @Autowired
    private CuaHangRepository chRepo;
    @Autowired
    @Qualifier("ch_vm1")
    private CuaHangVM vm;


//        @GetMapping( "index") // url
//        public String getIndexCuaHangFrom(ModelMap model){
//          List<CuaHang> listCH = this.chRepo.findAll();
//            model.addAttribute("data" , listCH);
//            return "admin/cuahang/index"; // tra ve views index
//        }
    @GetMapping("index") // findAllData và phân trang
    public String getFormIndexHD(Model model , @RequestParam(name = "page" , defaultValue = "0") Integer pageNo){
        Pageable pageable = PageRequest.of(pageNo , 5);
        Page<CuaHang> hoaDonPage = chRepo.findAll(pageable);
        model.addAttribute("data" , hoaDonPage);
        return "admin/cuahang/index";
    }


        @GetMapping("create") // url
        public String getCreateCuaHangFrom(ModelMap model){
            model.addAttribute("data" , vm);

            model.addAttribute("action" ,"/admin/cuahang/store");
            return "admin/cuahang/create"; // tra ve views create
        }

    @GetMapping("edit/{id}")
         public String edit(@PathVariable("id") CuaHang cuaHang , Model model){
            vm.loadFromDomainModel(cuaHang);
            model.addAttribute("data" , vm);
            model.addAttribute("action","/admin/cuahang/update/" + cuaHang.getId());
            return "admin/cuahang/create";
    }
         @GetMapping("delete/{id}")
         public String delete(@PathVariable("id") UUID id)
         {
             this.chRepo.deleteById(id);
             return "redirect:/admin/cuahang/index";
         }

    @PostMapping("store")
    public String stroreCH(
            @ModelAttribute("data") CuaHangVM vm,
            BindingResult result
    ) {
        System.out.println("ban chon store");
        if (result.hasErrors()) {
            return "admin/cuahang/create";
        }
        CuaHang ch = new CuaHang();
        ch.loadFromViewModel(vm);
        this.chRepo.save(ch);
        return "redirect:/admin/cuahang/index";
    }
         @PostMapping("update/{id}")
         public String update(
            @PathVariable("id") CuaHang oldValue,
            Model model,
            @Valid @ModelAttribute("data") CuaHangVM newValue ,
            BindingResult result
         ){
            if(result.hasErrors()){
                model.addAttribute("data" , newValue);
                model.addAttribute("action" , "/admin/cuahang/update/" + oldValue.getId());
                return "admin/cuahang/create";
            }
            oldValue.loadFromViewModel(newValue);
            this.chRepo.save(oldValue);
            return "redirect:/admin/cuahang/index";

         }


    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") UUID id, Model model) {
        CuaHang hd = chRepo.findById(UUID.fromString(id.toString())).orElse(null);

        model.addAttribute("cuaHang", hd);

        return "/admin/cuahang/detail";
    }

}
