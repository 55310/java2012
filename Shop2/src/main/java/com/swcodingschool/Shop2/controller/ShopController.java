package com.swcodingschool.Shop2.controller;

import com.swcodingschool.Shop2.dto.PageRequestDTO;
import com.swcodingschool.Shop2.dto.ShopDTO;
import com.swcodingschool.Shop2.service.ShopService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
@Log4j2
public class ShopController {

    private final ShopService service;

    public ShopController(ShopService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(){

        return "redirect:/shop/list";
    }

    @GetMapping("/list")
    public void list(PageRequestDTO pageRequestDTO, Model model) {

        log.info("list.............." + pageRequestDTO);

        model.addAttribute("result", service.getList(pageRequestDTO));


    }

    @GetMapping("/info")
    public void read(long pnum, @ModelAttribute("requestDTO") PageRequestDTO requestDTO, Model model) {
        log.info("pnum : " + pnum);
        ShopDTO dto = service.read(pnum);
        model.addAttribute("dto", dto);
    }


    @GetMapping("/login")
    public void login(PageRequestDTO pageRequestDTO, Model model) {

        log.info("list.............." + pageRequestDTO);

        model.addAttribute("result", service.getList(pageRequestDTO));


    }

    @GetMapping("/signup")
    public void signup(PageRequestDTO pageRequestDTO, Model model) {

        log.info("list.............." + pageRequestDTO);

        model.addAttribute("result", service.getList(pageRequestDTO));


    }

    @GetMapping("/cart")
    public void cart(PageRequestDTO pageRequestDTO, Model model) {

        log.info("list.............." + pageRequestDTO);

        model.addAttribute("result", service.getList(pageRequestDTO));


    }

}
