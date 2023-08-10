package com.example.demospringboot.controller.admin;

import com.example.demospringboot.entity.ChucVu;
import com.example.demospringboot.entity.CuaHang;
import com.example.demospringboot.entity.DongSP;
import com.example.demospringboot.repositories.ChucVuRepository;
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
import com.example.demospringboot.viewmodel.ChucVuVM;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("admin/chucvu")
public class ChucVuController {
    @Autowired
    ChucVuRepository CVRepo ;
    @Autowired
    @Qualifier("cv_vm1")
    private ChucVuVM cvvm;

//    @GetMapping("index")  // hien thi form  index GET
//    public String getIndexFormChucVu(Model model){
//        List<ChucVu> listCV = this.CVRepo.findAll();
//        model.addAttribute("data" , listCV);
//        return "admin/chucvu/index";
//    }
    @GetMapping("index") // findAllData và phân trang
    public String getFormIndexHD(Model model , @RequestParam(name = "page" , defaultValue = "0") Integer pageNo){
        Pageable pageable = PageRequest.of(pageNo , 5);
        Page<ChucVu> cVPage = CVRepo.findAll(pageable);
        model.addAttribute("data" , cVPage);
        return "admin/chucvu/index";
    }

    @GetMapping("create")  // hien thu form create GET
    public String getFormCreateChucVu(Model model){
        model.addAttribute("data" , cvvm);
        model.addAttribute("action" , "/admin/chucvu/store");
        return "admin/chucvu/create";
    }

    @PostMapping("store") // su ly logic save du lieu
    public  String stroeChucVu(@ModelAttribute("data") ChucVuVM vm ,
                               BindingResult result){
        if(result.hasErrors()){
            return "admin/chucvu/create";
        }
        ChucVu cv = new ChucVu();
        cv.loadFormViewModel(vm);
        this.CVRepo.save(cv);
        return  "admin/chucvu/create";
    }

    @GetMapping("delete/{id}") // xoa thong tin theo id
    public String deleteChucVu(@PathVariable("id")UUID id){
        this.CVRepo.deleteById(id);
        return "redirect:/admin/chucvu/index";
    }

    @GetMapping("edit/{id}")
    public String editChucVu(@PathVariable("id") ChucVu chucVu , Model model){
        cvvm.loadFormDomainModel(chucVu);
        model.addAttribute("data" , cvvm);
        model.addAttribute("action","/admin/chucvu/update/" + chucVu.getId());
        return "admin/chucvu/create";
    }
    @PostMapping("update/{id}")
    public String updateChucVu(@PathVariable("id") ChucVu oldValue ,
                               Model model, @Valid @ModelAttribute("data") ChucVuVM newValuew,
                               BindingResult result){
        if(result.hasErrors()){
            model.addAttribute("data" ,newValuew);
            model.addAttribute("action" , "/admin/chucvu/update/" +oldValue.getId());
            return "admin/chucvu/create";

        }
        oldValue.loadFormViewModel(newValuew);
        this.CVRepo.save(oldValue);
        return "redirect:/admin/chucvu/index";

    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") UUID id, Model model) {
        ChucVu hd = CVRepo.findById(UUID.fromString(id.toString())).orElse(null);

        model.addAttribute("chucVu", hd);

        return "/admin/chucvu/detail";
    }


}
