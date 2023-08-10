package com.example.demospringboot.controller.admin;

import com.example.demospringboot.entity.CuaHang;
import com.example.demospringboot.entity.MauSac;
import com.example.demospringboot.repositories.MauSacRepository;
import com.example.demospringboot.viewmodel.MauSacVM;
import jakarta.validation.Valid;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("admin/mausac")
public class MauSacController {
    @Autowired
    private MauSacRepository msRepo;

    @Autowired
    @Qualifier("ms_vm1")
    private MauSacVM msvm;

    @GetMapping("index") // findAllData và phân trang
    public String getFormIndexNSX(Model model , @RequestParam(name = "page" , defaultValue = "0") Integer pageNo){
        Pageable pageable = PageRequest.of(pageNo , 5);
        Page<MauSac> MSPage = this.msRepo.findAll(pageable);
        model.addAttribute("data" , MSPage);
        return "admin/mausac/index";
    }



    @GetMapping("create")
    public String getCreateFormMauSac( Model model){
        model.addAttribute("data" ,msvm);
        model.addAttribute("action" , "/admin/mausac/store");
        return "admin/mausac/create";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id")MauSac mauSac , Model model){
    msvm.loadFormDomainModel(mauSac);
    model.addAttribute("data" , msvm);
    model.addAttribute("action" , "/admin/mausac/update/" + mauSac.getId());
        return "admin/mausac/create";
    }
    @GetMapping("delete/{id}")
    public String deleteMauSac(@PathVariable("id") UUID id){
        this.msRepo.deleteById(id);
        return "redirect:/admin/mausac/index";
    }
    @PostMapping("update/{id}")
    public String getUpdateMauSac(@PathVariable("id") MauSac oldValue , Model model,
                                  @Valid@ModelAttribute("data") MauSacVM newValue,
                                  BindingResult result){
        if (result.hasErrors()){
            model.addAttribute("data" , newValue);
            model.addAttribute("action" , "/admin/mausac/update/"+oldValue.getId());
            return "admin/mausac/create";
        }
        oldValue.loadViewModel(newValue);
        this.msRepo.save(oldValue);
        return "redirect:/admin/mausac/index";

    }
    @PostMapping("store")
    public String storeFormMauSac(@ModelAttribute("data") MauSacVM vm,
                                  BindingResult result){
        if (result.hasErrors()){
            return "admin/mausac/create";
        }
        MauSac ms = new MauSac();
        ms.loadViewModel(vm);
        this.msRepo.save(ms);
        return "redirect;/admin/mausac/create";

    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") UUID id, Model model) {
        MauSac hd = msRepo.findById(UUID.fromString(id.toString())).orElse(null);

        model.addAttribute("mauSac", hd);

        return "/admin/mausac/detail";
    }




}
