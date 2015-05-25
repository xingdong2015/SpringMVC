package com.mishu.cgwy.domain;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


@Entity
@Table(name = "cgwy_order")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal total = BigDecimal.ZERO;
    private BigDecimal subTotal = BigDecimal.ZERO;

    private BigDecimal shipping = BigDecimal.ZERO;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private int status;

    private Date submitDate;

    @Temporal(TemporalType.DATE)
    private Date expectedArrivedDate;

    @OneToMany(cascade = {CascadeType.ALL}, orphanRemoval = true)
    @JoinColumn(name = "order_id")
    private List<OrderItem> orderItems = new ArrayList<OrderItem>();

    private String memo = "";

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;



    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", total=" + total +
                ", subTotal=" + subTotal +
                ", shipping=" + shipping +
                ", customer=" + customer +
                ", status=" + status +
                ", submitDate=" + submitDate +
                ", expectedArrivedDate=" + expectedArrivedDate +
                ", restaurant=" + restaurant + '\'' +
                '}';
    }
}
