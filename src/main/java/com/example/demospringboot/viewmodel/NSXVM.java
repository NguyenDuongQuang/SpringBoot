package com.example.demospringboot.viewmodel;

import com.example.demospringboot.entity.NSX;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor @NoArgsConstructor
public class NSXVM {
    @Column(name = "Ma")
    private String Ma;
    @Column(name = "Ten")
    private String Ten;

    public void getFormDomainModel(NSX domain){
        NSX nsx = new NSX();
        this.setTen(nsx.getTen());
        this.setMa(nsx.getMa());
    }
}
