package com.org.mmo.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Orders")
public class OrdersEntity {

    @Id
    @Column(name = "Ord_Id", nullable = false)
    private int ordId;

    @Column(name = "User_Id", nullable = false)
    private int userId;

    @Column(name = "Amt_Paid", nullable = false)
    private int amtPaid = 0;

    @Column(name = "Amt_Balance", nullable = false)
    private int amtBalance = 0;

    @Column(name = "Total_Cost", nullable = false)
    private int totalCost;

    @Column(name = "Payment_Method", length = 255)
    private String paymentMethod;

    @Column(name = "Order_Timestamp", insertable = false, updatable = false)
    private LocalDateTime orderTimestamp;
}
