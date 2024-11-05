package com.example.demo.repository;

import com.example.demo.entity.NhanVien;
import com.example.demo.model.response.NhanVienResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, Long> {

    @Query ("""
     SELECT new com.example.demo.model.response.NhanVienResponse(
     nv.id,
     nv.ma,
     CONCAT(nv.ho,' ', nv.tenDem,' ', nv.ten),
     nv.gioiTinh,
     nv.diaChi,
     nv.chucVu.ten)
     FROM NhanVien nv 
     """)    List<NhanVienResponse> getAll();


    @Query ("""
     SELECT new com.example.demo.model.response.NhanVienResponse(
     nv.id,
     nv.ma,
     CONCAT(nv.ho,' ', nv.tenDem,' ', nv.ten),
     nv.gioiTinh,
     nv.diaChi,
     nv.chucVu.ten)
     FROM NhanVien nv 
     """)
    Page<NhanVienResponse> getAll(Pageable pageable);
}
