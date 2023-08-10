package com.example.demospringboot.entity;

import com.example.demospringboot.viewmodel.CuaHangVM;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name="CuaHang")
public class CuaHang {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;
    @Column(name = "Ma")
    private  String Ma ;
    @Column(name = "Ten")
    private  String Ten ;
    @Column(name = "DiaChi")
    private  String DiaChi ;
    @Column(name = "ThanhPho")
    private  String ThanhPho;
    @Column(name="QuocGia")
    private  String QuocGia ;

    public void loadFromViewModel(CuaHangVM vm)
    {
        this.setTen( vm.getTen() );
        this.setMa( vm.getMa() );
        this.setDiaChi( vm.getDiaChi() );
        this.setThanhPho( vm.getThanhPho() );
        this.setQuocGia( vm.getQuocGia() );
    }

}
