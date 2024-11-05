package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "ca_si")
public class CaSi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "ten_ca_si")
    private String tenCaSi;

    @Column(name = "que_quan")
    private String queQuan;

    @Column(name = "tuoi")
    private Integer tuoi;

    @Column(name = "cong_ty")
    private String congTy;

    @Column(name = "sdt")
    private String sdt;

    @Column(name = "gioi_tinh")
    private Integer gioiTinh;



}


//    CREATE TABLE [dbo].[ca_si] (
//        [id] int  IDENTITY(1,1) NOT NULL,
//        [ten_ca_si] nvarchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
//        [que_quan] nvarchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
//        [tuoi] int  NULL,
//        [cong_ty] nvarchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
//        [sdt] varchar(20) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
//        [gioi_tinh] bit  NULL
//        )
//        GO
