package com.example.demo.controller;

import com.example.demo.entity.NhanVien;
import com.example.demo.model.request.NhanVienRequest;
import com.example.demo.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.Optional;

@RestController
public class NhanVienController {

    @Autowired()
    private NhanVienRepository  nhanVienRepository;

    // show data
    @GetMapping(" ")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(nhanVienRepository.getAll(), HttpStatus.OK);

    }


    //phan trang
    @GetMapping("phan-trang")
    public ResponseEntity<?> phanTrang(@RequestParam(value = "currentPage", defaultValue = "0") Integer currentPage){
        int pageSize = 5;
        Pageable pageable = PageRequest.of(currentPage, pageSize);
        return new ResponseEntity<>(nhanVienRepository.getAll(pageable), HttpStatus.OK);

    }


    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody NhanVienRequest request){
        Optional<NhanVien> nhanVien = nhanVienRepository.findById(request.getId());
        if (nhanVien.isEmpty()){
            return new ResponseEntity<>("NhanVien Khong Ton Tai",HttpStatus.NOT_FOUND);
        }
        nhanVien.get().setMa(request.getMa());
        nhanVien.get().setGioiTinh(request.getGioiTinh());
        nhanVien.get().setDiaChi(request.getDiaChi());
        nhanVien.get().setChucVu(request.getChucVu());
        String[] hoVaTen  = request.getHoVaTen().split("");
        String ho  = hoVaTen[0];
        String tenDem  = hoVaTen[0];
        for (int i = 0; i < hoVaTen.length; i++){

            if (i!= 0 && i!=hoVaTen.length-1){
                tenDem+= " "+ hoVaTen[i];
            }
        }
        String ten  = hoVaTen[hoVaTen.length-1];
        nhanVien.get().setHo(ho);
        nhanVien.get().setTenDem(tenDem.trim());
        nhanVien.get().setTen(ten);
        nhanVienRepository.save(nhanVien.get());
        return new ResponseEntity<>("Update Thanh Cong",HttpStatus.OK);

    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<?> detail(@PathVariable("id") Long id){
        Optional<NhanVien> nhanVien = nhanVienRepository.findById(id);
        if (nhanVien.isEmpty() ){
            return new ResponseEntity<>("nhan vien khong ton tai", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(nhanVien.get(), HttpStatus.OK);
    }





}
