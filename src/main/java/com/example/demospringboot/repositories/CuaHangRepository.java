package com.example.demospringboot.repositories;

import com.example.demospringboot.entity.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CuaHangRepository extends JpaRepository<CuaHang , UUID> {
}
