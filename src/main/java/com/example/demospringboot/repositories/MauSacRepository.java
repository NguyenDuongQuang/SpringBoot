package com.example.demospringboot.repositories;

import com.example.demospringboot.entity.MauSac;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MauSacRepository extends JpaRepository<MauSac , UUID> {

}
