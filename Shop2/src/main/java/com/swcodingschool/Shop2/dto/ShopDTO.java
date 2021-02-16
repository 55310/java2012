package com.swcodingschool.Shop2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShopDTO {

    private Long p_num;
    private String p_name;
    private Long p_price;
    private String p_des;
}
