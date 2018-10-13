package com.webbanhang.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
@Getter @Setter @NoArgsConstructor
public class Admin {

    @Id
    @Column(name = "ADMIN_USERNAME")
    private String adminUserName;

    @Column(name = "ADMIN_PASSWORD")
    private String adminPassword;

    @Column(name = "ADMIN_STATUS")
    private int adminStatus;
}
