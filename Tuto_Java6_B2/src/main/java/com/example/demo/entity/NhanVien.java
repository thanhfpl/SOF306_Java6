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
@Table(name = "nhan_vien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    @Column(name = "ten_dem")
    private String tenDem;

    @Column(name = "ho")
    private String ho;

    @Column(name = "gioi_tinh")
    private String gioiTinh;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "sdt")
    private String sdt;

    @Column(name = "mat_khau")
    private String matKhau;

    @ManyToOne
    @JoinColumn(name = "id_cv")
    private ChucVu chucVu;

    @Column(name = "trang_thai")
    private Integer trang_thai;


}



//    CREATE TABLE nhan_vien] (
//        [id] int  IDENTITY(1,1) NOT NULL,
//        [ma] varchar(20) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
//        [ten] nvarchar(30) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
//        [ten_dem] nvarchar(30) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
//        [ho] nvarchar(30) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
//        [gioi_tinh] nvarchar(10) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
//        [dia_chi] nvarchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
//        [sdt] varchar(30) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
//        [mat_khau] varchar(50) COLLATE SQL_Latin1_General_CP1_CI_AS  NULL,
//        [id_cv] int  NULL,
//        [trang_thai] int  NULL
//        )
//        GO
