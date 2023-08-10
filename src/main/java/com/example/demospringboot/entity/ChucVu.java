package com.example.demospringboot.entity;

import com.example.demospringboot.viewmodel.ChucVuVM;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Table(name = "ChucVu")
public class ChucVu {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id")
    private UUID Id;

    @Column(name = "Ma")
    private  String Ma ;
    @Column(name = "Ten")
    private  String Ten ;

    public void loadFormViewModel(ChucVu vm){
        this.setTen(vm.getTen());
        this.setMa(vm.getMa());
    }

    public ChucVu(String ma, String ten) {
        Ma = ma;
        Ten = ten;
    }
}
