/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.workshop.main.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name= "may_tinh")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString 
public class MayTinh {  
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "ma")
    private String maMayTinh;
   
    @Column(name = "ten_may_tinh")
    private String tenMayTinh;
    
    @Column
    private float gia;
    
    @Column(name = "mau_sac")
    private String mauSac;
    
    @Column(name = "mieu_ta")
    private String mieuTa;
    
    @Column(name = "bo_nho")
    private String boNho;
    
    
    
    @ManyToOne
    @JoinColumn(name = "hang_id", referencedColumnName = "id")
    private Hang hang;
}


//hang_id khoa ngoai
// Join 2 bang co 2 su lua chọn;
//Mapping 1 đối tượng
//Mapping binh thuong 
//custom model 

//1 MT => N hãng
//1 hang => 1 mt 
//Many To One : 2 loai



//id BIGINT identity(1,1) NOT NULL,
//	hang_id BIGINT NULL,
//	ma varchar(20) NULL,
//	ten_may_tinh nvarchar(100) NULL,
//	gia float NULL,
//	mau_sac nvarchar(100) NULL,
//	mieu_ta nvarchar(100) NULL,