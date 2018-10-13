package com.webbanhang.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
@Getter @Setter @NoArgsConstructor
public class Orders {

    @Id
    @Column(name = "ORDERS_ID")
    private int ordersId;

    @Column(name = "ORDERS_DATE")
    private Date ordersDate;

    @Column(name = "ORDERS_NAME")
    private String ordersName;

    @Column(name = "ORDERS_ADDRESS")
    private String ordersAddress;

    @Column(name = "ORDERS_PHONE")
    private String ordersPhone;

    @Column(name = "ORDERS_TOTAL")
    private Long ordersTotal;

    @Column(name = "ORDERS_STATUS")
    private int ordersStatus;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customerId;
}
