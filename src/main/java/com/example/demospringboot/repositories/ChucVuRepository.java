package com.example.demospringboot.repositories;

import com.example.demospringboot.entity.ChucVu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ChucVuRepository extends JpaRepository<ChucVu , UUID> {


}
