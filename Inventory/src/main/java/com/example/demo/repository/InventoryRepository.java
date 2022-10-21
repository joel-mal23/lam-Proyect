package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;

import com.example.demo.entity.InventatyEntity;

public interface InventoryRepository extends JpaRepository<InventatyEntity, Integer>{
	
	
	@Procedure(value= "SP_INVENTARY_GET") 
	public List<InventatyEntity> finAllInventory();
	
	@Procedure(value= "SP_INVENTARY_POST")
	public InventatyEntity saveInventoty(@Param("nombre") String nombre, @Param("apePat") String apePat,
											   @Param("apeMat") String apeMat, @Param("numEmpl") int numEmpl);

	

}
