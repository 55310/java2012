package com.swcodingschool.Shop2.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Shop {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long p_num;

    @Column(length = 100, nullable = false)
    private String p_name;

    @Column(length = 1500, nullable = false)
    private Long p_price;

    @Column(length = 50, nullable = false)
    private String p_des;

}
