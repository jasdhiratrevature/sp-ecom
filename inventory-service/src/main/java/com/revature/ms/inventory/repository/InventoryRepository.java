package com.revature.ms.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.ms.inventory.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode, Integer quantity);
}