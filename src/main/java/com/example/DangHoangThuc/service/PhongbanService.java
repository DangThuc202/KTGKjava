package com.example.DangHoangThuc.service;

import com.example.DangHoangThuc.entity.phongban;
import com.example.DangHoangThuc.repository.IPhongbanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class PhongbanService {
    @Autowired
    private IPhongbanRepository phongbanRepository;

    public List<phongban> getAllPhongban(){
        return phongbanRepository.findAll();

    }

    public phongban getPhongbanById(String id){
        Optional<phongban> optionalPhongban= phongbanRepository.findById(id);
        if(optionalPhongban.isPresent()){
            return optionalPhongban.get();
        }
        else{
            throw new RuntimeException("Phong ban not found");
        }
    }

    public phongban savePhongban(phongban phongban){
        return phongbanRepository.save(phongban);
    }

    public void deletePhongban(String id){
        phongbanRepository.deleteById(id);
    }
}
