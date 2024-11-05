package com.example.demo.controller;

import com.example.demo.entity.BaiHat;
import com.example.demo.repository.BaiHatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BaiHatController {

    @Autowired
    BaiHatRepository baiHatRepository;

    @GetMapping("get-all")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(baiHatRepository.getAll(), HttpStatus.OK);
    }


    @GetMapping("phan-trang")
    public ResponseEntity<?> phanTrang(@RequestParam(value = "currentPage", defaultValue = "0") Integer currentPage){
        int pageSize = 5;
        Pageable pageable = PageRequest.of(currentPage, pageSize);
        return new ResponseEntity<>(baiHatRepository.getAll(pageable), HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<?> detail(@PathVariable("id") Long id){
        Optional<BaiHat> baiHat = baiHatRepository.findById(id);
        if (baiHat.isEmpty()){
            return new ResponseEntity<>("Bai Hat Khong Ton Tai", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(baiHat.get(), HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<?> addBaiHat(@RequestBody BaiHat baiHat) {
        BaiHat savedBaiHat = baiHatRepository.save(baiHat);
        return new ResponseEntity<>(savedBaiHat, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBaiHat(@PathVariable("id") Long id) {
        baiHatRepository.deleteById(id);
        return new ResponseEntity<>("Bai hat da duoc xoa", HttpStatus.OK);
    }








}
