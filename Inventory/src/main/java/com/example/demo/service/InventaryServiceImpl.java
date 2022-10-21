package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.InventatyEntity;
import com.example.demo.repository.InventoryRepository;

@Service
public class InventaryServiceImpl implements InventaryService{
	
	@Autowired
	private InventoryRepository inventoryRepository;
	
	@Override
	public List<InventatyEntity>  findInventaty()
	{
		return inventoryRepository.finAllInventory();
		
	}
	
	@Override
	public InventatyEntity saveInventoty(InventatyEntity inventatyEntity)
	{
		return inventoryRepository.saveInventoty(inventatyEntity.getNombre(),inventatyEntity.getApePat(),
												 inventatyEntity.getApeMat(),inventatyEntity.getNoEmpl());
		
	}
	

}
