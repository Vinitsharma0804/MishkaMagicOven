package com.org.mmo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="products")
public class ProductEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Prod_Id")
    private int prodId;
    
	@Column(name = "Prod_Cat", nullable = false)
    private String prodCat;
	
	@Column(name = "Prod_Name", nullable = false)
    private String prodName;
	
	@Column(name = "Prod_Desc")
    private String prodDesc;
	
    @Column(name = "Allergens")
    private String allergens;
    
    @Column(name = "Prod_Price")
    private int prodPrice;

    @Column(name = "Availibilty", nullable = false)
    private String availibilty;

}
