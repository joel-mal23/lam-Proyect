package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import com.example.demo.entity.InventatyEntity;

public interface InventoryRepository extends JpaRepository<InventatyEntity, Integer>{
	
	
	@Procedure(value= "SP_INVENTARY_CONS")
	public List<InventatyEntity> finAllInventory();

}
