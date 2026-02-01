package com.org.mmo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
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
@Table(name="customers")
public class CustomerEntity {

    @Id
    @Column(name = "User_Id")
    private int userId;
    
    /*@OneToOne
    @MapsId
    @JoinColumn(name = "User_Id")
    private UserEntity user;*/

    @Column(name = "Cust_Name", nullable = false)
    private String custName;

    @Column(name = "Contact_No", nullable = false)
    private int contactNo;

    @Column(name = "Email_Id", nullable = false)
    private String emailId;

    @Column(name = "Address", nullable = false)
    private String address;

    @Column(name = "Reward_Points")
    private int rewardPoints;

    /*public void setUser(UserEntity user) {
        this.user = user;
    }*/
	
}
