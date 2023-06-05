package com.example.DangHoangThuc.repository;

import com.example.DangHoangThuc.entity.phongban;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhongbanRepository extends JpaRepository<phongban, String> {
}
