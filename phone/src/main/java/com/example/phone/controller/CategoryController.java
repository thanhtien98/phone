package com.example.phone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.phone.dto.CategoryRequestDto;
import com.example.phone.entity.CategoryEntity;
import com.example.phone.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	
	@GetMapping()
	public ResponseEntity<?> findAll() {
		List<CategoryEntity> res = categoryService.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(res);
	}
	
	@PostMapping()
	public ResponseEntity<?> save(@RequestBody CategoryRequestDto requestDto) {
		categoryService.store(requestDto);
		return ResponseEntity.status(HttpStatus.OK).body("Create success!");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id){
		categoryService.findById(id).orElseThrow(() -> new RuntimeException("Id not found"));
		return ResponseEntity.status(HttpStatus.OK).body("Delete success!");
	}
}
