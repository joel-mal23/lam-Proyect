package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.InventatyEntity;

public interface InventaryService {

	List<InventatyEntity> findInventaty();

	InventatyEntity saveInventoty(InventatyEntity inventatyEntity);
	
}
