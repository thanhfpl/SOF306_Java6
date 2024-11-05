package com.example.demo.repository;

import com.example.demo.entity.NhanVien;
import com.example.demo.model.response.NhanVienReponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhanVienRepositoty extends JpaRepository<NhanVien, Long>{
      @Query("""
      SELECT new com.example.demo.model.response.NhanVienReponse(
      nv.id,
      nv.ma,
      CONCAT(nv.ho, '', nv.tenDem,'',nv.ten),
      nv.gioiTinh,
      nv.diaChi,
      nv.chucVu.ten)
      FROM NhanVien nv 
      """)
      List<NhanVienReponse> getAll();


      @Query("""
      SELECT new com.example.demo.model.response.NhanVienReponse(
      nv.id,
      nv.ma,
      CONCAT(nv.ho, '', nv.tenDem,'',nv.ten),
      nv.gioiTinh,
      nv.diaChi,
      nv.chucVu.ten)
      FROM NhanVien nv 
      """)
      Page<NhanVienReponse> getAll(Pageable pageable);



}
