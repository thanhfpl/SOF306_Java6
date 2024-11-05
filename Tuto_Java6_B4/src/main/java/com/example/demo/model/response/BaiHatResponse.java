package com.example.demo.model.response;

import com.example.demo.entity.CaSi;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BaiHatResponse {

    private Long id;

    private String tenBaiHat;

    private String tenTacGia;

    private Integer thoiLuong;

    private Date ngaySanXuat;

    private float gia;

    private String tenCaSi;

    private String queQuan;

    private Date ngayRaMat;


}
