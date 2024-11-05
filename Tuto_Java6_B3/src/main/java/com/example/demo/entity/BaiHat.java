package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "bai_hat")
public class BaiHat {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "ten_bai_hat")
    private String tenBaiHat;

    @Column(name = "ten_tac_gia")
    private String tenTacGia;

    @Column(name = "thoi_luong")
    private Integer thoiLuong;

    @Column(name = "ngay_san_xuat")
    private Date ngaySanXuat;

    @Column(name = "gia")
    private float gia;

    @ManyToOne
    @JoinColumn(name = "ca_si_id")
    private CaSi caSi;

    @Column(name = "phat_hanh_dia")
    private Integer phatHanhDia;

    @Column(name = "ngay_ra_mat")
    private Date ngayRaMat;


}



//    CREATE TABLE [dbo].[bai_hat] (
//        [id] int  IDENTITY(1,1) NOT NULL,
//        [ten_bai_hat] nvarchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
//        [ten_tac_gia] nvarchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
//        [thoi_luong] int  NULL,
//        [ngay_san_xuat] date  NULL,
//        [gia] float(53)  NULL,
//        [ca_si_id] int  NULL,
//        [phat_hanh_dia] bit  NULL,
//        [ngay_ra_mat] date  NULL
//        )
//        GO