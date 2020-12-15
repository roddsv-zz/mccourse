package com.rodrigo.mccourse.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigo.mccourse.domain.Category;
import com.rodrigo.mccourse.repositories.CategoryRepository;

//Os services são usados para operações de consultas.

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repo;
	
	public Category toSearch(Integer id) {
		
		Optional<Category> obj = repo.findById(id);
		return obj.orElse(null);
			
	}
}		
		/*agora ele vai chamar um objeto do repository para ele ir ao Banco de Dados e consultar, para isso ele usa um @Autowired;*/
		



