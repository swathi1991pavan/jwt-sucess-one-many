/*package com.example.employee.jpa.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	@Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)  
    private int addressId;    
	
    
	private String city;
	
	private String state; 
	
    private int pincode; 
    
    @OneToOne(cascade=CascadeType.ALL)  
    private Employee employee; 
   
    public int getAddressId() {  
        return addressId;  
    }  
    public void setAddressId(int addressId) {  
        this.addressId = addressId;  
    }  
    
    public String getCity() {  
        return city;  
    }  
    public void setCity(String city) {  
        this.city = city;  
    }  
    public String getState() {  
        return state;  
    }  
    public void setState(String state) {  
        this.state = state;  
    }  
    
    public int getPincode() {  
        return pincode;  
    }  
    public void setPincode(int pincode) {  
        this.pincode = pincode;  
    }  
    public Employee getEmployee() {  
        return employee;  
    }  
    public void setEmployee(Employee employee) {  
        this.employee = employee;  
    }    
} */ 

