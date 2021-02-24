package com.swcodingschool.Exshop.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Exshop {

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
