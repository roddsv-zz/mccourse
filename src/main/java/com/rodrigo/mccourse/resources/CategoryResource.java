package com.rodrigo.mccourse.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.mccourse.domain.Category;

@RestController //indica que a classe é um controlador do padrão REST
@RequestMapping(value="categories") //Define um endpoint para a aplicação do controlador REST
public class CategoryResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Category> toList() {
		
		Category cat1 = new Category(1, "Informática");
		Category cat2 = new Category(2, "Escritório");
		
		List<Category> list = new ArrayList<Category>();
		list.add(cat1);
		list.add(cat2);
		
		return list;
	}
}
