package com.org.mmo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Ord_Items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrdItemsEntity {

    @EmbeddedId
    private OrdItemsId id;

    @Column(name = "Prod_Cat", nullable = false, length = 255)
    private String prodCat;

    @Column(name = "Quantity", nullable = false)
    private int quantity;

    @Column(name = "Customisation", length = 255)
    private String customisation;

    @Column(name = "Prod_Cost", nullable = false)
    private int prodCost;

    @Column(name = "Customisation_Charges", nullable = false)
    private int customisationCharges = 0;

    @Column(name = "Urgency_Charges", nullable = false)
    private int urgencyCharges = 0;

    @Column(name = "Total_Cost", nullable = false)
    private int totalCost;

    @Column(name = "Order_Status", length = 255)
    private String orderStatus;

    @Column(name = "Expected_Timestamp")
    private LocalDateTime expectedTimestamp;

    @Column(name = "Delivery_Timestamp")
    private LocalDateTime deliveryTimestamp;
}
