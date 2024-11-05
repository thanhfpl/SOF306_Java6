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
@Table(name = "chuc_vu")
public class ChucVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "")
    private Long id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

}


//
//    CREATE TABLE [dbo].[chuc_vu] (
//        [id] int  IDENTITY(1,1) NOT NULL,
//        [ma] varchar(20) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
//        [ten] nvarchar(50) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL
//        )
//        GO
