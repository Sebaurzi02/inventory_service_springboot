package com.service3.inventory_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String skuCode;
	private Integer quantity;
	
	
	public Inventory() {
		
	}
	
	public Inventory(Long id , String skuCode, Integer quantity) {
		this.id = id;
		this.skuCode = skuCode;
		this.quantity = quantity;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public String getSkuCode() {
		return this.skuCode;
	}
	
	public Integer getQuantity() {
		return this.quantity;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	

}
