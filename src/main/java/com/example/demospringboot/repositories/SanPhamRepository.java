package com.example.demospringboot.repositories;

import com.example.demospringboot.entity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SanPhamRepository extends JpaRepository<SanPham , UUID> {
}
