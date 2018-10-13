package com.webbanhang.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
@Getter @Setter @NoArgsConstructor
public class Customer {

    @Id
    @Column(name = "CUSTOMER_ID")
    private int customerId;

    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    @Column(name = "CUSTOMER_ADDRESS")
    private String customerAddress;

    @Column(name = "CUSTOMER_PHONE")
    private String customerphone;

    @Column(name = "CUSTOMER_USERNAME")
    private String customerUserName;

    @Column(name = "CUSTOMER_PASSWORD")
    private String customerPassword;

    @Column(name = "CUSTOMER_STATUS")
    private int customerStatus;

    @OneToMany(mappedBy = "CUSTOMER_ID")
    private List<Orders> orders;
}
