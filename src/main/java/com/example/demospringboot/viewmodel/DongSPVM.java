package com.example.demospringboot.viewmodel;

import com.example.demospringboot.entity.DongSP;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DongSPVM {
    @Column(name = "Ma")
    private String Ma;

    @Column(name = "Ten")
    private String Ten;

    public void loadDomainModel(DongSP domain){
        this.setMa(domain.getMa());
        this.setTen(domain.getTen());
    }


}
