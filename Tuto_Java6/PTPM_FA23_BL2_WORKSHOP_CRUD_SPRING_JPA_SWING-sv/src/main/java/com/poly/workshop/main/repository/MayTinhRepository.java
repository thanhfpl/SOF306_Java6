/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.poly.workshop.main.repository;

import com.poly.workshop.main.model.MayTinh;
import com.poly.workshop.main.response.MayTinhResponse;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hangnt
 */
@Repository
public interface MayTinhRepository  extends JpaRepository<MayTinh, Long>{
    
    @Query ("""
            SELECT new com.poly.workshop.main.response.MayTinhResponse
            (mt.id, mt.maMayTinh, h.maHang, h.tenHang,  mt.tenMayTinh, mt.gia, mt.mauSac, mt.mieuTa, mt.boNho)
            
            FROM MayTinh mt, Hang h 
            WHERE mt. 
            """)
    List<MayTinhResponse>getAll();
}
