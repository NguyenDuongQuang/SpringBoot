package com.example.demospringboot.controller.admin;

import com.example.demospringboot.entity.ChucVu;
import com.example.demospringboot.entity.DongSP;
import com.example.demospringboot.entity.HoaDon;
import com.example.demospringboot.repositories.DongSPRepository;
import com.example.demospringboot.viewmodel.ChucVuVM;
import com.example.demospringboot.viewmodel.DongSPVM;
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

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("admin/dongsp")
public class DongSPController {
    @Autowired
    private DongSPRepository dspRepo;
    @Autowired
    @Qualifier("dsp_vm1")
    private DongSPVM dspvm;

//    @GetMapping("index") // getAllData
//    public String getFormIndexDSP(Model model){
//        List<DongSP> listDSP = this.dspRepo.findAll();
//        model.addAttribute("data" , listDSP);
//        return "admin/dongsp/index";
//    }
    @GetMapping("index") // findAllData và phân trang
    public String getFormIndexHD(Model model , @RequestParam(name = "page" , defaultValue = "0") Integer pageNo){
        Pageable pageable = PageRequest.of(pageNo , 5);
        Page<DongSP> dspPage = dspRepo.findAll(pageable);
        model.addAttribute("data" , dspPage);
        return "admin/dongsp/index";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") UUID id, Model model) {
        DongSP hd = dspRepo.findById(UUID.fromString(id.toString())).orElse(null);

        model.addAttribute("dongSP", hd);

        return "/admin/dongsp/detail";
    }
    @GetMapping("create")  // hien thu form create GET
    public String getFormCreateChucVu(Model model){
        model.addAttribute("data" , dspvm);
        model.addAttribute("action" , "/admin/dongsp/store");
        return "admin/dongsp/create";
    }

    @PostMapping("store") // su ly logic save du lieu
    public  String stroeChucVu(@ModelAttribute("data") DongSPVM vm ,
                               BindingResult result){
        if(result.hasErrors()){
            return "admin/dongsp/create";
        }
        DongSP dsp = new DongSP();
        dsp.loadFormViewModel(vm);
        this.dspRepo.save(dsp);
        return  "admin/dongsp/create";
    }

    @GetMapping("delete/{id}") // xoa thong tin theo id
    public String deleteChucVu(@PathVariable("id")UUID id){
        this.dspRepo.deleteById(id);
        return "redirect:/admin/dongsp/index";
    }

    @GetMapping("edit/{id}")
    public String editChucVu(@PathVariable("id") DongSP dsp , Model model){
        dspvm.loadDomainModel(dsp);
        model.addAttribute("data" , dspvm);
        model.addAttribute("action","/admin/dongsp/update/" + dsp.getId());
        return "admin/dongsp/create";
    }
    @PostMapping("update/{id}")
    public String updateChucVu(@PathVariable("id") DongSP oldValue ,
                               Model model, @Valid @ModelAttribute("data") DongSPVM newValuew,
                               BindingResult result){
        if(result.hasErrors()){
            model.addAttribute("data" ,newValuew);
            model.addAttribute("action" , "/admin/dongsp/update/" +oldValue.getId());
            return "admin/dongsp/create";

        }
        oldValue.loadFormViewModel(newValuew);
        this.dspRepo.save(oldValue);
        return "redirect:/admin/dongsp/index";

    }
}
