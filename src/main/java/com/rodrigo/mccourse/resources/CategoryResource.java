package com.rodrigo.mccourse.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //indica que a classe é um controlador do padrão REST
@RequestMapping(value="categories") //Define um endpoint para a aplicação do controlador REST
public class CategoryResource {

	@RequestMapping(method=RequestMethod.GET)
	public String toList() {
		return "REST is working!";
	}
}
