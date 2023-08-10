package com.example.demospringboot.repositories;

import com.example.demospringboot.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien , UUID> {
    NhanVien findNhanVienByMaAndMatKhau(String Ma , String MatKhau);

}
