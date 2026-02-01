package com.org.mmo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class OrdItemsId implements Serializable {

    @Column(name = "Ord_Id", nullable = false)
    private int ordId;

    @Column(name = "Prod_Id", nullable = false)
    private int prodId;
}