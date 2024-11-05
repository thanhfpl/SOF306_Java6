package com.example.demo.controller;

import com.example.demo.entity.NhanVien;
import com.example.demo.model.response.NhanVienReponse;
import com.example.demo.repository.NhanVienRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class NhanVienController {

    @Autowired
    NhanVienRepositoty nhanVienRepositoty;

    @GetMapping("get-all")
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(nhanVienRepositoty.getAll(), HttpStatus.OK);
    }

   @GetMapping("phan-trang")
   public ResponseEntity<?> phanTrang(@RequestParam(value = "currentPage", defaultValue = "0") Integer currentPage){
        int pageSize = 5;
        Pageable pageable = PageRequest.of(currentPage, pageSize);
        return new ResponseEntity<>(nhanVienRepositoty.getAll(),HttpStatus.OK);

   }


    @GetMapping("/detail/{id}")
    public ResponseEntity<?> detail(@PathVariable("id") Long id){
        Optional<NhanVien> nhanVien = nhanVienRepositoty.findById(id);
        if (nhanVien.isEmpty()){
            return new ResponseEntity<>("nhan vien kh ton tai", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(nhanVienRepositoty.getAll(),HttpStatus.OK);

    }







}
