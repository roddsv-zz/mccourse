package com.rodrigo.mccourse.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rodrigo.mccourse.domain.Category;
import com.rodrigo.mccourse.services.CategoryService;

@RestController //indica que a classe é um controlador do padrão REST
@RequestMapping(value="categories") //Define um endpoint para a aplicação do controlador REST
public class CategoryResource {

	@Autowired
	private CategoryService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Category obj = service.toSearch(id);
		return ResponseEntity.ok().body(obj);
		//O ResponseEntity encapsula várias resposta de um  método HTTP para um serviço REST.
		//A interrogação indica que qualquer tipo de resposta pode ser encontrada.
		//O PathVariable indica que o id será recebido pelo método lá do value do RequestMapping.
	}
}
