package com.swcodingschool.Shop.service;


import com.swcodingschool.Shop.dto.PageRequestDTO;
import com.swcodingschool.Shop.dto.PageResultDTO;
import com.swcodingschool.Shop.dto.ShopDTO;
//import com.swcodingschool.Shop.entity.Shop;
import com.swcodingschool.Shop.entity.Shop;
import com.swcodingschool.Shop.repository.ShopRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.function.Function;

@Service
@Log4j2
@RequiredArgsConstructor
public class ShopServiceImpl implements ShopService{


    private final ShopRepository repository;

    @Override
    public Long register(ShopDTO dto) {
        log.info("DTO.....................");
        log.info(dto);
        Shop entity = dtoToEntity(dto);
        log.info(entity);
        repository.save(entity);
        return entity.getPnum();
    }

    @Override
    public PageResultDTO<ShopDTO, Shop> getList(PageRequestDTO requestDTO) {
        Pageable pageable = requestDTO.getPageable(Sort.by("pnum").descending());

        Page<Shop> result = repository.findAll(pageable);

        Function<Shop, ShopDTO> fn = (entity -> entityToDto(entity));

        return new PageResultDTO<>(result, fn);
    }

    @Override
    public ShopDTO read(Long pnum) {
        Optional<Shop> result = repository.findById(pnum);
        return result.isPresent()? entityToDto(result.get()):null;
    }
}


