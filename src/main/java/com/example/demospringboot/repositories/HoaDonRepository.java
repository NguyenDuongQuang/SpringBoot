package com.example.demospringboot.repositories;

import com.example.demospringboot.entity.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface HoaDonRepository extends JpaRepository<HoaDon, UUID> {
    public HoaDon findHoaDonById(String Ma);
}
