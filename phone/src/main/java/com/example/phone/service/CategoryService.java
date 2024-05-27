package com.example.phone.service;

import java.util.List;
import java.util.Optional;

import com.example.phone.dto.CategoryRequestDto;
import com.example.phone.entity.CategoryEntity;

public interface CategoryService {

	Optional<CategoryEntity> findById(Integer id);
	List<CategoryEntity> findAll();
	
	void store(CategoryRequestDto input);
	void delete(Integer id);
}
