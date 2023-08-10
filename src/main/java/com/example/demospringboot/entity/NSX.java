package com.example.demospringboot.entity;

import com.example.demospringboot.viewmodel.NSXVM;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "NSX")
public class NSX {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    @Column(name = "Ma")
    private String Ma;
    @Column(name = "Ten")
    private String Ten;

    public void loadFormViewModel(NSXVM vm){
        this.setTen(vm.getTen());
        this.setMa(vm.getMa());
    }
}
