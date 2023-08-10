package com.example.demospringboot.controller.admin;

import com.example.demospringboot.entity.ChucVu;
import com.example.demospringboot.entity.HoaDon;
import com.example.demospringboot.entity.MauSac;
import com.example.demospringboot.entity.NSX;
import com.example.demospringboot.repositories.NSXRepository;
import com.example.demospringboot.viewmodel.ChucVuVM;
import com.example.demospringboot.viewmodel.NSXVM;
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

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("admin/nsx")
public class NSXController {
    @Autowired
    private NSXRepository nsxRepo;
    @Autowired
    @Qualifier("nsx_vm1")
    private NSXVM nsxvm ;


    @GetMapping("index") // findAllData và phân trang
    public String getFormIndexNSX(Model model , @RequestParam(name = "page" , defaultValue = "0") Integer pageNo){
        Pageable pageable = PageRequest.of(pageNo , 5);
        Page<NSX> NSXPage = this.nsxRepo.findAll(pageable);
        model.addAttribute("data" , NSXPage);
        return "admin/nsx/index";
    }
    @GetMapping("create")  // hien thu form create GET
    public String getFormCreateChucVu(Model model){
        model.addAttribute("data" , nsxvm);
        model.addAttribute("action" , "/admin/chucvu/store");
        return "admin/nsx/create";
    }

    @PostMapping("store") // su ly logic save du lieu
    public  String stroeChucVu(@ModelAttribute("data") NSXVM vm ,
                               BindingResult result){
        if(result.hasErrors()){
            return "admin/nsx/create";
        }
        NSX nsv = new NSX();
        nsv.loadFormViewModel(vm);
        this.nsxRepo.save(nsv);
        return  "admin/nsx/create";
    }

    @GetMapping("delete/{id}") // xoa thong tin theo id
    public String deleteChucVu(@PathVariable("id") UUID id){
        this.nsxRepo.deleteById(id);
        return "redirect:/admin/nsx/index";
    }

    @GetMapping("edit/{id}")
    public String editChucVu(@PathVariable("id") NSX nsx , Model model){
        nsxvm.getFormDomainModel(nsx);
        model.addAttribute("data" , nsxvm);
        model.addAttribute("action","/admin/nsx/update/" + nsx.getId());
        return "admin/nsx/create";
    }
    @PostMapping("update/{id}")
    public String updateChucVu(@PathVariable("id") NSX oldValue ,
                               Model model, @Valid @ModelAttribute("data") NSXVM newValuew,
                               BindingResult result){
        if(result.hasErrors()){
            model.addAttribute("data" ,newValuew);
            model.addAttribute("action" , "/admin/nsx/update/" +oldValue.getId());
            return "admin/nsx/create";

        }
        oldValue.loadFormViewModel(newValuew);
        this.nsxRepo.save(oldValue);
        return "redirect:/admin/nsx/index";

    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") UUID id, Model model) {
        NSX hd = nsxRepo.findById(UUID.fromString(id.toString())).orElse(null);

        model.addAttribute("nsx", hd);

        return "/admin/nsx/detail";
    }



}
