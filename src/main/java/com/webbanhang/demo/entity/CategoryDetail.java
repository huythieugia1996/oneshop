package com.webbanhang.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categorydetail")
public class CategoryDetail {

    @Id
    @Column(name = "CATEGORYDETAIL_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int categoryDetailId;

    @Column(name = "CATEGORYDETAIL_NAME")
    private String categoryDetailName;

    @Column(name = "CATEGORYDETAIL_STATUS")
    private int categoryDetailStauts;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CATEGORY_ID")
    private Category categoryId;

}
