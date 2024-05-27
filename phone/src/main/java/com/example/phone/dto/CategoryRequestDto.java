package com.example.phone.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryRequestDto {
	private int id; 
	private String name;
	private String description;
	private LocalDate createdAt;
	private LocalDate updatedAt;
}
