package com.swcodingschool.Exshop.service;

import com.swcodingschool.Exshop.dto.PageRequestDTO;
import com.swcodingschool.Exshop.dto.PageResultDTO;
import com.swcodingschool.Exshop.dto.ExshopDTO;
import com.swcodingschool.Exshop.entity.Exshop;

public interface ExshopService {
    Long register(ExshopDTO pnum);

    PageResultDTO<ExshopDTO, Exshop> getList(PageRequestDTO requestDTO);

    ExshopDTO read(Long pnum);

    default Exshop dtoToEntity(ExshopDTO dto) {
        Exshop entity = Exshop.builder()
                .pnum(dto.getPnum())
                .pname(dto.getPname())
                .pprice(dto.getPprice())
                .pdes(dto.getPdes())
                .build();
        return entity;
    }

    default ExshopDTO entityToDto(Exshop entity) {

        ExshopDTO dto = ExshopDTO.builder()
                .pnum(entity.getPnum())
                .pname(entity.getPname())
                .pprice(entity.getPprice())
                .pdes(entity.getPdes())
                .build();

        return dto;
    }

}
