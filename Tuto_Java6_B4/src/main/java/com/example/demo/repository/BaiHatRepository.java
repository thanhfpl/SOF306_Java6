package com.example.demo.repository;

import com.example.demo.entity.BaiHat;
import com.example.demo.model.response.BaiHatResponse;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BaiHatRepository extends JpaRepository<BaiHat,Long> {

    @Query("""
    SELECT new com.example.demo.model.response.BaiHatResponse(
    bh.id,
    bh.tenBaiHat,
    bh.tenTacGia,
    bh.thoiLuong,
    bh.ngaySanXuat,
    bh.gia,
    bh.caSi.tenCaSi,
    bh.caSi.queQuan,
    bh.ngaySanXuat
    )
    FROM BaiHat bh
    """)
    List<BaiHatResponse> getAll()   ;



    @Query("""
    SELECT new com.example.demo.model.response.BaiHatResponse(
    bh.id,
    bh.tenBaiHat,
    bh.tenTacGia,
    bh.thoiLuong,
    bh.ngaySanXuat,
    bh.gia,
    bh.caSi.tenCaSi,
    bh.caSi.queQuan,
    bh.ngaySanXuat
    )
    FROM BaiHat bh
    """)
    Page<BaiHatResponse> getAll(Pageable pageable) ;




}
