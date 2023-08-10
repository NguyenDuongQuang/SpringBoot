package com.example.demospringboot.viewmodel;

import com.example.demospringboot.entity.ChucVu;
import com.example.demospringboot.entity.SanPham;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SanPhamVM {
    private  String Ma;
    private  String Ten;

    public void loadFormDomainModel(SanPham domain){
        this.setMa(domain.getMa());
        this.setTen(domain.getTen());
    }

}
