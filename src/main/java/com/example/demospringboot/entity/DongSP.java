package com.example.demospringboot.entity;

import com.example.demospringboot.viewmodel.DongSPVM;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "DongSP")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DongSP {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    @Column(name = "Ma")
    private String Ma;

    @Column(name = "Ten")
    private String Ten;
    public void loadFormViewModel(DongSPVM vm){
        this.setMa(vm.getMa());
        this.setTen(vm.getTen());
    }

}
