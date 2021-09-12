package com.maurelllopes.projeto_loja2002.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

//RESOURCE. ESSA CAMADA É O PRÓPRIO REST. ELE AGORA SE COMUNICANDO COM CATEGORIAS

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maurelllopes.projeto_loja2002.domain.Categoria;
import com.maurelllopes.projeto_loja2002.services.CategoriaService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) throws ObjectNotFoundException{
		
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
		
	}
	

}
