package com.example.demo.model.request;


import com.example.demo.entity.ChucVu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NhanVienRequest {

    private Long id;

    private String ma;

    private String hoVaTen;

    private String gioiTinh;

    private String diaChi;

    private ChucVu chucVu;

    

}
