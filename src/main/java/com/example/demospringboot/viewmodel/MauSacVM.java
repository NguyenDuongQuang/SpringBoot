package com.example.demospringboot.viewmodel;

import com.example.demospringboot.entity.MauSac;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor @NoArgsConstructor
public class MauSacVM {
    private  String Ma;
    private String Ten ;


    public void loadFormDomainModel(MauSac domain){
        this.setMa(domain.getMa());
        this.setTen(domain.getTen());
    }


}
