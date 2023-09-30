package com.capgemini.lenskart.service;

import com.capgemini.lenskart.dto.CategoryDTO;

public interface CategoryService {
	
	public String addCategory(CategoryDTO category);
	public String removeCategory(int categoryId);
	public String updateCategory(int categoryId);
	public CategoryDTO searchCategoryByName(String name);
	public CategoryDTO searchCategoryById(int id);
	

}
