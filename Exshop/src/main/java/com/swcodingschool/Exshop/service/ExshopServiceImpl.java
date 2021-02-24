package com.swcodingschool.Exshop.service;


import com.swcodingschool.Exshop.dto.PageRequestDTO;
import com.swcodingschool.Exshop.dto.PageResultDTO;
import com.swcodingschool.Exshop.dto.ExshopDTO;
import com.swcodingschool.Exshop.entity.Exshop;
import com.swcodingschool.Exshop.repository.ExshopRepository;
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
public class ExshopServiceImpl implements ExshopService {


    private final ExshopRepository repository;

    @Override
    public Long register(ExshopDTO dto) {
        log.info("DTO.....................");
        log.info(dto);
        Exshop entity = dtoToEntity(dto);
        log.info(entity);
        repository.save(entity);
        return entity.getPnum();
    }

    @Override
    public PageResultDTO<ExshopDTO, Exshop> getList(PageRequestDTO requestDTO) {
        Pageable pageable = requestDTO.getPageable(Sort.by("pnum").descending());

        Page<Exshop> result = repository.findAll(pageable);

        Function<Exshop, ExshopDTO> fn = (entity -> entityToDto(entity));

        return new PageResultDTO<>(result, fn);
    }

    @Override
    public ExshopDTO read(Long pnum) {
        Optional<Exshop> result = repository.findById(pnum);
        return result.isPresent()? entityToDto(result.get()):null;
    }
}


