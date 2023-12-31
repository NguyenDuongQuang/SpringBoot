package com.example.demospringboot.repositories;

import com.example.demospringboot.entity.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang , UUID> {

}
