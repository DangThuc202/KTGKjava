package com.example.DangHoangThuc.service;

import com.example.DangHoangThuc.entity.nhanvien;
import com.example.DangHoangThuc.repository.INhanvienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;
@Service
public class NhanvienService {
    @Autowired
    private INhanvienRepository nhanvienRepository;

    public List<nhanvien> getAllNhanvien(){
        return nhanvienRepository.findAll();

    }

    public nhanvien getNhanvienById(String id){
        Optional<nhanvien> optional = nhanvienRepository.findById(id);
        return optional.orElse(null);
    }

    public void addNhanvien(nhanvien nhanvien){
        nhanvienRepository.save(nhanvien);
    }

    public void updateNhanvien(nhanvien nhanvien){
        nhanvienRepository.save(nhanvien);
    }
    public void deleteNhanvien(String id){
        nhanvienRepository.deleteById(id);
    }
}
