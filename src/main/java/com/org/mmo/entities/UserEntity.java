package com.org.mmo.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name="users")
public class UserEntity {

    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "User_Id")
    private int userId;

    @Column(name = "User_Type", nullable = false)
    private String userType;

    @Column(name = "Passkey", nullable = false)
    private String passkey;

    @Column(name = "Email_Id", nullable = false)
    private String emailId;

    @Column(name = "Security_Ques")
    private String securityQues;

    @Column(name = "Security_Ans")
    private String securityAns;
	
	/*@OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private CustomerEntity customer;

    // Helper to keep both sides in sync
    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
        if (customer != null) {
            customer.setUser(this);
        }
    }*/

	
}
