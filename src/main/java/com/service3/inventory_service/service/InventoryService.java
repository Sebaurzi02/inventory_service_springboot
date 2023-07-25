package com.service3.inventory_service.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.service3.inventory_service.repository.InventoryRepository;

@Service
public class InventoryService {
	
	private final InventoryRepository inventoryRepository;
	
	public InventoryService(InventoryRepository inventoryRepository) {
		this.inventoryRepository = inventoryRepository;
	}

	
	@Transactional(readOnly = true)
	public boolean isInStock(String skuCode) {
		return inventoryRepository.findBySkuCode().isPresent();
	}
}
