package com.example.demo.controller;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.InventaryService;
@Transactional
@RestController
@RequestMapping("/MSInventory")
public class InventoryController {
	
	
	@Autowired
	private InventaryService inventaryService; 
		
	@GetMapping
	public ResponseEntity<?> getAllInventaEntity(){
		
		return ResponseEntity.ok(inventaryService.findInventaty());
		
	}
	
	
}
