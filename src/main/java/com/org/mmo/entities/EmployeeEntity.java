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
@Table(name="employees")
public class EmployeeEntity {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Emp_Id")
    private int empId;
    
    @Column(name = "Emp_Name", nullable = false)
    private String empName;

    @Column(name = "Contact_No", nullable = false)
    private int contactNo;

    @Column(name = "Email_Id", nullable = false)
    private String emailId;

    @Column(name = "Address", nullable = false)
    private String address;

    @Column(name = "Reward_Points")
    private int rewardPoints;
	
}
