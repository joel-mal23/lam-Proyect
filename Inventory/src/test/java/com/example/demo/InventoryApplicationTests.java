package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.InventatyEntity;
import com.example.demo.repository.InventoryRepository;

@SpringBootTest
@Transactional
class InventoryApplicationTests {
	/*
	List<InventatyEntity> lista;

	@Autowired
	private InventoryRepository repository;
	
	@Test
	void contextLoads() {
		
		lista =  repository.finAllInventory();
		for (InventatyEntity object : lista) {
			System.out.println( "esto devuelve" +  object.toString());
		}
		
		
	}
*/
}
