package com.example.DangHoangThuc.repository;

import com.example.DangHoangThuc.entity.nhanvien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INhanvienRepository extends JpaRepository<nhanvien, String> {
}
