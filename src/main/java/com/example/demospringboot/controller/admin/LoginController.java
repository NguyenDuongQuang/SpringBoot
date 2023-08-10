package com.example.demospringboot.controller.admin;

import com.example.demospringboot.entity.NhanVien;
import com.example.demospringboot.repositories.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class LoginController {
//    @Autowired
//    private NhanVienRepository nvRepo;
//    @GetMapping("login" )
//    public String getLoginFrom(Model model){
//        return "login"; // trả về view jsp
//    }
//    @PostMapping("login")
//    public String login(
//            @RequestParam("username") String usernme,
//            @RequestParam("password") String password) {
//    NhanVien nv = nvRepo.findNhanVienByMaAndMatKhau(usernme , password);
//        if(nv.getMatKhau() .equals(nv.getMatKhau()))
//
//    }
//    @PostMapping("/login")
//    public String login(@ModelAttribute("nhanVien") NhanVien nhanVien, Model model) {
//        NhanVien nv = nvRepo.findNhanVienByMaAndMatKhau(nhanVien.getMa(), nhanVien.getMatKhau());
//
//       return  ;
//    }

}
