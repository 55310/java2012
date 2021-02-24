package com.swcodingschool.Exshop.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QExshop is a Querydsl query type for Exshop
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QExshop extends EntityPathBase<Exshop> {

    private static final long serialVersionUID = 773593230L;

    public static final QExshop exshop = new QExshop("exshop");

    public final StringPath pdes = createString("pdes");

    public final StringPath pname = createString("pname");

    public final NumberPath<Long> pnum = createNumber("pnum", Long.class);

    public final NumberPath<Long> pprice = createNumber("pprice", Long.class);

    public QExshop(String variable) {
        super(Exshop.class, forVariable(variable));
    }

    public QExshop(Path<? extends Exshop> path) {
        super(path.getType(), path.getMetadata());
    }

    public QExshop(PathMetadata metadata) {
        super(Exshop.class, metadata);
    }

}

