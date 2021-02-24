package com.swcodingschool.Shop.service;

import com.swcodingschool.Shop.dto.PageRequestDTO;
import com.swcodingschool.Shop.dto.PageResultDTO;
import com.swcodingschool.Shop.dto.ShopDTO;
import com.swcodingschool.Shop.entity.Shop;

public interface ShopService {
    Long register(ShopDTO pnum);

    PageResultDTO<ShopDTO, Shop> getList(PageRequestDTO requestDTO);

    ShopDTO read(Long pnum);

    default Shop dtoToEntity(ShopDTO dto) {
        Shop entity = Shop.builder()
                .pnum(dto.getPnum())
                .pname(dto.getPname())
                .pprice(dto.getPprice())
                .pdes(dto.getPdes())
                .build();
        return entity;
    }

    default ShopDTO entityToDto(Shop entity) {

        ShopDTO dto = ShopDTO.builder()
                .pnum(entity.getPnum())
                .pname(entity.getPname())
                .pprice(entity.getPprice())
                .pdes(entity.getPdes())
                .build();

        return dto;
    }

}
