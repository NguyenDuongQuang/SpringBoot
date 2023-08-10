package com.example.demospringboot.repositories;

import com.example.demospringboot.entity.NSX;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NSXRepository extends JpaRepository<NSX ,UUID> {
}
