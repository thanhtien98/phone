package com.example.phone.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.phone.dto.CategoryRequestDto;
import com.example.phone.entity.CategoryEntity;
import com.example.phone.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public Optional<CategoryEntity> findById(Integer id) {
		return categoryRepo.findById(id);
	}

	@Override
	public List<CategoryEntity> findAll() {
		// TODO Auto-generated method stub
		return categoryRepo.findAll();
	}

	@Override
	public void store(CategoryRequestDto input) {
		CategoryEntity categoryEntity = convert(input);
		categoryRepo.save(categoryEntity);
	}

	@Override
	public void delete(Integer id) {
		categoryRepo.deleteById(id);
	}
	
	private CategoryEntity convert(CategoryRequestDto input) {
		return modelMapper.map(input, CategoryEntity.class);
	}
	
}
