package com.swcodingschool.Shop.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Shop {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long pnum;

    @Column(length = 100, nullable = false)
    private String pname;

    @Column(length = 1500, nullable = false)
    private Long pprice;

    @Column(length = 50, nullable = false)
    private String pdes;

}
