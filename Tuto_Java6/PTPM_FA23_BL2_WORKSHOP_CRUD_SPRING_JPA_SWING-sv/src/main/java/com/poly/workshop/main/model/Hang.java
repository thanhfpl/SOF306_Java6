/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.workshop.main.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity // coi ca class => 1 table => 1 thuc the 
// kh truy van sql 
// truy van truc tiep tren thuc the 
@Table(name= "hang")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString 
public class Hang {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "ma")
    private String maHang;
    
    //web => LÕI 500    DAT TEN KH DUNG CON
    @Column(name = "ten_hang")
    private String tenHang;
}
