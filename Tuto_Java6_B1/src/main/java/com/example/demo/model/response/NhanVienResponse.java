package com.example.demo.model.response;


import com.example.demo.entity.ChucVu;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class NhanVienResponse {


    private Long id;

    private String ma;

    private String hoVaTen;

    private String gioiTinh;

    private String diaChi;

    private String  tenChucVu;


}
