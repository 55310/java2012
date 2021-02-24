package com.swcodingschool.Shop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShopDTO {

    private Long pnum;
    private String pname;
    private Long pprice;
    private String pdes;

    public Long getPnum() {
        return pnum;
    }

    public String getPname() {
        return pname;
    }

    public Long getPprice() {
        return pprice;
    }

    public String getPdes() {
        return pdes;
    }
}
