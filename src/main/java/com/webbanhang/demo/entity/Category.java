package com.webbanhang.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
@Getter @Setter @NoArgsConstructor
public class Category {

    @Id
    @Column(name = "CATEGORY_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int categoryId;

    @Column(name = "CATEGORY_NAME")
    private String categoryName;

    @Column(name = "CATEGORY_STATUS")
    private int categoryStatus;

    @OneToMany(mappedBy = "CATEGORY_ID")
    private List<CategoryDetail> categoryDetails;
}
